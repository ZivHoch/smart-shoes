//  The file MSDCoordinatorAspect.aj was automatically generated using S2A .
//  For information see http://www.wisdom.weizmann.ac.il/~maozs/s2a/

package aspects;

import playgo.systemmodel.classes.*;
import playgo.systemmodel.classes.generated.*;
import playgo.systemmodel.types.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Stack;
import il.ac.wis.cs.s2a.runtime.Utils;
import il.ac.wis.cs.playgo.playtoolkit.ExplayOutViewUtil;
import il.ac.wis.cs.playgo.playtoolkit.SyncMessageHandler;
import il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator;
import il.ac.wis.cs.s2a.runtime.lib.*;


public class MSDCoordinatorAspect extends MSDCoordinator implements MSDSubscribe
{
		MSDMethod chosenMethod = null;

	PlaygoCoordinator playgoCoordinator = null;

	ArrayList<MSDAspect> msdAspects = new ArrayList<MSDAspect>();

	//CTOR
	public MSDCoordinatorAspect(PlaygoCoordinator coordinator){
		playgoCoordinator = coordinator;
	}

	public void addAspect(MSDAspect aspect) {
		msdAspects.add(aspect);
	}

	public void clearAspects() {
		msdAspects.clear();
	}

	public void restartAspects(java.util.Collection<MSDAspect> newAspects) {
		clearAspects();
		for(MSDAspect asp: newAspects) {
			addAspect(asp);
		}
	}

	public void subscribe(){
		playgoCoordinator.subscribe(
				this, "MusicSelected", "MusicSelected", "setMusicChosen");
		playgoCoordinator.subscribe(
				this, "RGBMode", "RGBMode", "RGBOn");
		playgoCoordinator.subscribe(
				this, "Env", "MusicMode", "musicButton");
		playgoCoordinator.subscribe(
				this, "SneakersMode", "SneakersMode", "setStatus");
		playgoCoordinator.subscribe(
				this, "WaterproofSurfaceMode", "WaterproofSurfaceMode", "setStatus");
		playgoCoordinator.subscribe(
				this, "HardSurfaceMode", "HardSurfaceMode", "setStatus");
		playgoCoordinator.subscribe(
				this, "RunningSurfaceMode", "RunningSurfaceMode", "setStatus");
		playgoCoordinator.subscribe(
				this, "ShockabserverSurfaceMode", "ShockabserverSurfaceMode", "setStatus");
		playgoCoordinator.subscribe(
				this, "SurvivalMode", "SurvivalMode", "setStatus");
		playgoCoordinator.subscribe(
				this, "MusicSelected", "MusicSelected", "musicPlaying");
		playgoCoordinator.subscribe(
				this, "shoesConnectedToSpotify", "shoesConnectedToSpotify", "musicPlaying");
		playgoCoordinator.subscribe(
				this, "Env", "MusicSelected", "selectMusic");
		playgoCoordinator.subscribe(
				this, "Battery", "Battery", "ceckBatteryLife");
		playgoCoordinator.subscribe(
				this, "SneakersMode", "SneakersMode", "sneakersActive");
	}

	public void init()
	{
		super.init(MSDSPOStaticInfo.getInteractionLifelines(),
				MSDSPOStaticInfo.getInteractionVariables());
	}
	protected void afterImpl(MSDMethod envMeth) 
	{
		ArrayList<MSDAspect> aspects = new ArrayList<MSDAspect>();

		MSDMethodSet monitoringEnabled = new MSDMethodSet();
		MSDMethodSet executingEnabled = new MSDMethodSet();
		MSDMethodSet coldViolation = new MSDMethodSet();
		MSDMethodSet hotViolation = new MSDMethodSet();

		 // Coordinate all execution engines:
		playgo.systemmodel.SystemModelMain.getInstance().coordinateAll();

		for (MSDAspect msdAspect : msdAspects) {
			msdAspect.getCutState(monitoringEnabled, executingEnabled, coldViolation, hotViolation);
		aspects.add(msdAspect);
		}

		for (MSDAspect msdAspect : msdAspects) {
			msdAspect.updateForbiddenEvents(monitoringEnabled, executingEnabled, coldViolation, hotViolation);
		}

		MSDMethod MSDm = chooseMethod(strategy, monitoringEnabled, executingEnabled, 
				coldViolation, hotViolation, 
				history, aspects, il.ac.wis.cs.common.lsc.element.LSCMessage.DELETE);

		chosenMethod = MSDm;
		history.add(MSDm);
		dealWithTraceVis(MSDm, envMeth);
		wrapperCallPoint(MSDm);
	}

