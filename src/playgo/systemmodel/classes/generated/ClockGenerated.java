
package playgo.systemmodel.classes.generated;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Timer;
import il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler;
import il.ac.wis.cs.playgo.playtoolkit.api.impl.file.PlayGoFileAgent;
import il.ac.wis.cs.playgo.playtoolkit.api.impl.tcp.PlayGoTcpAgent;
import il.ac.wis.cs.playgo.playtoolkit.api.intf.IPlayGo;
import il.ac.wis.cs.playgo.playtoolkit.api.intf.IPlayable;
import il.ac.wis.cs.playgo.playtoolkit.container.PlayableFramework;
import il.ac.wis.cs.s2a.runtime.Utils;
import il.ac.wis.cs.systemmodel.SMBaseClass;
import il.ac.wis.cs.systemmodel.SystemModelGen;


/**
 * This file was automatically generated using PlayGo system-model.
 * This class shouldn't be changed. Any change to this class will be overridden!!!
 * 
 */
public class ClockGenerated
    extends SMBaseClass
{

    private il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator = null;
    private static long time = (0);
    private static String stringTime = ("0");
    private static String timeFormat = ("HH:mm:ss");
    private static Timer timer = (null);
    private static Runnable clockRunnable = (null);
    private static int tickInterval = (0);
    private static boolean autoTick = (false);
    private static boolean startFromSysTime = (false);
    private static boolean stopClock = (true);
    private boolean firstTime = true;

    public ClockGenerated(java.lang.String name, il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        super(name);
        il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator coordinator = (il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator)playgoCoordinator;
         ((il.ac.wis.cs.playgo.playtoolkit.AppObjects)coordinator.getAppObjects()).addObject(this);
        Properties properties = new Properties();
        java.lang.String runtimePropertiesPath = Utils.getRuntimePropertiesPath();
        try {
            properties.load(new java.io.FileInputStream(runtimePropertiesPath));
        } catch (FileNotFoundException _x) {
            _x.printStackTrace();
        } catch (IOException _x) {
            _x.printStackTrace();
        }
        tickInterval=1000;
        if ((properties.getProperty("clockTickInterval") !=null)) {
            tickInterval = Integer.parseInt(properties.getProperty("clockTickInterval"));
        }
        autoTick=true;
        if ((properties.getProperty("clockAutoTicks") !=null)) {
            autoTick= Boolean.parseBoolean(properties.getProperty("clockAutoTicks"));
        }
        startFromSysTime= Boolean.parseBoolean(properties.getProperty("clockStartFromSysTime"));
        timeFormat= properties.getProperty("stringTimeFormat");
        setCoordinator(playgoCoordinator);
        oneTimeInit();
    }

    protected void oneTimeInit() {
        ((il.ac.wis.cs.playgo.playtoolkit.AppObjects)playgoCoordinator.getAppObjects()).addObject(this);
    }

    @SystemModelGen
    public static long getTime() {
        return time;
    }

    @SystemModelGen
    public String getName() {
        return name;
    }

    @SystemModelGen
    public static String getStringTime() {
        return stringTime;
    }

    @SystemModelGen
    public static int getTickInterval() {
        return tickInterval;
    }

    @SystemModelGen
    public static boolean isAutoTick() {
        return autoTick;
    }

    @SystemModelGen
    public static boolean getAutoTick() {
        return autoTick;
    }

    @SystemModelGen
    public void setTickInterval(int arg0) {
        if ((tickInterval!=arg0)) {
            tickInterval=arg0;
        }
        initTimer();
        System.out.println(">>> method call: >>> setTickInterval(int) : void");
    }

    @SystemModelGen
    public void tick() {
        time = time + tickInterval;

        formatStringTime();
        //System.out.println(">>> method call: >>> tick() : void, time = " + time);
        
		//ExecutionBridge handling
        playgo.systemmodel.SystemModelMain.getInstance().
        	clockTick(tickInterval);

        playgoCoordinator.publishTick();
        playgoCoordinator.publish(this, getName(), this, getName(), "tick", new java.util.ArrayList<String>(), new java.util.ArrayList<Object>());
        il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj=null;
        return ;
    }

    @SystemModelGen
    private void formatStringTime() {
        java.text.SimpleDateFormat format = null;
        try {
            format = new java.text.SimpleDateFormat(timeFormat);
        } catch (Exception _x) {
            format = new java.text.SimpleDateFormat("HH:mm:ss");
        }
        java.util.Date d = new java.util.Date(time);
        stringTime = format.format(d);
    }

    @SystemModelGen
    public void start() {
        if (startFromSysTime) {
            time = (System.currentTimeMillis());
        } else {
            time = (0);
        }
        formatStringTime();
        System.out.println(">>> starting timer >>>");
        stopClock=false;
        System.out.println(">>> method call: >>> start() : void");
        return ;
    }

    @SystemModelGen
    public void stop() {
        stopClock=true;
        System.out.println(">>> method call: >>> stop() : void");
        return ;
    }

    @SystemModelGen
    public void restart() {
        stop();
        start();
        System.out.println(">>> method call: >>> restart() : void");
        return ;
    }

    @SystemModelGen
    public void initTimer() {
        if ((clockRunnable==null)) {
            clockRunnable = new Runnable() {
            	@Override
            	public void run() {
            		if(!stopClock){
            			//tick();
            IPlayGo smm;
            IPlayable playable;
            PlayGoTcpAgent pta;
            PlayGoFileAgent pfa;
            SyncMessageHandler smh;
            PlayableFramework pf;
             
            smm = il.ac.wis.cs.playgo.playtoolkit.api.impl.java.SystemModelPlayGo.getInstance();
            playable = smm.getPlayable();
            if(playable instanceof PlayGoTcpAgent || playable instanceof PlayGoFileAgent){
            	SyncMessageHandler.getInstance().clockTick(tickInterval);
            }
            else if(playable instanceof PlayableFramework){
            	pf = (PlayableFramework)playable;
            	pf.clockTick(tickInterval);
            }
            		}
            	}
            };
        }
        if ((timer!=null)) {
            timer.cancel();
            timer.purge();
            timer = null;
        }
        timer = new Timer();
        timer.scheduleAtFixedRate(new java.util.TimerTask() {
         @Override
        public void run() { 
        clockRunnable.run(); 
        }
        },500,tickInterval);
    }

    @SystemModelGen
    public void startTimer() {
        if ((!firstTime)) {
            return ;
        }
        this.initTimer();
        if ((this.isAutoTick())) {
            this.start();
        }
        firstTime = false;
    }
    
	public void setCoordinator(il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator coordinator) {
		playgoCoordinator=coordinator;
	}

	public il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator getCoordinator() {
		return playgoCoordinator;
	}


}
