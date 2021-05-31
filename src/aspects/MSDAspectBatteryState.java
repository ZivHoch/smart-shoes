//  The file MSDAspectBatteryState.aj was automatically generated using S2A .
//  For information see http://www.wisdom.weizmann.ac.il/~maozs/s2a/

package aspects;

import playgo.systemmodel.classes.*;
import playgo.systemmodel.classes.generated.*;
import playgo.systemmodel.types.*;
import java.util.ArrayList;
import java.io.Serializable;
import il.ac.wis.cs.s2a.runtime.lib.*;
import il.ac.wis.cs.playgo.playtoolkit.*;


public class MSDAspectBatteryState extends MSDAspect implements MSDSubscribe, Serializable
{


	//Constants for instances, locations and variables
	static final int Battery_INST_battery = 0;
	static final int SneakersMode_INST_sneakersMode = 1;


	static final int long_var_symbolic_Timer = 0;

	private final String niceName = "BatteryState";

	public MSDAspectBatteryState()
	{
		this(null);	}

	public MSDAspectBatteryState(PlaygoCoordinator coordinator)
	{
		super(coordinator);
		subscribe();
		addAspectEvent(MSDMethods.SneakersMode_SneakersMode_sneakersActive);
		addAspectEvent(MSDMethods.Battery_Battery_ceckBatteryLife);

		addMinimalEvent(MSDMethods.SneakersMode_SneakersMode_sneakersActive);
		setHotCut(1,2);
		setLastCut(2,2);
		numberOfLifeLines = 2;
		numberOfInstances = 2;
		numberOfVariables = 1;
		numberOfTimeTags = 0;
		interactionId = "1622066690731";
		setCutsExpressions();
	}

	public void subscribe(){
		getPlaygoCoordinator().subscribe(this, 
			"SneakersMode", "SneakersMode", "sneakersActive");
		getPlaygoCoordinator().subscribe(this, 
			"Battery", "Battery", "ceckBatteryLife");
	}

	protected void  setPrivateVariables(int MSDm, Object sourceObject, Object targetObject,ActiveMSDAspect activeMSD,
		ArrayList args)
	{
		switch (MSDm)
		{
		}
	}

