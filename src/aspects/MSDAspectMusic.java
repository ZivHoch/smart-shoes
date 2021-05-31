//  The file MSDAspectMusic.aj was automatically generated using S2A .
//  For information see http://www.wisdom.weizmann.ac.il/~maozs/s2a/

package aspects;

import playgo.systemmodel.classes.*;
import playgo.systemmodel.classes.generated.*;
import playgo.systemmodel.types.*;
import java.util.ArrayList;
import java.io.Serializable;
import il.ac.wis.cs.s2a.runtime.lib.*;
import il.ac.wis.cs.playgo.playtoolkit.*;


public class MSDAspectMusic extends MSDAspect implements MSDSubscribe, Serializable
{


	//Constants for instances, locations and variables
	static final int Env_INST_User = 0;
	static final int MusicMode_INST_musicMode = 1;
	static final int MusicSelected_INST_musicSelected = 2;
	static final int shoesConnectedToSpotify_INST_shoesConnectedToSpotify = 3;
	static final int Clock_INST_Clock = 4;


	static final int long_var_symbolic_Timer = 0;

	private final String niceName = "Music";

	public MSDAspectMusic()
	{
		this(null);	}

	public MSDAspectMusic(PlaygoCoordinator coordinator)
	{
		super(coordinator);
		subscribe();
		addAspectEvent(MSDMethods.Env_MusicMode_musicButton);
		addAspectEvent(MSDMethods.MusicSelected_MusicSelected_musicPlaying);
		addAspectEvent(MSDMethods.shoesConnectedToSpotify_shoesConnectedToSpotify_musicPlaying);

		addMinimalEvent(MSDMethods.Env_MusicMode_musicButton);
		setHotCut(1,2,1,1,1);
		setHotCut(2,4,3,3,3);
		setHotCut(3,5,5,4,4);
		addOperCut("else",3,5,5,4,4);
		addOperCut("else",3,5,5,5,4);
		addOperCut("musicSelected.musicChosen == 1",2,4,3,3,3);
		addOperCut("musicSelected.musicChosen == 1",2,4,4,3,3);
		setLastCut(4,6,6,6,5);
		numberOfLifeLines = 5;
		numberOfInstances = 5;
		numberOfVariables = 1;
		numberOfTimeTags = 0;
		interactionId = "1621242333330";
		setCutsExpressions();
	}