	protected void dealWithTraceVis(MSDMethod MSDm, MSDMethod envMeth) {
		TraceVisMSDMethodSet monitoringEnabled = new TraceVisMSDMethodSet();
		TraceVisMSDMethodSet executingEnabled = new TraceVisMSDMethodSet();
		TraceVisMSDMethodSet coldViolation = new TraceVisMSDMethodSet();
		TraceVisMSDMethodSet hotViolation = new TraceVisMSDMethodSet();

		for (MSDAspect msdAspect : msdAspects) {
			msdAspect.getCutState(monitoringEnabled, executingEnabled, coldViolation, hotViolation);
		}


	if (envMeth != null && MSDm != null && envMeth.messageID == ENV_MESSAGE_ID) {
		envMeth = null;
	}

		traceVisHandler.notify(monitoringEnabled, executingEnabled, coldViolation, hotViolation, MSDm, envMeth);
	}


	protected void wrapperCall(MSDMethod MSDm)
	{
		if(MSDm==null){
			return;
		}
		if(MSDm.targetInstance!=MSDm.sourceInstance){
			SyncMessageHandler.srcObj = MSDm.sourceInstance;
		}else{
			SyncMessageHandler.srcObj = null;
		}
		switch (MSDm.messageID)
		{
			case MSDMethods.MusicSelected_MusicSelected_musicPlaying:
			 ((MusicSelected)MSDm.targetInstance).musicPlaying();
			break;
			case MSDMethods.shoesConnectedToSpotify_shoesConnectedToSpotify_musicPlaying:
			 ((shoesConnectedToSpotify)MSDm.targetInstance).musicPlaying();
			break;
			case MSDMethods.MusicSelected_MusicSelected_setMusicChosen:
			 ((MusicSelected)MSDm.targetInstance).setMusicChosen(
				(Integer)MSDm.args.get(0));
			break;
			case MSDMethods.RGBMode_RGBMode_RGBOn:
			 ((RGBMode)MSDm.targetInstance).RGBOn();
			break;
			case MSDMethods.Battery_Battery_ceckBatteryLife:
			 ((Battery)MSDm.targetInstance).ceckBatteryLife();
			break;
			case MSDMethods.SneakersMode_SneakersMode_sneakersActive:
			 ((SneakersMode)MSDm.targetInstance).sneakersActive();
			break;
			case MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus:
			 ((WaterproofSurfaceMode)MSDm.targetInstance).setStatus(
				(String)MSDm.args.get(0));
			break;
			case MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus:
			 ((HardSurfaceMode)MSDm.targetInstance).setStatus(
				(String)MSDm.args.get(0));
			break;
			case MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus:
			 ((RunningSurfaceMode)MSDm.targetInstance).setStatus(
				(String)MSDm.args.get(0));
			break;
			case MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus:
			 ((ShockabserverSurfaceMode)MSDm.targetInstance).setStatus(
				(String)MSDm.args.get(0));
			break;
			case MSDMethods.SurvivalMode_SurvivalMode_setStatus:
			 ((SurvivalMode)MSDm.targetInstance).setStatus(
				(String)MSDm.args.get(0));
			break;
		}
	}

}