	//MSD Logic:
	@Override
	protected boolean changeActiveMSDCutState(int MSDm, Object sourceObject, 
			Object targetObject,ActiveMSDAspect activeMSD, ArrayList args, 
			boolean newlyAddedDynamicAll)	{

		boolean unification=false;
		if(SyncMessageHandler.srcObj!=null){
			sourceObject = SyncMessageHandler.srcObj;
			SyncMessageHandler.srcObj=null;
		}
		boolean cutChanged=false;
		switch (MSDm)
		{
			case MSDMethods.SneakersMode_SneakersMode_sneakersActive:
				if(activeMSD.instancesEquals(SneakersMode_INST_sneakersMode,sourceObject)
					&& activeMSD.instancesEquals(SneakersMode_INST_sneakersMode,targetObject))
				{
					unification=true;
					if(activeMSD.isInCut(0,0))
					{
						cutChanged=true; activeMSD.setCut(0,1);
						if(evaluateCondition(1,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(1,2);
							return cutChanged;
						}
						break;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			case MSDMethods.Battery_Battery_ceckBatteryLife:
				if(activeMSD.instancesEquals(Battery_INST_battery,sourceObject)
					&& activeMSD.instancesEquals(Battery_INST_battery,targetObject))
				{
					unification=true;
					if(activeMSD.isInCut(1,2))
					{
						cutChanged=true; activeMSD.setCut(2,2);
						break;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			}
		if(newlyAddedDynamicAll){
			return cutChanged;
		}
		if(activeMSD.checkViolation())
			activeMSD.completion();
		return cutChanged;
	}

	@SuppressWarnings("unused")
	private boolean evaluateCondition(int conditionNumber,ActiveMSDAspect activeMSD)
	{
		Battery battery = (Battery)bindObjectByExpression(activeMSD,Battery_INST_battery,null, true);;
		SneakersMode sneakersMode = (SneakersMode)bindObjectByExpression(activeMSD,SneakersMode_INST_sneakersMode,null, true);;

		switch (conditionNumber)
		{
			case 1: 
				return true;
		}
		return false;
	}

	@SuppressWarnings("unused")
	private void evaluateForbiddenConditions(ActiveMSDAspect activeMSD)
	{
		Battery battery = (Battery)bindObjectByExpression(activeMSD,Battery_INST_battery,null, true);;
		SneakersMode sneakersMode = (SneakersMode)bindObjectByExpression(activeMSD,SneakersMode_INST_sneakersMode,null, true);;

	
	}

	protected void setCutsExpressions()
	{
		this.setExpressionForCut("1,2" , "true");

	}


	@SuppressWarnings("unused")
	protected void doBindings(ActiveMSDAspect activeMSD)
	{
		activeMSD.setLineInstance(Battery_INST_battery,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("battery","Battery"));
		activeMSD.setLineInstance(SneakersMode_INST_sneakersMode,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("sneakersMode","SneakersMode"));
		Battery battery = (Battery)bindObjectByExpression(activeMSD,Battery_INST_battery, null, false );
		SneakersMode sneakersMode = (SneakersMode)bindObjectByExpression(activeMSD,SneakersMode_INST_sneakersMode, null, false );
		long Timer = 0;
		if(activeMSD.getPrivateVariable(long_var_symbolic_Timer)!=null){
			Timer = (Long) activeMSD.getPrivateVariable(long_var_symbolic_Timer);
		} 

	}

	//Pointcuts and advices:
	@Override
	public void afterSetCut()
	{
		ArrayList<ActiveMSDAspect> tempActiveArr = new ArrayList<ActiveMSDAspect>();
		tempActiveArr.addAll(getActiveMSDArray());

		for(ActiveMSDAspect liveCopy:tempActiveArr){
			evaluateWaitConditions(liveCopy);		//re-evaluate wait conditions
			evaluateForbiddenConditions(liveCopy);	//evaluate forbidden and exitUpon conditions
		}
	}

	//re-evaluate dynamic-universal binding expressions
	public void afterchangeActiveMSDCut(int MSDm, Object sourceObject, Object targetObject, 
		ActiveMSDAspect activeMSD, ArrayList arguments, boolean cutChanged, boolean newlyAddedDynamicAll)
	{
		ArrayList<ActiveMSDAspect> tempActiveArr = new ArrayList<ActiveMSDAspect>();
		tempActiveArr.addAll(getActiveMSDArray());

		for(ActiveMSDAspect liveCopy:tempActiveArr)
		{
			activeCheckForViolation(MSDm,
					sourceObject, targetObject, arguments, liveCopy,
					(boolean)cutChanged, liveCopy == activeMSD);

			if(unboundObjectExists(liveCopy))
			{
				doBindings(liveCopy);				//try to bind objects
				if( ! unboundObjectExists(liveCopy)){
					setUpToDate(false);
				}
			}
		}
		setUpToDate(false);
	}

	private boolean unboundObjectExists(ActiveMSDAspect activeMSD)
	{
	
			return false;
	}
	@Override
	public void afterTick()
	{
		//boolean coordinated = false;

		ArrayList<ActiveMSDAspect> tempActiveArr = new ArrayList<ActiveMSDAspect>();
		tempActiveArr.addAll(getActiveMSDArray());

		for(ActiveMSDAspect liveCopy:tempActiveArr){
			evaluateWaitConditions(liveCopy);		//re-evaluate wait conditions
			evaluateForbiddenConditions(liveCopy);	//evaluate forbidden and exitUpon conditions
			//coordinated = true;
		}

		//if (!coordinated) {
			//((MSDCoordinatorAspect)getPlaygoCoordinator().getMSDCoordinatorAspect()).coordinate(null);
		//}
	}

	//activeCheckForViolation
	@Override
	protected void activeCheckForViolation(int MSDm, Object sourceObject,
			Object targetObject, ArrayList args, ActiveMSDAspect activeMSD, 
			boolean cutChanged, boolean inActiveCopy)
	{
	}

	private void after_SneakersMode_SneakersMode_sneakersActive(Object _sneakersModeSource ,Object _sneakersMode)
	{
		changeCutState(MSDMethods.SneakersMode_SneakersMode_sneakersActive,
					_sneakersMode,_sneakersMode,null);
	}

	private void after_Battery_Battery_ceckBatteryLife(Object _batterySource ,Object _battery)
	{
		changeCutState(MSDMethods.Battery_Battery_ceckBatteryLife,
					_battery,_battery,null);
	}

	@Override
	public void afterEvent(Object source, String srcClassName, 
		Object target, String tgtClassName, String method, 
		ArrayList<String> argTypes, ArrayList<Object> argValues)
	{
		if(srcClassName.equals("SneakersMode") && tgtClassName.equals("SneakersMode") && method.equals("sneakersActive")){
			after_SneakersMode_SneakersMode_sneakersActive(source, target);
			return;
		}
		if(srcClassName.equals("Battery") && tgtClassName.equals("Battery") && method.equals("ceckBatteryLife")){
			after_Battery_Battery_ceckBatteryLife(source, target);
			return;
		}
	}

	@Override
	public void beforeEvent(Object source, String srcClassName, 
		Object target, String tgtClassName, String method, 
		ArrayList<String> argTypes, ArrayList<Object> argValues)
	{
	}

	@Override
	protected void saveActiveMSDCurTimeToTimeTags(int MSDm,ActiveMSDAspect activeMSD){

		switch (MSDm)
		{
		}
	}

	protected void  evaluateWaitConditions(ActiveMSDAspect activeMSD)
	{
		for(Integer cond:activeMSD.getWaitingConditions()){
			switch(cond)
			{
			}
		}
	}

	protected void getActiveMSDCutState(MSDMethodSet ME,MSDMethodSet EE,
			MSDMethodSet CV,MSDMethodSet HV,ActiveMSDAspect activeMSD)
	{
		Battery battery = (Battery)bindObjectByExpression(activeMSD,Battery_INST_battery,null, true);;
		SneakersMode sneakersMode = (SneakersMode)bindObjectByExpression(activeMSD,SneakersMode_INST_sneakersMode,null, true);;

		MSDMethod MSDm89 = new MSDMethod(sneakersMode,sneakersMode,
			MSDMethods.SneakersMode_SneakersMode_sneakersActive,null,"SneakersMode:SneakersMode:sneakersActive",niceName,activeMSD.getGlobalId());// sneakersActive() Monitored
		MSDMethod MSDm90 = new MSDMethod(battery,battery,
			MSDMethods.Battery_Battery_ceckBatteryLife,null,"Battery:Battery:ceckBatteryLife",niceName,activeMSD.getGlobalId());// ceckBatteryLife() Execute

		 if(activeMSD.isInCut(0,0))
		{
				ME.add(MSDm89);
				CV.add(MSDm90);
				return;
		}
		 if(activeMSD.isInCut(1,2))
		{
				if(MSDm90.sourceInstance!=null && MSDm90.targetInstance!=null){
					EE.add(MSDm90);
				}
				HV.add(MSDm89);
				return;
		}
	}
	protected void updateActiveForbiddenEvents(MSDMethodSet MEall,MSDMethodSet EEall,
			MSDMethodSet CVall,MSDMethodSet HVall,ActiveMSDAspect activeMSD)
	{

	}
	
	@SuppressWarnings("unused")
	public Object bindObjectByExpression (ActiveMSDAspect activeMSD,int lifelineIndex, 
			Object obj, boolean retrieveOnly){

		Object result = null;
		// in case the object is already bounded returning the bounded object
		result = activeMSD.getLineInstance(lifelineIndex);
		if (result == null){
			Battery battery = (Battery) activeMSD.getLineInstance(Battery_INST_battery);
			SneakersMode sneakersMode = (SneakersMode) activeMSD.getLineInstance(SneakersMode_INST_sneakersMode);
			switch (lifelineIndex){
			}
		}
		return result;
	}
	
	
	public boolean validateBoundedObject(ActiveMSDAspect activeMSD, int lifelineIndex, Object object){
		boolean result = false;
		try{
			Object bounded = bindObjectByExpression(activeMSD, lifelineIndex, object, true);
			if (bounded != null){
				result = bounded.equals(object);
			}else if (object == null){
				result = true;
			}
		}catch(NullPointerException npe){
			result = false; // parent object not bounded yet
		}
		return result;
	}
	
	public String getNiceName()
	{
			return niceName;
	}

}
