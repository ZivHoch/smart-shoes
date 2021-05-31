//  The file MSDAspectuserControl.aj was automatically generated using S2A .
//  For information see http://www.wisdom.weizmann.ac.il/~maozs/s2a/

package aspects;

import playgo.systemmodel.classes.*;
import playgo.systemmodel.classes.generated.*;
import playgo.systemmodel.types.*;
import java.util.ArrayList;
import java.io.Serializable;
import il.ac.wis.cs.s2a.runtime.lib.*;
import il.ac.wis.cs.playgo.playtoolkit.*;


public class MSDAspectuserControl extends MSDAspect implements MSDSubscribe, Serializable
{


	//Constants for instances, locations and variables
	static final int Env_INST_User = 0;
	static final int MusicSelected_INST_musicSelected = 1;

	static final int int_arg_int_exact_int_arg00 = 0;

	static final int long_var_symbolic_Timer = 1;

	private final String niceName = "userControl";

	public MSDAspectuserControl()
	{
		this(null);	}

	public MSDAspectuserControl(PlaygoCoordinator coordinator)
	{
		super(coordinator);
		subscribe();
		addAspectEvent(MSDMethods.Env_MusicSelected_selectMusic);
		addAspectEvent(MSDMethods.MusicSelected_MusicSelected_setMusicChosen);

		addMinimalEvent(MSDMethods.Env_MusicSelected_selectMusic);
		setHotCut(2,2);
		setLastCut(2,3);
		numberOfLifeLines = 2;
		numberOfInstances = 2;
		numberOfVariables = 2;
		numberOfTimeTags = 0;
		interactionId = "1621374419642";
		setCutsExpressions();
	}

