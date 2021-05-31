//  The file MSDAspectLightsActivatedBySelectingMusic.aj was automatically generated using S2A .
//  For information see http://www.wisdom.weizmann.ac.il/~maozs/s2a/

package aspects;

import playgo.systemmodel.classes.*;
import playgo.systemmodel.classes.generated.*;
import playgo.systemmodel.types.*;
import java.util.ArrayList;
import java.io.Serializable;
import il.ac.wis.cs.s2a.runtime.lib.*;
import il.ac.wis.cs.playgo.playtoolkit.*;


public class MSDAspectLightsActivatedBySelectingMusic extends MSDAspect implements MSDSubscribe, Serializable
{


	//Constants for instances, locations and variables
	static final int MusicSelected_INST_musicSelected = 0;
	static final int RGBMode_INST_rGBMode = 1;


	static final int long_var_symbolic_Timer = 0;

	private final String niceName = "LightsActivatedBySelectingMusic";

	public MSDAspectLightsActivatedBySelectingMusic()
	{
		this(null);	}

	public MSDAspectLightsActivatedBySelectingMusic(PlaygoCoordinator coordinator)
	{
		super(coordinator);
		subscribe();
		addAspectEvent(MSDMethods.MusicSelected_MusicSelected_musicPlaying);
		addAspectEvent(MSDMethods.RGBMode_RGBMode_RGBOn);

		addMinimalEvent(MSDMethods.MusicSelected_MusicSelected_musicPlaying);
		setHotCut(2,1);
		setLastCut(2,2);
		numberOfLifeLines = 2;
		numberOfInstances = 2;
		numberOfVariables = 1;
		numberOfTimeTags = 0;
		interactionId = "1622116151855";
		setCutsExpressions();
	}

	public void subscribe(){
		getPlaygoCoordinator().subscribe(this, 
			"MusicSelected", "MusicSelected", "musicPlaying");
		getPlaygoCoordinator().subscribe(this, 
			"RGBMode", "RGBMode", "RGBOn");
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
			case MSDMethods.RGBMode_RGBMode_RGBOn:
				if(activeMSD.instancesEquals(RGBMode_INST_rGBMode,sourceObject)
					&& activeMSD.instancesEquals(RGBMode_INST_rGBMode,targetObject))
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

			case MSDMethods.MusicSelected_MusicSelected_musicPlaying:
				if(activeMSD.instancesEquals(MusicSelected_INST_musicSelected,sourceObject)
					&& activeMSD.instancesEquals(MusicSelected_INST_musicSelected,targetObject))
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
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected,null, true);;
		RGBMode rGBMode = (RGBMode)bindObjectByExpression(activeMSD,RGBMode_INST_rGBMode,null, true);;

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
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected,null, true);;
		RGBMode rGBMode = (RGBMode)bindObjectByExpression(activeMSD,RGBMode_INST_rGBMode,null, true);;

	
	}

	protected void setCutsExpressions()
	{
		this.setExpressionForCut("2,1" , "true");

	}


	@SuppressWarnings("unused")
	protected void doBindings(ActiveMSDAspect activeMSD)
	{
		activeMSD.setLineInstance(MusicSelected_INST_musicSelected,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("musicSelected","MusicSelected"));
		activeMSD.setLineInstance(RGBMode_INST_rGBMode,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("rGBMode","RGBMode"));
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected, null, false );
		RGBMode rGBMode = (RGBMode)bindObjectByExpression(activeMSD,RGBMode_INST_rGBMode, null, false );
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

	private void after_MusicSelected_MusicSelected_musicPlaying(Object _musicSelectedSource ,Object _musicSelected)
	{
		changeCutState(MSDMethods.MusicSelected_MusicSelected_musicPlaying,
					_musicSelected,_musicSelected,null);
	}

	private void after_RGBMode_RGBMode_RGBOn(Object _rGBModeSource ,Object _rGBMode)
	{
		changeCutState(MSDMethods.RGBMode_RGBMode_RGBOn,
					_rGBMode,_rGBMode,null);
	}

	@Override
	public void afterEvent(Object source, String srcClassName, 
		Object target, String tgtClassName, String method, 
		ArrayList<String> argTypes, ArrayList<Object> argValues)
	{
		if(srcClassName.equals("MusicSelected") && tgtClassName.equals("MusicSelected") && method.equals("musicPlaying")){
			after_MusicSelected_MusicSelected_musicPlaying(source, target);
			return;
		}
		if(srcClassName.equals("RGBMode") && tgtClassName.equals("RGBMode") && method.equals("RGBOn")){
			after_RGBMode_RGBMode_RGBOn(source, target);
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
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected,null, true);;
		RGBMode rGBMode = (RGBMode)bindObjectByExpression(activeMSD,RGBMode_INST_rGBMode,null, true);;

		MSDMethod MSDm93 = new MSDMethod(rGBMode,rGBMode,
			MSDMethods.RGBMode_RGBMode_RGBOn,null,"RGBMode:RGBMode:RGBOn",niceName,activeMSD.getGlobalId());// RGBOn() Execute
		MSDMethod MSDm94 = new MSDMethod(musicSelected,musicSelected,
			MSDMethods.MusicSelected_MusicSelected_musicPlaying,null,"MusicSelected:MusicSelected:musicPlaying",niceName,activeMSD.getGlobalId());// musicPlaying() Monitored

		 if(activeMSD.isInCut(0,0))
		{
				ME.add(MSDm94);
				CV.add(MSDm93);
				return;
		}
		 if(activeMSD.isInCut(2,1))
		{
				if(MSDm93.sourceInstance!=null && MSDm93.targetInstance!=null){
					EE.add(MSDm93);
				}
				HV.add(MSDm94);
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
			MusicSelected musicSelected = (MusicSelected) activeMSD.getLineInstance(MusicSelected_INST_musicSelected);
			RGBMode rGBMode = (RGBMode) activeMSD.getLineInstance(RGBMode_INST_rGBMode);
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
