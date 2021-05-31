
package playgo.systemmodel.classes;

import il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator;
import playgo.systemmodel.classes.generated.ClockGenerated;


/**
 * This file was automatically generated using PlayGo system-model.
 * This class can be updated. Changes will not be overridden
 * 
 */
public class Clock
    extends ClockGenerated
{


    public Clock(String name, PlaygoCoordinator playgoCoordinator) {
        super(name, playgoCoordinator);
        if(java.lang.System.getProperty("SYSTEM_MODEL_DEBUG")!=null){
        	java.lang.System.out.println(">>> constructor call: >>> create Clock with name: " + name);
        }
    }

}
