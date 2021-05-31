
package playgo.systemmodel.classes;

import il.ac.wis.cs.systemmodel.SystemModelGen;
import playgo.systemmodel.classes.generated.EnvGenerated;


/**
 * This file was automatically generated using PlayGo system-model.
 * This class can be updated. Changes will not be overridden
 * 
 */
public class Env
    extends EnvGenerated
{


    public Env(String name, il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        super(name, playgoCoordinator);
        if(java.lang.System.getProperty("SYSTEM_MODEL_DEBUG")!=null){
        	java.lang.System.out.println(">>> constructor call: >>> create Env with name: " + name);
        }
    }

    public Env(String name, boolean init, il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        super(name, init, playgoCoordinator);
    }

    @SystemModelGen
    public void noop() {
        if(java.lang.System.getProperty("SYSTEM_MODEL_DEBUG")!=null){
        	java.lang.System.out.println(">>> method call: >>> noop .Object name: " + name);
        }
        return ;
    }

}
