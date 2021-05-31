
package playgo.systemmodel.generated;

import il.ac.wis.cs.playgo.playtoolkit.api.impl.java.SystemModelPlayGo;
import playgo.systemmodel.SystemModelMain;
import playgo.systemmodel.classes.HardSurfaceMode;
import playgo.systemmodel.classes.MusicSelected;
import playgo.systemmodel.classes.RunningSurfaceMode;
import playgo.systemmodel.classes.ShockabserverSurfaceMode;
import playgo.systemmodel.classes.SneakersMode;
import playgo.systemmodel.classes.SurvivalMode;
import playgo.systemmodel.classes.WaterproofSurfaceMode;


/**
 * This file was automatically generated using PlayGo system-model.
 * This class shouldn't be changed. Any change to this class will be overridden!!!
 * 
 */
public class SystemModelMainGenerated
    extends SystemModelPlayGo
{


    public void runBThreads() {
    }

    @Override
    public void appIsUp() {
        try {
            Object object = null;
            String retval = null;
             
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("musicMode", "MusicMode");
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("musicSelected", "MusicSelected");
            retval = SystemModelMain.getInstance().getPlayable().getPropertyValue("MusicSelected", "musicSelected", "musicChosen");
            if ((retval!=null)) {
                ((MusicSelected) object).pgInitMusicChosen((Integer.valueOf(retval)));
            }
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("shoesConnectedToSpotify", "shoesConnectedToSpotify");
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("rGBMode", "RGBMode");
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("sneakersMode", "SneakersMode");
            retval = SystemModelMain.getInstance().getPlayable().getPropertyValue("SneakersMode", "sneakersMode", "status");
            if ((retval!=null)) {
                ((SneakersMode) object).pgInitStatus((retval));
            }
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("runningSurfaceMode", "RunningSurfaceMode");
            retval = SystemModelMain.getInstance().getPlayable().getPropertyValue("RunningSurfaceMode", "runningSurfaceMode", "status");
            if ((retval!=null)) {
                ((RunningSurfaceMode) object).pgInitStatus((retval));
            }
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("waterproofSurfaceMode", "WaterproofSurfaceMode");
            retval = SystemModelMain.getInstance().getPlayable().getPropertyValue("WaterproofSurfaceMode", "waterproofSurfaceMode", "status");
            if ((retval!=null)) {
                ((WaterproofSurfaceMode) object).pgInitStatus((retval));
            }
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("shockabserverSurfaceMode", "ShockabserverSurfaceMode");
            retval = SystemModelMain.getInstance().getPlayable().getPropertyValue("ShockabserverSurfaceMode", "shockabserverSurfaceMode", "status");
            if ((retval!=null)) {
                ((ShockabserverSurfaceMode) object).pgInitStatus((retval));
            }
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("hardSurfaceMode", "HardSurfaceMode");
            retval = SystemModelMain.getInstance().getPlayable().getPropertyValue("HardSurfaceMode", "hardSurfaceMode", "status");
            if ((retval!=null)) {
                ((HardSurfaceMode) object).pgInitStatus((retval));
            }
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("survivalMode", "SurvivalMode");
            retval = SystemModelMain.getInstance().getPlayable().getPropertyValue("SurvivalMode", "survivalMode", "status");
            if ((retval!=null)) {
                ((SurvivalMode) object).pgInitStatus((retval));
            }
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("battery", "Battery");
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("Env", "Env");
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("User", "Env");
             
            runBThreads();
            object = il.ac.wis.cs.playgo.playtoolkit.AppObjects.getCurrent().getObject("Clock", "Clock");
            ((playgo.systemmodel.classes.Clock)object).startTimer();
             
        } catch (Exception _x) {
            _x.printStackTrace();
        }
    }

    @Override
    public void stop() {
    }

}