	public void subscribe(){
		getPlaygoCoordinator().subscribe(this, 
			"Env", "MusicMode", "musicButton");
		getPlaygoCoordinator().subscribe(this, 
			"MusicSelected", "MusicSelected", "musicPlaying");
		getPlaygoCoordinator().subscribe(this, 
			"shoesConnectedToSpotify", "shoesConnectedToSpotify", "musicPlaying");
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
			case MSDMethods.MusicSelected_MusicSelected_musicPlaying:
				if(activeMSD.instancesEquals(MusicSelected_INST_musicSelected,sourceObject)
					&& activeMSD.instancesEquals(MusicSelected_INST_musicSelected,targetObject))
				{
					unification=true;
					if(activeMSD.isInCut(2,4,3,3,3))
					{
						cutChanged=true; activeMSD.setCut(2,4,4,3,3);
						if(evaluateCondition(6,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(4,6,6,6,5);
							break;
						}
						activeMSD.checkViolation();
						cutChanged=true; activeMSD.setCut(4,6,6,6,5);
						return cutChanged;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			case MSDMethods.Env_MusicMode_musicButton:
				if(activeMSD.instancesEquals(Env_INST_User,sourceObject)
					&& activeMSD.instancesEquals(MusicMode_INST_musicMode,targetObject))
				{
					unification=true;
					if(activeMSD.isInCut(0,0,0,0,0))
					{
						cutChanged=true; activeMSD.setCut(1,1,0,0,0);
						if(evaluateCondition(1,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(1,2,1,1,1);
							cutChanged=true; activeMSD.setCut(1,2,1,1,1);
							if(evaluateCondition(2,activeMSD))
							{
								activeMSD.notWaitingForCond(2); //out of wait condition
								cutChanged=true; activeMSD.setCut(1,3,2,2,2);
								cutChanged=true; activeMSD.setCut(1,3,2,2,2);
								if(evaluateCondition(3,activeMSD))
								{
									cutChanged=true; activeMSD.setCut(2,4,3,3,3);
									return cutChanged;
								}
								if(evaluateCondition(4,activeMSD))
								{
									cutChanged=true; activeMSD.setCut(3,5,5,4,4);
									return cutChanged;
								}
								cutChanged=true; activeMSD.setCut(4,6,6,6,5);
								break;
							}
							activeMSD.setWaitingForCond(2); //in wait condition
							return cutChanged;
						}
						break;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			case MSDMethods.shoesConnectedToSpotify_shoesConnectedToSpotify_musicPlaying:
				if(activeMSD.instancesEquals(shoesConnectedToSpotify_INST_shoesConnectedToSpotify,sourceObject)
					&& activeMSD.instancesEquals(shoesConnectedToSpotify_INST_shoesConnectedToSpotify,targetObject))
				{
					unification=true;
					if(activeMSD.isInCut(3,5,5,4,4))
					{
						cutChanged=true; activeMSD.setCut(3,5,5,5,4);
						if(evaluateCondition(6,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(4,6,6,6,5);
							break;
						}
						activeMSD.checkViolation();
						cutChanged=true; activeMSD.setCut(4,6,6,6,5);
						return cutChanged;
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
		MusicMode musicMode = (MusicMode)bindObjectByExpression(activeMSD,MusicMode_INST_musicMode,null, true);;
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected,null, true);;
		shoesConnectedToSpotify shoesConnectedToSpotify = (shoesConnectedToSpotify)bindObjectByExpression(activeMSD,shoesConnectedToSpotify_INST_shoesConnectedToSpotify,null, true);;
		Clock Clock = (Clock)bindObjectByExpression(activeMSD,Clock_INST_Clock,null, true);;


		long Timer = 0;
		if(activeMSD.getPrivateVariable(long_var_symbolic_Timer)!=null){
			Timer = (Long) activeMSD.getPrivateVariable(long_var_symbolic_Timer);
		} 
		switch (conditionNumber)
		{
			case 1: 
				activeMSD.setPrivateVariable(long_var_symbolic_Timer,Clock.getTime());
				return true;
			case 2: 
				return ((Clock.getTime() > Timer + 5000) || (musicSelected.getMusicChosen() == 1));
			case 3: 
				return musicSelected.getMusicChosen()==1;
			case 4: 
				return true;
			case 6: 
				return true;
		}
		return false;
	}

	@SuppressWarnings("unused")
	private void evaluateForbiddenConditions(ActiveMSDAspect activeMSD)
	{
		Env User = (Env)bindObjectByExpression(activeMSD,Env_INST_User,null, true);;
		MusicMode musicMode = (MusicMode)bindObjectByExpression(activeMSD,MusicMode_INST_musicMode,null, true);;
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected,null, true);;
		shoesConnectedToSpotify shoesConnectedToSpotify = (shoesConnectedToSpotify)bindObjectByExpression(activeMSD,shoesConnectedToSpotify_INST_shoesConnectedToSpotify,null, true);;
		Clock Clock = (Clock)bindObjectByExpression(activeMSD,Clock_INST_Clock,null, true);;


		long Timer = 0;
		if(activeMSD.getPrivateVariable(long_var_symbolic_Timer)!=null){
			Timer = (Long) activeMSD.getPrivateVariable(long_var_symbolic_Timer);
		} 
	
	}

	protected void setCutsExpressions()
	{
		this.setExpressionForCut("2,4,3,3,3" , "musicSelected.musicChosen == 1");
		this.setExpressionForCut("3,5,5,4,4" , "else");
		this.setExpressionForCut("4,6,6,6,5" , "SYNC");
		this.setExpressionForCut("1,2,1,1,1" , "Timer = Clock.getTime()");
		this.setExpressionForCut("1,3,2,2,2" , "Wait: ((Clock.time > Timer + 5000) || (musicSelected.musicChosen == 1))");

	}


	@SuppressWarnings("unused")
	protected void doBindings(ActiveMSDAspect activeMSD)
	{
		activeMSD.setLineInstance(Env_INST_User,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("User","Env"));
		activeMSD.setLineInstance(MusicMode_INST_musicMode,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("musicMode","MusicMode"));
		activeMSD.setLineInstance(MusicSelected_INST_musicSelected,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("musicSelected","MusicSelected"));
		activeMSD.setLineInstance(shoesConnectedToSpotify_INST_shoesConnectedToSpotify,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("shoesConnectedToSpotify","shoesConnectedToSpotify"));
		activeMSD.setLineInstance(Clock_INST_Clock,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("Clock","Clock"));
		Env User = (Env)bindObjectByExpression(activeMSD,Env_INST_User, null, false );
		MusicMode musicMode = (MusicMode)bindObjectByExpression(activeMSD,MusicMode_INST_musicMode, null, false );
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected, null, false );
		shoesConnectedToSpotify shoesConnectedToSpotify = (shoesConnectedToSpotify)bindObjectByExpression(activeMSD,shoesConnectedToSpotify_INST_shoesConnectedToSpotify, null, false );
		Clock Clock = (Clock)bindObjectByExpression(activeMSD,Clock_INST_Clock, null, false );
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

	private void after_Env_MusicMode_musicButton(Object _user ,Object _musicMode)
	{
		changeCutState(MSDMethods.Env_MusicMode_musicButton,
					_user,_musicMode,null);
	}

	private void after_MusicSelected_MusicSelected_musicPlaying(Object _musicSelectedSource ,Object _musicSelected)
	{
		changeCutState(MSDMethods.MusicSelected_MusicSelected_musicPlaying,
					_musicSelected,_musicSelected,null);
	}

	private void after_shoesConnectedToSpotify_shoesConnectedToSpotify_musicPlaying(Object _shoesConnectedToSpotifySource ,Object _shoesConnectedToSpotify)
	{
		changeCutState(MSDMethods.shoesConnectedToSpotify_shoesConnectedToSpotify_musicPlaying,
					_shoesConnectedToSpotify,_shoesConnectedToSpotify,null);
	}

	@Override
	public void afterEvent(Object source, String srcClassName, 
		Object target, String tgtClassName, String method, 
		ArrayList<String> argTypes, ArrayList<Object> argValues)
	{
		if(srcClassName.equals("Env") && tgtClassName.equals("MusicMode") && method.equals("musicButton")){
			after_Env_MusicMode_musicButton(source, target);
			return;
		}
		if(srcClassName.equals("MusicSelected") && tgtClassName.equals("MusicSelected") && method.equals("musicPlaying")){
			after_MusicSelected_MusicSelected_musicPlaying(source, target);
			return;
		}
		if(srcClassName.equals("shoesConnectedToSpotify") && tgtClassName.equals("shoesConnectedToSpotify") && method.equals("musicPlaying")){
			after_shoesConnectedToSpotify_shoesConnectedToSpotify_musicPlaying(source, target);
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


	private void evalTrueWaitCond2(ActiveMSDAspect activeMSD){
								activeMSD.notWaitingForCond(2); //out of wait condition
								activeMSD.setCut(1,3,2,2,2);
								activeMSD.setCut(1,3,2,2,2);
								if(evaluateCondition(3,activeMSD))
								{
									activeMSD.setCut(2,4,3,3,3);
									return;
								}
								if(evaluateCondition(4,activeMSD))
								{
									activeMSD.setCut(3,5,5,4,4);
									return;
								}
								activeMSD.setCut(4,6,6,6,5);
								return;
	}

	protected void  evaluateWaitConditions(ActiveMSDAspect activeMSD)
	{
		for(Integer cond:activeMSD.getWaitingConditions()){
			switch(cond)
			{
				case 2:
					if(evaluateCondition(2,activeMSD))
					{
						evalTrueWaitCond2(activeMSD);

						setUpToDate(false);
						(getPlaygoCoordinator().getMSDCoordinatorAspect()).coordinate(null);
						closeActiveCopies();
					}
					break;
			}
		}
	}

	protected void getActiveMSDCutState(MSDMethodSet ME,MSDMethodSet EE,
			MSDMethodSet CV,MSDMethodSet HV,ActiveMSDAspect activeMSD)
	{
		Env User = (Env)bindObjectByExpression(activeMSD,Env_INST_User,null, true);;
		MusicMode musicMode = (MusicMode)bindObjectByExpression(activeMSD,MusicMode_INST_musicMode,null, true);;
		MusicSelected musicSelected = (MusicSelected)bindObjectByExpression(activeMSD,MusicSelected_INST_musicSelected,null, true);;
		shoesConnectedToSpotify shoesConnectedToSpotify = (shoesConnectedToSpotify)bindObjectByExpression(activeMSD,shoesConnectedToSpotify_INST_shoesConnectedToSpotify,null, true);;
		Clock Clock = (Clock)bindObjectByExpression(activeMSD,Clock_INST_Clock,null, true);;

		MSDMethod MSDm0 = new MSDMethod(musicSelected,musicSelected,
			MSDMethods.MusicSelected_MusicSelected_musicPlaying,null,"MusicSelected:MusicSelected:musicPlaying",niceName,activeMSD.getGlobalId());// musicPlaying() Execute
		MSDMethod MSDm1 = new MSDMethod(User,musicMode,
			MSDMethods.Env_MusicMode_musicButton,null,"Env:MusicMode:musicButton",niceName,activeMSD.getGlobalId());// musicButton() Monitored
		MSDMethod MSDm2 = new MSDMethod(shoesConnectedToSpotify,shoesConnectedToSpotify,
			MSDMethods.shoesConnectedToSpotify_shoesConnectedToSpotify_musicPlaying,null,"shoesConnectedToSpotify:shoesConnectedToSpotify:musicPlaying",niceName,activeMSD.getGlobalId());// musicPlaying() Execute

		 if(activeMSD.isInCut(0,0,0,0,0))
		{
				ME.add(MSDm1);
				CV.add(MSDm0,MSDm2);
				return;
		}
		 if(activeMSD.isInCut(2,4,3,3,3))
		{
				if(MSDm0.sourceInstance!=null && MSDm0.targetInstance!=null){
					EE.add(MSDm0);
				}
				HV.add(MSDm2,MSDm1);
				return;
		}
		 if(activeMSD.isInCut(3,5,5,4,4))
		{
				if(MSDm2.sourceInstance!=null && MSDm2.targetInstance!=null){
					EE.add(MSDm2);
				}
				HV.add(MSDm0,MSDm1);
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
			Env User = (Env) activeMSD.getLineInstance(Env_INST_User);
			MusicMode musicMode = (MusicMode) activeMSD.getLineInstance(MusicMode_INST_musicMode);
			MusicSelected musicSelected = (MusicSelected) activeMSD.getLineInstance(MusicSelected_INST_musicSelected);
			shoesConnectedToSpotify shoesConnectedToSpotify = (shoesConnectedToSpotify) activeMSD.getLineInstance(shoesConnectedToSpotify_INST_shoesConnectedToSpotify);
			Clock Clock = (Clock) activeMSD.getLineInstance(Clock_INST_Clock);
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
