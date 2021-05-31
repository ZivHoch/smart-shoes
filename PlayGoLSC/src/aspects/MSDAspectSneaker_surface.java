//  The file MSDAspectSneaker_surface.aj was automatically generated using S2A .
//  For information see http://www.wisdom.weizmann.ac.il/~maozs/s2a/

package aspects;

import playgo.systemmodel.classes.*;
import playgo.systemmodel.classes.generated.*;
import playgo.systemmodel.types.*;
import java.util.ArrayList;
import java.io.Serializable;
import il.ac.wis.cs.s2a.runtime.lib.*;
import il.ac.wis.cs.playgo.playtoolkit.*;


public class MSDAspectSneaker_surface extends MSDAspect implements MSDSubscribe, Serializable
{


	//Constants for instances, locations and variables
	static final int RGBMode_INST_rGBMode = 0;
	static final int SneakersMode_INST_sneakersMode = 1;


	static final int long_var_symbolic_Timer = 0;

	private final String niceName = "Sneaker_surface";

	public MSDAspectSneaker_surface()
	{
		this(null);	}

	public MSDAspectSneaker_surface(PlaygoCoordinator coordinator)
	{
		super(coordinator);
		subscribe();
		addAspectEvent(MSDMethods.RGBMode_RGBMode_RGBOn);
		addAspectEvent(MSDMethods.SneakersMode_SneakersMode_sneakersActive);

		addMinimalEvent(MSDMethods.RGBMode_RGBMode_RGBOn);
		setHotCut(2,1);
		setLastCut(2,2);
		numberOfLifeLines = 2;
		numberOfInstances = 2;
		numberOfVariables = 1;
		numberOfTimeTags = 0;
		interactionId = "1621248641961";
		setCutsExpressions();
	}

	public void subscribe(){
		getPlaygoCoordinator().subscribe(this, 
			"RGBMode", "RGBMode", "RGBOn");
		getPlaygoCoordinator().subscribe(this, 
			"SneakersMode", "SneakersMode", "sneakersActive");
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
					if(activeMSD.isInCut(2,1))
					{
						cutChanged=true; activeMSD.setCut(2,2);
						break;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			case MSDMethods.RGBMode_RGBMode_RGBOn:
				if(activeMSD.instancesEquals(RGBMode_INST_rGBMode,sourceObject)
					&& activeMSD.instancesEquals(RGBMode_INST_rGBMode,targetObject))
				{
					unification=true;
					if(activeMSD.isInCut(0,0))
					{
						cutChanged=true; activeMSD.setCut(1,0);
						if(evaluateCondition(1,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(2,1);
							return cutChanged;
						}
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
		RGBMode rGBMode = (RGBMode)bindObjectByExpression(activeMSD,RGBMode_INST_rGBMode,null, true);;
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
		RGBMode rGBMode = (RGBMode)bindObjectByExpression(activeMSD,RGBMode_INST_rGBMode,null, true);;
		SneakersMode sneakersMode = (SneakersMode)bindObjectByExpression(activeMSD,SneakersMode_INST_sneakersMode,null, true);;

	
	}

	protected void setCutsExpressions()
	{
		this.setExpressionForCut("2,1" , "true");

	}


	@SuppressWarnings("unused")
	protected void doBindings(ActiveMSDAspect activeMSD)
	{
		activeMSD.setLineInstance(RGBMode_INST_rGBMode,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("rGBMode","RGBMode"));
		activeMSD.setLineInstance(SneakersMode_INST_sneakersMode,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("sneakersMode","SneakersMode"));
		RGBMode rGBMode = (RGBMode)bindObjectByExpression(activeMSD,RGBMode_INST_rGBMode, null, false );
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

	private void after_RGBMode_RGBMode_RGBOn(Object _rGBModeSource ,Object _rGBMode)
	{
		changeCutState(MSDMethods.RGBMode_RGBMode_RGBOn,
					_rGBMode,_rGBMode,null);
	}

	private void after_SneakersMode_SneakersMode_sneakersActive(Object _sneakersModeSource ,Object _sneakersMode)
	{
		changeCutState(MSDMethods.SneakersMode_SneakersMode_sneakersActive,
					_sneakersMode,_sneakersMode,null);
	}

	@Override
	public void afterEvent(Object source, String srcClassName, 
		Object target, String tgtClassName, String method, 
		ArrayList<String> argTypes, ArrayList<Object> argValues)
	{
		if(srcClassName.equals("RGBMode") && tgtClassName.equals("RGBMode") && method.equals("RGBOn")){
			after_RGBMode_RGBMode_RGBOn(source, target);
			return;
		}
		if(srcClassName.equals("SneakersMode") && tgtClassName.equals("SneakersMode") && method.equals("sneakersActive")){
			after_SneakersMode_SneakersMode_sneakersActive(source, target);
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
		RGBMode rGBMode = (RGBMode)bindObjectByExpression(activeMSD,RGBMode_INST_rGBMode,null, true);;
		SneakersMode sneakersMode = (SneakersMode)bindObjectByExpression(activeMSD,SneakersMode_INST_sneakersMode,null, true);;

		MSDMethod MSDm3 = new MSDMethod(sneakersMode,sneakersMode,
			MSDMethods.SneakersMode_SneakersMode_sneakersActive,null,"SneakersMode:SneakersMode:sneakersActive",niceName,activeMSD.getGlobalId());// sneakersActive() Execute
		MSDMethod MSDm4 = new MSDMethod(rGBMode,rGBMode,
			MSDMethods.RGBMode_RGBMode_RGBOn,null,"RGBMode:RGBMode:RGBOn",niceName,activeMSD.getGlobalId());// RGBOn() Monitored

		 if(activeMSD.isInCut(0,0))
		{
				ME.add(MSDm4);
				CV.add(MSDm3);
				return;
		}
		 if(activeMSD.isInCut(2,1))
		{
				if(MSDm3.sourceInstance!=null && MSDm3.targetInstance!=null){
					EE.add(MSDm3);
				}
				HV.add(MSDm4);
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
			RGBMode rGBMode = (RGBMode) activeMSD.getLineInstance(RGBMode_INST_rGBMode);
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
