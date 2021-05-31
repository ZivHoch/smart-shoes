
package playgo.systemmodel.classes;

import playgo.systemmodel.Utils;
import playgo.systemmodel.classes.generated.HardSurfaceModeGenerated;


/**
 * This file was automatically generated using PlayGo system-model.
 * This class can be updated. Changes will not be overridden
 * 
 */
public class HardSurfaceMode
    extends HardSurfaceModeGenerated
{


    public HardSurfaceMode(String name, il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        super(name, playgoCoordinator);
        if(java.lang.System.getProperty("SYSTEM_MODEL_DEBUG")!=null){
        	java.lang.System.out.println(">>> constructor call: >>> create HardSurfaceMode with name: " + name);
        }
    }

    public HardSurfaceMode(il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        super(Utils.generateInstanceName("HardSurfaceMode"), (playgoCoordinator));
    }

    public HardSurfaceMode(String name, boolean init, il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        super(name, init, playgoCoordinator);
    }

}
