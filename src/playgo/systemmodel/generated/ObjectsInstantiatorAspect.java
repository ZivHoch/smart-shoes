
package playgo.systemmodel.generated;

import il.ac.wis.cs.playgo.playtoolkit.AppObjects;
import playgo.systemmodel.classes.Battery;
import playgo.systemmodel.classes.Clock;
import playgo.systemmodel.classes.Env;
import playgo.systemmodel.classes.HardSurfaceMode;
import playgo.systemmodel.classes.MusicMode;
import playgo.systemmodel.classes.MusicSelected;
import playgo.systemmodel.classes.RGBMode;
import playgo.systemmodel.classes.RunningSurfaceMode;
import playgo.systemmodel.classes.ShockabserverSurfaceMode;
import playgo.systemmodel.classes.SneakersMode;
import playgo.systemmodel.classes.SurvivalMode;
import playgo.systemmodel.classes.WaterproofSurfaceMode;
import playgo.systemmodel.classes.shoesConnectedToSpotify;


/**
 * This file was automatically generated using PlayGo system-model.
 * This class shouldn't be changed. Any change to this class will be overridden!!!
 * 
 */
public class ObjectsInstantiatorAspect {

    public boolean smFirstTime = true;
    public boolean appFirstTime = true;
    private AppObjects appObjects = null;

    public ObjectsInstantiatorAspect() {
    }

    public AppObjects getAppObjects() {
        return appObjects;
    }

    public void createObjects(il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator playgoCoordinator) {
        if (appFirstTime) {
        	appFirstTime = false;
        	instantiateExecutionBridges();
        	if(AppObjects.getCurrent() == null){
        		appObjects = new AppObjects();
        		AppObjects.setCurrent(appObjects);
        		playgoCoordinator.setAppObjects(appObjects);
        		createSystemModelObjects(playgoCoordinator);
        	}
        }
    }

    private void createSystemModelObjects(il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator coordinator) {
        try {
            Object object = null;
            object = new MusicMode("musicMode", coordinator);
            appObjects.addObject(object);
            object = new MusicSelected("musicSelected", coordinator);
            appObjects.addObject(object);
            object = new shoesConnectedToSpotify("shoesConnectedToSpotify", coordinator);
            appObjects.addObject(object);
            object = new RGBMode("rGBMode", coordinator);
            appObjects.addObject(object);
            object = new SneakersMode("sneakersMode", coordinator);
            appObjects.addObject(object);
            object = new RunningSurfaceMode("runningSurfaceMode", coordinator);
            appObjects.addObject(object);
            object = new WaterproofSurfaceMode("waterproofSurfaceMode", coordinator);
            appObjects.addObject(object);
            object = new ShockabserverSurfaceMode("shockabserverSurfaceMode", coordinator);
            appObjects.addObject(object);
            object = new HardSurfaceMode("hardSurfaceMode", coordinator);
            appObjects.addObject(object);
            object = new SurvivalMode("survivalMode", coordinator);
            appObjects.addObject(object);
            object = new Battery("battery", coordinator);
            appObjects.addObject(object);
            object = new Clock("Clock", coordinator);
            appObjects.addObject(object);
            object = new Env("Env", coordinator);
            appObjects.addObject(object);
            object = new Env("User", coordinator);
            appObjects.addObject(object);
        } catch (Exception _x) {
            _x.printStackTrace();
        }
    }

    public void instantiateExecutionBridges() {
        il.ac.wis.cs.playgo.ee.sct.ExecutionBridge2SCT.getInstance();
    }

}
