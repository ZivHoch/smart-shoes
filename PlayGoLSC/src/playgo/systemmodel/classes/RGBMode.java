
package playgo.systemmodel.classes;

import playgo.systemmodel.Utils;
import playgo.systemmodel.classes.generated.RGBModeGenerated;


/**
 * This file was automatically generated using PlayGo system-model.
 * This class can be updated. Changes will not be overridden
 * 
 */
public class RGBMode
    extends RGBModeGenerated
{


    public RGBMode(String name, il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        super(name, playgoCoordinator);
        if(java.lang.System.getProperty("SYSTEM_MODEL_DEBUG")!=null){
        	java.lang.System.out.println(">>> constructor call: >>> create RGBMode with name: " + name);
        }
    }

    public RGBMode(il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        super(Utils.generateInstanceName("RGBMode"), (playgoCoordinator));
    }

    public RGBMode(String name, boolean init, il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        super(name, init, playgoCoordinator);
    }

}
