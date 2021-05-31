
package playgo.systemmodel.classes.generated;

import il.ac.wis.cs.systemmodel.SMBaseClass;
import il.ac.wis.cs.systemmodel.SystemModelGen;
import playgo.systemmodel.SystemModelAgent;
import playgo.systemmodel.SystemModelMain;


/**
 * This file was automatically generated using PlayGo system-model.
 * This class shouldn't be changed. Any change to this class will be overridden!!!
 * 
 */
public class MusicSelectedGenerated
    extends SMBaseClass
{

    private il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator = null;
    protected int musicChosen = (0);

    public MusicSelectedGenerated(java.lang.String name, il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        super(name);
        setCoordinator(playgoCoordinator);
        oneTimeInit();
    }

    public MusicSelectedGenerated(java.lang.String name, boolean init, Object playgoCoordinator) {
        super(name);
        setCoordinator((il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator)playgoCoordinator);
        if(init)oneTimeInit();
    }

    protected void oneTimeInit() {
        ((il.ac.wis.cs.playgo.playtoolkit.AppObjects)playgoCoordinator.getAppObjects()).addObject(this);
        SystemModelAgent.getInstance().construct((getClass().getSimpleName()), (name));
         
        //GUI handling
        SystemModelMain.getInstance().getPlayable().construct((getClass().getSimpleName()), (name));
         
        Object source = il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj!=null ? il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj : this;
        java.util.ArrayList<String> argTypes = new java.util.ArrayList<String>();
        argTypes.add("String");
        java.util.ArrayList<Object> argValues = new java.util.ArrayList<Object>();
        argValues.add(name);
        playgoCoordinator.publish(
        	(source), (source.getClass().getSimpleName()), this, this.getClass().getSimpleName(), "create", argTypes, argValues);
    }

    @SystemModelGen
    public String getName() {
        return name;
    }

    public void delete() {
        ((il.ac.wis.cs.playgo.playtoolkit.AppObjects)playgoCoordinator.getAppObjects()).remove(this);
         
        SystemModelAgent.getInstance().destroy((getClass().getSimpleName()), (name));
         
        //GUI handling
        SystemModelMain.getInstance().getPlayable().destroy((getClass().getSimpleName()), (name));
        java.util.ArrayList<String> argTypes = new java.util.ArrayList<String>();
        java.util.ArrayList<Object> argValues = new java.util.ArrayList<Object>();
        Object source = il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj!=null ? il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj : this;
        playgoCoordinator.publish(source, source.getClass().getSimpleName(),this, this.getClass().getSimpleName(), "delete", argTypes, argValues);
    }

    @SystemModelGen
    public void selected() {
        if(java.lang.System.getProperty("SYSTEM_MODEL_DEBUG")!=null){
        	java.lang.System.out.println(">>> method call: >>> selected() : void .Object name: " + name);
        }
        
		//ExecutionBridge handling
        SystemModelMain.getInstance().activateMethod(("MusicSelected"), (name), ("selected"));
        java.util.ArrayList<String> argTypes = new java.util.ArrayList<String>();
        java.util.ArrayList<Object> argValues = new java.util.ArrayList<Object>();
        Object source = il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj!=null ? il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj : this;
        playgoCoordinator.publish((source), (source.getClass().getSimpleName()),this, this.getClass().getSimpleName(), "selected", argTypes, argValues);
        il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj=null;
        return;
    }

    @SystemModelGen
    public void musicPlaying() {
        if(java.lang.System.getProperty("SYSTEM_MODEL_DEBUG")!=null){
        	java.lang.System.out.println(">>> method call: >>> musicPlaying() : void .Object name: " + name);
        }
        
		//ExecutionBridge handling
        SystemModelMain.getInstance().activateMethod(("MusicSelected"), (name), ("musicPlaying"));
        java.util.ArrayList<String> argTypes = new java.util.ArrayList<String>();
        java.util.ArrayList<Object> argValues = new java.util.ArrayList<Object>();
        Object source = il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj!=null ? il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj : this;
        playgoCoordinator.publish((source), (source.getClass().getSimpleName()),this, this.getClass().getSimpleName(), "musicPlaying", argTypes, argValues);
        il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj=null;
        //GUI handling
        playgo.systemmodel.SystemModelMain.getInstance().getPlayable().
        		activateMethod("MusicSelected", name, "musicPlaying");
    }

    @SystemModelGen
    public int getMusicChosen() {
        return musicChosen;
    }

    @SystemModelGen
    public void setMusicChosen(int arg0) {
        java.util.ArrayList<String> argTypes = new java.util.ArrayList<String>();
        java.util.ArrayList<Object> argValues = new java.util.ArrayList<Object>();
        argTypes.add("int");
        argValues.add(arg0);
        Object source = il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj!=null ? il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj : this;
        playgoCoordinator.publishBefore(source, source.getClass().getSimpleName(),this, this.getClass().getSimpleName(), "setMusicChosen", argTypes, argValues);
        il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj=null;
        this.musicChosen=arg0;
        if(java.lang.System.getProperty("SYSTEM_MODEL_DEBUG")!=null){
        	java.lang.System.out.println(">>> method call: >>> setMusicChosen(int) : void .Object name: " + name);
        }
        //GUI handling
        playgo.systemmodel.SystemModelMain.getInstance().getPlayable().
        	setPropertyValue("MusicSelected", name, "musicChosen", String.valueOf(arg0));
         
        il.ac.wis.cs.playgo.playtoolkit.api.impl.java.SystemModelAgent.getInstance()
        	.setPropertyValue("MusicSelected", name, "musicChosen", String.valueOf(arg0));
        
		//ExecutionBridge handling
        SystemModelMain.getInstance().setPropertyValue(("MusicSelected"), (name), ("musicChosen"), ("int"), (String.valueOf(arg0)));
        playgoCoordinator.publish((source), (source.getClass().getSimpleName()),this , this.getClass().getSimpleName(), "setMusicChosen", argTypes, argValues);
        il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj=null;
    }

    @SystemModelGen
    public void pgInitMusicChosen(int arg0) {
        this.musicChosen=arg0;
         
        il.ac.wis.cs.playgo.playtoolkit.api.impl.java.SystemModelAgent.getInstance()
        	.setPropertyValue("MusicSelected", name, "musicChosen", String.valueOf(arg0));
    }

    @SystemModelGen
    public void selectMusic() {
        if(java.lang.System.getProperty("SYSTEM_MODEL_DEBUG")!=null){
        	java.lang.System.out.println(">>> method call: >>> selectMusic() : void .Object name: " + name);
        }
        
		//ExecutionBridge handling
        SystemModelMain.getInstance().activateMethod(("MusicSelected"), (name), ("selectMusic"));
        java.util.ArrayList<String> argTypes = new java.util.ArrayList<String>();
        java.util.ArrayList<Object> argValues = new java.util.ArrayList<Object>();
        Object source = il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj!=null ? il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj : this;
        playgoCoordinator.publish((source), (source.getClass().getSimpleName()),this, this.getClass().getSimpleName(), "selectMusic", argTypes, argValues);
        il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj=null;
        return;
    }
    
	public void setCoordinator(il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator coordinator) {
		playgoCoordinator=coordinator;
	}

	public il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator getCoordinator() {
		return playgoCoordinator;
	}


}
