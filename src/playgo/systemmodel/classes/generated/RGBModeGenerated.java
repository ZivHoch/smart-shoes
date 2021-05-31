
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
public class RGBModeGenerated
    extends SMBaseClass
{

    private il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator = null;

    public RGBModeGenerated(java.lang.String name, il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        super(name);
        setCoordinator(playgoCoordinator);
        oneTimeInit();
    }

    public RGBModeGenerated(java.lang.String name, boolean init, Object playgoCoordinator) {
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
    public void activateRGB() {
        if(java.lang.System.getProperty("SYSTEM_MODEL_DEBUG")!=null){
        	java.lang.System.out.println(">>> method call: >>> activateRGB() : void .Object name: " + name);
        }
        
		//ExecutionBridge handling
        SystemModelMain.getInstance().activateMethod(("RGBMode"), (name), ("activateRGB"));
        java.util.ArrayList<String> argTypes = new java.util.ArrayList<String>();
        java.util.ArrayList<Object> argValues = new java.util.ArrayList<Object>();
        Object source = il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj!=null ? il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj : this;
        playgoCoordinator.publish((source), (source.getClass().getSimpleName()),this, this.getClass().getSimpleName(), "activateRGB", argTypes, argValues);
        il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj=null;
        return;
    }

    @SystemModelGen
    public void RGBOn() {
        if(java.lang.System.getProperty("SYSTEM_MODEL_DEBUG")!=null){
        	java.lang.System.out.println(">>> method call: >>> RGBOn() : void .Object name: " + name);
        }
        
		//ExecutionBridge handling
        SystemModelMain.getInstance().activateMethod(("RGBMode"), (name), ("RGBOn"));
        java.util.ArrayList<String> argTypes = new java.util.ArrayList<String>();
        java.util.ArrayList<Object> argValues = new java.util.ArrayList<Object>();
        Object source = il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj!=null ? il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler.srcObj : this;
        playgoCoordinator.publish((source), (source.getClass().getSimpleName()),this, this.getClass().getSimpleName(), "RGBOn", argTypes, argValues);
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