	public void subscribe(){
		getPlaygoCoordinator().subscribe(this, 
			"Env", "MusicSelected", "selectMusic");
		getPlaygoCoordinator().subscribe(this, 
			"MusicSelected", "MusicSelected", "setMusicChosen");
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
			case MSDMethods.MusicSelected_MusicSelected_setMusicChosen:
				if(activeMSD.instancesEquals(MusicSelected_INST_musicSelected,sourceObject)
					&& activeMSD.instancesEquals(MusicSelected_INST_musicSelected,targetObject)
					&& activeMSD.variableEquals(int_arg_int_exact_int_arg00,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(2,2))
					{
						cutChanged=true; activeMSD.setCut(2,3);
						break;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			case MSDMethods.Env_MusicSelected_selectMusic:
				if(activeMSD.instancesEquals(Env_INST_User,sourceObject)
					&& activeMSD.instancesEquals(MusicSelected_INST_musicSelected,targetObject))
				{
					unification=true;
					if(activeMSD.isInCut(0,0))
					{
						cutChanged=true; activeMSD.setCut(1,1);
						if(evaluateCondition(1,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(2,2);
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
		Env User = (Env)bindObjectByExpression(activeMSD,Env_INST_User,null, true);;
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected,null, true);;

		int arg00 = 0;
		if(activeMSD.getPrivateVariable(int_arg_int_exact_int_arg00)!=null){
			arg00 = (int) activeMSD.getPrivateVariable(int_arg_int_exact_int_arg00);
		}

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
		Env User = (Env)bindObjectByExpression(activeMSD,Env_INST_User,null, true);;
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected,null, true);;

		int arg00 = 0;
		if(activeMSD.getPrivateVariable(int_arg_int_exact_int_arg00)!=null){
			arg00 = (int) activeMSD.getPrivateVariable(int_arg_int_exact_int_arg00);
		}

	
	}

	protected void setCutsExpressions()
	{
		this.setExpressionForCut("2,2" , "true");

	}


	@SuppressWarnings("unused")
	protected void doBindings(ActiveMSDAspect activeMSD)
	{
		activeMSD.setLineInstance(Env_INST_User,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("User","Env"));
		activeMSD.setLineInstance(MusicSelected_INST_musicSelected,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("musicSelected","MusicSelected"));
		Env User = (Env)bindObjectByExpression(activeMSD,Env_INST_User, null, false );
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected, null, false );

		int arg00 = 0;
		if(activeMSD.getPrivateVariable(int_arg_int_exact_int_arg00)!=null){
			arg00 = (int) activeMSD.getPrivateVariable(int_arg_int_exact_int_arg00);
		}
		long Timer = 0;
		if(activeMSD.getPrivateVariable(long_var_symbolic_Timer)!=null){
			Timer = (Long) activeMSD.getPrivateVariable(long_var_symbolic_Timer);
		} 

		try{
			activeMSD.setPrivateVariable(int_arg_int_exact_int_arg00, (int)1);
		}catch(Exception e){}
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

	private void after_Env_MusicSelected_selectMusic(Object _user ,Object _musicSelected)
	{
		changeCutState(MSDMethods.Env_MusicSelected_selectMusic,
					_user,_musicSelected,null);
	}

	private void after_MusicSelected_MusicSelected_setMusicChosen(Object _musicSelectedSource ,Object _musicSelected, ArrayList<Object> args)
	{
		changeCutState(MSDMethods.MusicSelected_MusicSelected_setMusicChosen,
					_musicSelected,_musicSelected,args);
	}

	@Override
	public void afterEvent(Object source, String srcClassName, 
		Object target, String tgtClassName, String method, 
		ArrayList<String> argTypes, ArrayList<Object> argValues)
	{
		if(srcClassName.equals("Env") && tgtClassName.equals("MusicSelected") && method.equals("selectMusic")){
			after_Env_MusicSelected_selectMusic(source, target);
			return;
		}
		if(srcClassName.equals("MusicSelected") && tgtClassName.equals("MusicSelected") && method.equals("setMusicChosen")){
			after_MusicSelected_MusicSelected_setMusicChosen(source, target, argValues);
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
		Env User = (Env)bindObjectByExpression(activeMSD,Env_INST_User,null, true);;
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected,null, true);;

		Integer VAR_int_exact_int_arg00 = null;
		if(activeMSD.getPrivateVariable(int_arg_int_exact_int_arg00)!=null){
			VAR_int_exact_int_arg00 = (Integer) activeMSD.getPrivateVariable(int_arg_int_exact_int_arg00);
		}

		ArrayList<Object>  args87 = getArgsList(VAR_int_exact_int_arg00);
		MSDMethod MSDm87 = new MSDMethod(musicSelected,musicSelected,
			MSDMethods.MusicSelected_MusicSelected_setMusicChosen,args87,"MusicSelected:MusicSelected:setMusicChosen",niceName,activeMSD.getGlobalId());// setMusicChosen() Execute
		MSDMethod MSDm88 = new MSDMethod(User,musicSelected,
			MSDMethods.Env_MusicSelected_selectMusic,null,"Env:MusicSelected:selectMusic",niceName,activeMSD.getGlobalId());// selectMusic() Monitored

		 if(activeMSD.isInCut(0,0))
		{
				ME.add(MSDm88);
				CV.add(MSDm87);
				return;
		}
		 if(activeMSD.isInCut(2,2))
		{
				if(MSDm87.sourceInstance!=null && MSDm87.targetInstance!=null){
					EE.add(MSDm87);
				}
				HV.add(MSDm88);
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

		int arg00 = 0;
		if(activeMSD.getPrivateVariable(int_arg_int_exact_int_arg00)!=null){
			arg00 = (int) activeMSD.getPrivateVariable(int_arg_int_exact_int_arg00);
		}

		Object result = null;
		// in case the object is already bounded returning the bounded object
		result = activeMSD.getLineInstance(lifelineIndex);
		if (result == null){
			Env User = (Env) activeMSD.getLineInstance(Env_INST_User);
			MusicSelected musicSelected = (MusicSelected) activeMSD.getLineInstance(MusicSelected_INST_musicSelected);
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
