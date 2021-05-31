//  The file MSDAspectFORBBIDEN.aj was automatically generated using S2A .
//  For information see http://www.wisdom.weizmann.ac.il/~maozs/s2a/

package aspects;

import playgo.systemmodel.classes.*;
import playgo.systemmodel.classes.generated.*;
import playgo.systemmodel.types.*;
import java.util.ArrayList;
import java.io.Serializable;
import il.ac.wis.cs.s2a.runtime.lib.*;
import il.ac.wis.cs.playgo.playtoolkit.*;


public class MSDAspectFORBBIDEN extends MSDAspect implements MSDSubscribe, Serializable
{


	//Constants for instances, locations and variables
	static final int SneakersMode_INST_sneakersMode = 0;
	static final int WaterproofSurfaceMode_INST_waterproofSurfaceMode = 1;
	static final int HardSurfaceMode_INST_hardSurfaceMode = 2;
	static final int RunningSurfaceMode_INST_runningSurfaceMode = 3;
	static final int ShockabserverSurfaceMode_INST_shockabserverSurfaceMode = 4;
	static final int SurvivalMode_INST_survivalMode = 5;

	static final int String_arg_String_exact_String_arg10 = 0;
	static final int String_arg_String_exact_String_arg01 = 1;
	static final int String_arg_String_exact_String_arg02 = 2;
	static final int String_arg_String_exact_String_arg03 = 3;
	static final int String_arg_String_exact_String_arg04 = 4;
	static final int String_arg_String_exact_String_arg05 = 5;

	static final int long_var_symbolic_Timer = 6;

	private final String niceName = "FORBBIDEN";

	public MSDAspectFORBBIDEN()
	{
		this(null);	}

	public MSDAspectFORBBIDEN(PlaygoCoordinator coordinator)
	{
		super(coordinator);
		subscribe();
		addAspectEvent(MSDMethods.SneakersMode_SneakersMode_sneakersActive);
		addAspectEvent(MSDMethods.SneakersMode_SneakersMode_setStatus);
		addAspectEvent(MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus);
		addAspectEvent(MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus);
		addAspectEvent(MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus);
		addAspectEvent(MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus);
		addAspectEvent(MSDMethods.SurvivalMode_SurvivalMode_setStatus);

		addMinimalEvent(MSDMethods.SneakersMode_SneakersMode_sneakersActive);
		setHotCut(4,3,2,3,3,2);
		setHotCut(4,2,2,2,2,3);
		setHotCut(4,2,3,3,2,2);
		setHotCut(4,3,3,3,2,3);
		setHotCut(4,2,2,2,3,3);
		setHotCut(4,2,3,3,3,2);
		setHotCut(4,3,3,2,2,2);
		setHotCut(4,2,2,3,2,3);
		setHotCut(4,3,3,3,3,3);
		setHotCut(4,2,2,2,2,2);
		setHotCut(4,3,2,2,2,3);
		setHotCut(4,3,3,2,3,2);
		setHotCut(4,2,2,2,3,2);
		setHotCut(4,3,2,2,3,3);
		setHotCut(4,2,2,3,3,3);
		setHotCut(4,3,3,3,2,2);
		setHotCut(4,2,3,2,2,3);
		setHotCut(4,3,3,3,3,2);
		setHotCut(4,2,2,3,2,2);
		setHotCut(4,3,2,3,2,3);
		setHotCut(4,2,3,2,3,3);
		setHotCut(4,3,2,2,2,2);
		setHotCut(4,2,3,3,2,3);
		setHotCut(4,3,2,3,3,3);
		setHotCut(4,2,2,3,3,2);
		setHotCut(4,2,3,2,2,2);
		setHotCut(4,3,3,2,2,3);
		setHotCut(4,3,2,2,3,2);
		setHotCut(4,2,3,3,3,3);
		setHotCut(4,3,3,2,3,3);
		setHotCut(4,2,3,2,3,2);
		setHotCut(4,3,2,3,2,2);
		setLastCut(4,4,4,4,4,4);
		numberOfLifeLines = 6;
		numberOfInstances = 6;
		numberOfVariables = 7;
		numberOfTimeTags = 0;
		interactionId = "1621250800350";
		setCutsExpressions();
	}

	public void subscribe(){
		getPlaygoCoordinator().subscribe(this, 
			"SneakersMode", "SneakersMode", "sneakersActive");
		getPlaygoCoordinator().subscribe(this, 
			"SneakersMode", "SneakersMode", "setStatus");
		getPlaygoCoordinator().subscribe(this, 
			"WaterproofSurfaceMode", "WaterproofSurfaceMode", "setStatus");
		getPlaygoCoordinator().subscribe(this, 
			"HardSurfaceMode", "HardSurfaceMode", "setStatus");
		getPlaygoCoordinator().subscribe(this, 
			"RunningSurfaceMode", "RunningSurfaceMode", "setStatus");
		getPlaygoCoordinator().subscribe(this, 
			"ShockabserverSurfaceMode", "ShockabserverSurfaceMode", "setStatus");
		getPlaygoCoordinator().subscribe(this, 
			"SurvivalMode", "SurvivalMode", "setStatus");
	}

	protected void  setPrivateVariables(int MSDm, Object sourceObject, Object targetObject,ActiveMSDAspect activeMSD,
		ArrayList args)
	{
		switch (MSDm)
		{
			case MSDMethods.SneakersMode_SneakersMode_setStatus:
						activeMSD.setPrivateVariable(String_arg_String_exact_String_arg10,args.get(0));

				break;

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
					if(activeMSD.isInCut(0,0,0,0,0,0))
					{
						cutChanged=true; activeMSD.setCut(1,0,0,0,0,0);
						if(evaluateCondition(1,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(2,1,1,1,1,1);
							return cutChanged;
						}
						break;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			case MSDMethods.SneakersMode_SneakersMode_setStatus:
				if(activeMSD.instancesEquals(SneakersMode_INST_sneakersMode,sourceObject)
					&& activeMSD.instancesEquals(SneakersMode_INST_sneakersMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg10,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(2,1,1,1,1,1))
					{
						cutChanged=true; activeMSD.setCut(3,1,1,1,1,1);
						if(evaluateCondition(3,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(4,2,2,2,2,2);
							return cutChanged;
						}
						break;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			case MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus:
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,2,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,2,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,3,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,3,3);
						if(evaluateCondition(3,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(4,4,4,4,4,4);
							break;
						}
						break;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,3,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,3,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,3,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,2,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg04,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,3,3,2);
						return cutChanged;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			case MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus:
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,2,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,3,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,3,3);
						if(evaluateCondition(3,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(4,4,4,4,4,4);
							break;
						}
						break;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,3,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,2,2,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,2,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,3,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,2,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,2,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(HardSurfaceMode_INST_hardSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg02,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,2,2);
						return cutChanged;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			case MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus:
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,3,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,3,3);
						if(evaluateCondition(3,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(4,4,4,4,4,4);
							break;
						}
						break;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,3,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,2,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,3,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,2,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,2,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,2,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,2,2,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(WaterproofSurfaceMode_INST_waterproofSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg01,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,2,2);
						return cutChanged;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			case MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus:
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,2,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,3,3);
						if(evaluateCondition(3,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(4,4,4,4,4,4);
							break;
						}
						break;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,3,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,3,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,3,3,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,2,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,2,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,2,3))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,3,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,2,2);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,sourceObject)
					&& activeMSD.instancesEquals(RunningSurfaceMode_INST_runningSurfaceMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg03,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,3,2,2);
						return cutChanged;
					}
				}
				if(!unification)//No unification...
					return false;
				break;

			case MSDMethods.SurvivalMode_SurvivalMode_setStatus:
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,3,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,3,3);
						if(evaluateCondition(3,activeMSD))
						{
							cutChanged=true; activeMSD.setCut(4,4,4,4,4,4);
							break;
						}
						break;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,3,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,2,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,3,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,3,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,3,3,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,2,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,2,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,3,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,3,3,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,3,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,3,3,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,2,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,2,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,2,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,3,2,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,3,2,3,2,3);
						return cutChanged;
					}
				}
				if(activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,sourceObject)
					&& activeMSD.instancesEquals(SurvivalMode_INST_survivalMode,targetObject)
					&& activeMSD.variableEquals(String_arg_String_exact_String_arg05,args.get(0)))
				{
					unification=true;
					if(activeMSD.isInCut(4,2,2,3,2,2))
					{
						cutChanged=true; activeMSD.setCut(4,2,2,3,2,3);
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
		SneakersMode sneakersMode = (SneakersMode)bindObjectByExpression(activeMSD,SneakersMode_INST_sneakersMode,null, true);;
		WaterproofSurfaceMode waterproofSurfaceMode = (WaterproofSurfaceMode)bindObjectByExpression(activeMSD,WaterproofSurfaceMode_INST_waterproofSurfaceMode,null, true);;
		HardSurfaceMode hardSurfaceMode = (HardSurfaceMode)bindObjectByExpression(activeMSD,HardSurfaceMode_INST_hardSurfaceMode,null, true);;
		RunningSurfaceMode runningSurfaceMode = (RunningSurfaceMode)bindObjectByExpression(activeMSD,RunningSurfaceMode_INST_runningSurfaceMode,null, true);;
		ShockabserverSurfaceMode shockabserverSurfaceMode = (ShockabserverSurfaceMode)bindObjectByExpression(activeMSD,ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,null, true);;
		SurvivalMode survivalMode = (SurvivalMode)bindObjectByExpression(activeMSD,SurvivalMode_INST_survivalMode,null, true);;

		String arg01 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg01)!=null){
			arg01 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg01);
		}

		String arg10 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg10)!=null){
			arg10 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg10);
		}

		String arg04 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg04)!=null){
			arg04 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg04);
		}

		String arg05 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg05)!=null){
			arg05 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg05);
		}

		String arg02 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg02)!=null){
			arg02 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg02);
		}

		String arg03 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg03)!=null){
			arg03 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg03);
		}

		switch (conditionNumber)
		{
			case 1: 
				return true;
			case 3: 
				return false;
		}
		return false;
	}

	@SuppressWarnings("unused")
	private void evaluateForbiddenConditions(ActiveMSDAspect activeMSD)
	{
		SneakersMode sneakersMode = (SneakersMode)bindObjectByExpression(activeMSD,SneakersMode_INST_sneakersMode,null, true);;
		WaterproofSurfaceMode waterproofSurfaceMode = (WaterproofSurfaceMode)bindObjectByExpression(activeMSD,WaterproofSurfaceMode_INST_waterproofSurfaceMode,null, true);;
		HardSurfaceMode hardSurfaceMode = (HardSurfaceMode)bindObjectByExpression(activeMSD,HardSurfaceMode_INST_hardSurfaceMode,null, true);;
		RunningSurfaceMode runningSurfaceMode = (RunningSurfaceMode)bindObjectByExpression(activeMSD,RunningSurfaceMode_INST_runningSurfaceMode,null, true);;
		ShockabserverSurfaceMode shockabserverSurfaceMode = (ShockabserverSurfaceMode)bindObjectByExpression(activeMSD,ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,null, true);;
		SurvivalMode survivalMode = (SurvivalMode)bindObjectByExpression(activeMSD,SurvivalMode_INST_survivalMode,null, true);;

		String arg01 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg01)!=null){
			arg01 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg01);
		}

		String arg10 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg10)!=null){
			arg10 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg10);
		}

		String arg04 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg04)!=null){
			arg04 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg04);
		}

		String arg05 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg05)!=null){
			arg05 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg05);
		}

		String arg02 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg02)!=null){
			arg02 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg02);
		}

		String arg03 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg03)!=null){
			arg03 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg03);
		}

	
	}

	protected void setCutsExpressions()
	{
		this.setExpressionForCut("4,4,4,4,4,4" , "Forbid");
		this.setExpressionForCut("4,2,2,2,2,2" , "Exit");
		this.setExpressionForCut("2,1,1,1,1,1" , "true");

	}


	@SuppressWarnings("unused")
	protected void doBindings(ActiveMSDAspect activeMSD)
	{
		activeMSD.setLineInstance(SneakersMode_INST_sneakersMode,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("sneakersMode","SneakersMode"));
		activeMSD.setLineInstance(WaterproofSurfaceMode_INST_waterproofSurfaceMode,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("waterproofSurfaceMode","WaterproofSurfaceMode"));
		activeMSD.setLineInstance(HardSurfaceMode_INST_hardSurfaceMode,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("hardSurfaceMode","HardSurfaceMode"));
		activeMSD.setLineInstance(RunningSurfaceMode_INST_runningSurfaceMode,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("runningSurfaceMode","RunningSurfaceMode"));
		activeMSD.setLineInstance(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("shockabserverSurfaceMode","ShockabserverSurfaceMode"));
		activeMSD.setLineInstance(SurvivalMode_INST_survivalMode,((AppObjects)getPlaygoCoordinator().getAppObjects()).getObject("survivalMode","SurvivalMode"));
		SneakersMode sneakersMode = (SneakersMode)bindObjectByExpression(activeMSD,SneakersMode_INST_sneakersMode, null, false );
		WaterproofSurfaceMode waterproofSurfaceMode = (WaterproofSurfaceMode)bindObjectByExpression(activeMSD,WaterproofSurfaceMode_INST_waterproofSurfaceMode, null, false );
		HardSurfaceMode hardSurfaceMode = (HardSurfaceMode)bindObjectByExpression(activeMSD,HardSurfaceMode_INST_hardSurfaceMode, null, false );
		RunningSurfaceMode runningSurfaceMode = (RunningSurfaceMode)bindObjectByExpression(activeMSD,RunningSurfaceMode_INST_runningSurfaceMode, null, false );
		ShockabserverSurfaceMode shockabserverSurfaceMode = (ShockabserverSurfaceMode)bindObjectByExpression(activeMSD,ShockabserverSurfaceMode_INST_shockabserverSurfaceMode, null, false );
		SurvivalMode survivalMode = (SurvivalMode)bindObjectByExpression(activeMSD,SurvivalMode_INST_survivalMode, null, false );

		String arg01 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg01)!=null){
			arg01 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg01);
		}

		String arg10 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg10)!=null){
			arg10 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg10);
		}

		String arg04 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg04)!=null){
			arg04 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg04);
		}

		String arg05 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg05)!=null){
			arg05 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg05);
		}

		String arg02 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg02)!=null){
			arg02 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg02);
		}

		String arg03 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg03)!=null){
			arg03 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg03);
		}
		long Timer = 0;
		if(activeMSD.getPrivateVariable(long_var_symbolic_Timer)!=null){
			Timer = (Long) activeMSD.getPrivateVariable(long_var_symbolic_Timer);
		} 

		try{
			activeMSD.setPrivateVariable(String_arg_String_exact_String_arg10, (String)"active");
		}catch(Exception e){}
		try{
			activeMSD.setPrivateVariable(String_arg_String_exact_String_arg01, (String)"active");
		}catch(Exception e){}
		try{
			activeMSD.setPrivateVariable(String_arg_String_exact_String_arg02, (String)"active");
		}catch(Exception e){}
		try{
			activeMSD.setPrivateVariable(String_arg_String_exact_String_arg03, (String)"active");
		}catch(Exception e){}
		try{
			activeMSD.setPrivateVariable(String_arg_String_exact_String_arg04, (String)"active");
		}catch(Exception e){}
		try{
			activeMSD.setPrivateVariable(String_arg_String_exact_String_arg05, (String)"active");
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

	private void after_SneakersMode_SneakersMode_sneakersActive(Object _sneakersModeSource ,Object _sneakersMode)
	{
		changeCutState(MSDMethods.SneakersMode_SneakersMode_sneakersActive,
					_sneakersMode,_sneakersMode,null);
	}

	private void after_SneakersMode_SneakersMode_setStatus(Object _sneakersModeSource ,Object _sneakersMode, ArrayList<Object> args)
	{
		changeCutState(MSDMethods.SneakersMode_SneakersMode_setStatus,
					_sneakersMode,_sneakersMode,args);
	}

	private void after_WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus(Object _waterproofSurfaceModeSource ,Object _waterproofSurfaceMode, ArrayList<Object> args)
	{
		changeCutState(MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,
					_waterproofSurfaceMode,_waterproofSurfaceMode,args);
	}

	private void after_HardSurfaceMode_HardSurfaceMode_setStatus(Object _hardSurfaceModeSource ,Object _hardSurfaceMode, ArrayList<Object> args)
	{
		changeCutState(MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,
					_hardSurfaceMode,_hardSurfaceMode,args);
	}

	private void after_RunningSurfaceMode_RunningSurfaceMode_setStatus(Object _runningSurfaceModeSource ,Object _runningSurfaceMode, ArrayList<Object> args)
	{
		changeCutState(MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,
					_runningSurfaceMode,_runningSurfaceMode,args);
	}

	private void after_ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus(Object _shockabserverSurfaceModeSource ,Object _shockabserverSurfaceMode, ArrayList<Object> args)
	{
		changeCutState(MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,
					_shockabserverSurfaceMode,_shockabserverSurfaceMode,args);
	}

	private void after_SurvivalMode_SurvivalMode_setStatus(Object _survivalModeSource ,Object _survivalMode, ArrayList<Object> args)
	{
		changeCutState(MSDMethods.SurvivalMode_SurvivalMode_setStatus,
					_survivalMode,_survivalMode,args);
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
		if(srcClassName.equals("SneakersMode") && tgtClassName.equals("SneakersMode") && method.equals("setStatus")){
			after_SneakersMode_SneakersMode_setStatus(source, target, argValues);
			return;
		}
		if(srcClassName.equals("WaterproofSurfaceMode") && tgtClassName.equals("WaterproofSurfaceMode") && method.equals("setStatus")){
			after_WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus(source, target, argValues);
			return;
		}
		if(srcClassName.equals("HardSurfaceMode") && tgtClassName.equals("HardSurfaceMode") && method.equals("setStatus")){
			after_HardSurfaceMode_HardSurfaceMode_setStatus(source, target, argValues);
			return;
		}
		if(srcClassName.equals("RunningSurfaceMode") && tgtClassName.equals("RunningSurfaceMode") && method.equals("setStatus")){
			after_RunningSurfaceMode_RunningSurfaceMode_setStatus(source, target, argValues);
			return;
		}
		if(srcClassName.equals("ShockabserverSurfaceMode") && tgtClassName.equals("ShockabserverSurfaceMode") && method.equals("setStatus")){
			after_ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus(source, target, argValues);
			return;
		}
		if(srcClassName.equals("SurvivalMode") && tgtClassName.equals("SurvivalMode") && method.equals("setStatus")){
			after_SurvivalMode_SurvivalMode_setStatus(source, target, argValues);
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
		SneakersMode sneakersMode = (SneakersMode)bindObjectByExpression(activeMSD,SneakersMode_INST_sneakersMode,null, true);;
		WaterproofSurfaceMode waterproofSurfaceMode = (WaterproofSurfaceMode)bindObjectByExpression(activeMSD,WaterproofSurfaceMode_INST_waterproofSurfaceMode,null, true);;
		HardSurfaceMode hardSurfaceMode = (HardSurfaceMode)bindObjectByExpression(activeMSD,HardSurfaceMode_INST_hardSurfaceMode,null, true);;
		RunningSurfaceMode runningSurfaceMode = (RunningSurfaceMode)bindObjectByExpression(activeMSD,RunningSurfaceMode_INST_runningSurfaceMode,null, true);;
		ShockabserverSurfaceMode shockabserverSurfaceMode = (ShockabserverSurfaceMode)bindObjectByExpression(activeMSD,ShockabserverSurfaceMode_INST_shockabserverSurfaceMode,null, true);;
		SurvivalMode survivalMode = (SurvivalMode)bindObjectByExpression(activeMSD,SurvivalMode_INST_survivalMode,null, true);;

		String VAR_String_exact_String_arg01 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg01)!=null){
			VAR_String_exact_String_arg01 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg01);
		}

		String VAR_String_exact_String_arg10 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg10)!=null){
			VAR_String_exact_String_arg10 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg10);
		}

		String VAR_String_exact_String_arg04 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg04)!=null){
			VAR_String_exact_String_arg04 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg04);
		}

		String VAR_String_exact_String_arg05 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg05)!=null){
			VAR_String_exact_String_arg05 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg05);
		}

		String VAR_String_exact_String_arg02 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg02)!=null){
			VAR_String_exact_String_arg02 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg02);
		}

		String VAR_String_exact_String_arg03 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg03)!=null){
			VAR_String_exact_String_arg03 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg03);
		}

		MSDMethod MSDm5 = new MSDMethod(sneakersMode,sneakersMode,
			MSDMethods.SneakersMode_SneakersMode_sneakersActive,null,"SneakersMode:SneakersMode:sneakersActive",niceName,activeMSD.getGlobalId());// sneakersActive() Monitored
		ArrayList<Object>  args6 = getArgsList(VAR_String_exact_String_arg10);
		MSDMethod MSDm6 = new MSDMethod(sneakersMode,sneakersMode,
			MSDMethods.SneakersMode_SneakersMode_setStatus,args6,"SneakersMode:SneakersMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Monitored
		ArrayList<Object>  args7 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm7 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args7,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args8 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm8 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args8,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args9 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm9 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args9,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args10 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm10 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args10,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args11 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm11 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args11,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args12 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm12 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args12,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args13 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm13 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args13,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args14 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm14 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args14,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args15 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm15 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args15,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args16 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm16 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args16,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args17 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm17 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args17,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args18 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm18 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args18,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args19 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm19 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args19,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args20 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm20 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args20,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args21 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm21 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args21,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args22 = getArgsList(VAR_String_exact_String_arg04);
		MSDMethod MSDm22 = new MSDMethod(shockabserverSurfaceMode,shockabserverSurfaceMode,
			MSDMethods.ShockabserverSurfaceMode_ShockabserverSurfaceMode_setStatus,args22,"ShockabserverSurfaceMode:ShockabserverSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args23 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm23 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args23,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args24 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm24 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args24,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args25 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm25 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args25,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args26 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm26 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args26,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args27 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm27 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args27,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args28 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm28 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args28,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args29 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm29 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args29,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args30 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm30 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args30,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args31 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm31 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args31,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args32 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm32 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args32,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args33 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm33 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args33,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args34 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm34 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args34,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args35 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm35 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args35,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args36 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm36 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args36,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args37 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm37 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args37,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args38 = getArgsList(VAR_String_exact_String_arg02);
		MSDMethod MSDm38 = new MSDMethod(hardSurfaceMode,hardSurfaceMode,
			MSDMethods.HardSurfaceMode_HardSurfaceMode_setStatus,args38,"HardSurfaceMode:HardSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args39 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm39 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args39,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args40 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm40 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args40,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args41 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm41 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args41,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args42 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm42 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args42,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args43 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm43 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args43,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args44 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm44 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args44,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args45 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm45 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args45,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args46 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm46 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args46,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args47 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm47 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args47,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args48 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm48 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args48,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args49 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm49 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args49,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args50 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm50 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args50,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args51 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm51 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args51,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args52 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm52 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args52,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args53 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm53 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args53,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args54 = getArgsList(VAR_String_exact_String_arg01);
		MSDMethod MSDm54 = new MSDMethod(waterproofSurfaceMode,waterproofSurfaceMode,
			MSDMethods.WaterproofSurfaceMode_WaterproofSurfaceMode_setStatus,args54,"WaterproofSurfaceMode:WaterproofSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args55 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm55 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args55,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args56 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm56 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args56,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args57 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm57 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args57,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args58 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm58 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args58,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args59 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm59 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args59,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args60 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm60 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args60,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args61 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm61 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args61,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args62 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm62 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args62,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args63 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm63 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args63,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args64 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm64 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args64,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args65 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm65 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args65,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args66 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm66 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args66,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args67 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm67 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args67,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args68 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm68 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args68,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args69 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm69 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args69,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args70 = getArgsList(VAR_String_exact_String_arg05);
		MSDMethod MSDm70 = new MSDMethod(survivalMode,survivalMode,
			MSDMethods.SurvivalMode_SurvivalMode_setStatus,args70,"SurvivalMode:SurvivalMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args71 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm71 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args71,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args72 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm72 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args72,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args73 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm73 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args73,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args74 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm74 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args74,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args75 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm75 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args75,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args76 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm76 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args76,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args77 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm77 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args77,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args78 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm78 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args78,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args79 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm79 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args79,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args80 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm80 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args80,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args81 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm81 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args81,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args82 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm82 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args82,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args83 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm83 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args83,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args84 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm84 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args84,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args85 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm85 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args85,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute
		ArrayList<Object>  args86 = getArgsList(VAR_String_exact_String_arg03);
		MSDMethod MSDm86 = new MSDMethod(runningSurfaceMode,runningSurfaceMode,
			MSDMethods.RunningSurfaceMode_RunningSurfaceMode_setStatus,args86,"RunningSurfaceMode:RunningSurfaceMode:setStatus",niceName,activeMSD.getGlobalId());// setStatus() Execute

		 if(activeMSD.isInCut(0,0,0,0,0,0))
		{
				ME.add(MSDm5);
				CV.add(MSDm16,MSDm59,MSDm35,MSDm66,MSDm80,MSDm6,MSDm12,MSDm27);
				CV.add(MSDm58,MSDm72,MSDm38,MSDm82,MSDm7,MSDm11,MSDm26,MSDm40);
				CV.add(MSDm57,MSDm71,MSDm67,MSDm22,MSDm78,MSDm70,MSDm84,MSDm31);
				CV.add(MSDm18,MSDm44,MSDm61,MSDm75,MSDm54,MSDm85,MSDm13,MSDm28);
				CV.add(MSDm41,MSDm33,MSDm47,MSDm64,MSDm14,MSDm29,MSDm42,MSDm73);
				CV.add(MSDm9,MSDm24,MSDm55,MSDm53,MSDm34,MSDm48,MSDm65,MSDm79);
				CV.add(MSDm37,MSDm50,MSDm81,MSDm20,MSDm45,MSDm21,MSDm46,MSDm51);
				CV.add(MSDm68,MSDm77,MSDm17,MSDm43,MSDm60,MSDm36,MSDm49,MSDm19);
				CV.add(MSDm62,MSDm76,MSDm86,MSDm8,MSDm23,MSDm32,MSDm63,MSDm15);
				CV.add(MSDm30,MSDm74,MSDm52,MSDm69,MSDm83,MSDm10,MSDm25,MSDm39);
				CV.add(MSDm56);
				return;
		}
		 if(activeMSD.isInCut(2,1,1,1,1,1))
		{
				ME.add(MSDm6);
				CV.add(MSDm16,MSDm59,MSDm35,MSDm66,MSDm80,MSDm12,MSDm27,MSDm58);
				CV.add(MSDm72,MSDm38,MSDm82,MSDm7,MSDm11,MSDm26,MSDm40,MSDm57);
				CV.add(MSDm71,MSDm67,MSDm22,MSDm78,MSDm70,MSDm84,MSDm31,MSDm18);
				CV.add(MSDm44,MSDm61,MSDm75,MSDm54,MSDm85,MSDm13,MSDm28,MSDm41);
				CV.add(MSDm33,MSDm47,MSDm64,MSDm14,MSDm29,MSDm42,MSDm73,MSDm9);
				CV.add(MSDm24,MSDm55,MSDm53,MSDm34,MSDm48,MSDm65,MSDm79,MSDm37);
				CV.add(MSDm50,MSDm81,MSDm20,MSDm45,MSDm21,MSDm46,MSDm51,MSDm68);
				CV.add(MSDm77,MSDm17,MSDm43,MSDm60,MSDm36,MSDm49,MSDm19,MSDm62);
				CV.add(MSDm76,MSDm86,MSDm8,MSDm23,MSDm5,MSDm32,MSDm63,MSDm15);
				CV.add(MSDm30,MSDm74,MSDm52,MSDm69,MSDm83,MSDm10,MSDm25,MSDm39);
				CV.add(MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,2,2,2,2,2))
		{
				if(MSDm7.sourceInstance!=null && MSDm7.targetInstance!=null){
					EE.add(MSDm7);
				}
				if(MSDm31.sourceInstance!=null && MSDm31.targetInstance!=null){
					EE.add(MSDm31);
				}
				if(MSDm67.sourceInstance!=null && MSDm67.targetInstance!=null){
					EE.add(MSDm67);
				}
				if(MSDm53.sourceInstance!=null && MSDm53.targetInstance!=null){
					EE.add(MSDm53);
				}
				if(MSDm86.sourceInstance!=null && MSDm86.targetInstance!=null){
					EE.add(MSDm86);
				}
				HV.add(MSDm6,MSDm5);
				return;
		}
		 if(activeMSD.isInCut(4,2,2,2,2,3))
		{
				if(MSDm16.sourceInstance!=null && MSDm16.targetInstance!=null){
					EE.add(MSDm16);
				}
				if(MSDm32.sourceInstance!=null && MSDm32.targetInstance!=null){
					EE.add(MSDm32);
				}
				if(MSDm51.sourceInstance!=null && MSDm51.targetInstance!=null){
					EE.add(MSDm51);
				}
				if(MSDm84.sourceInstance!=null && MSDm84.targetInstance!=null){
					EE.add(MSDm84);
				}
				HV.add(MSDm59,MSDm66,MSDm6,MSDm58,MSDm57,MSDm67,MSDm70,MSDm61);
				HV.add(MSDm64,MSDm55,MSDm65,MSDm68,MSDm60,MSDm62,MSDm5,MSDm63);
				HV.add(MSDm69,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,2,3,2,2,2))
		{
				if(MSDm8.sourceInstance!=null && MSDm8.targetInstance!=null){
					EE.add(MSDm8);
				}
				if(MSDm63.sourceInstance!=null && MSDm63.targetInstance!=null){
					EE.add(MSDm63);
				}
				if(MSDm49.sourceInstance!=null && MSDm49.targetInstance!=null){
					EE.add(MSDm49);
				}
				if(MSDm82.sourceInstance!=null && MSDm82.targetInstance!=null){
					EE.add(MSDm82);
				}
				HV.add(MSDm35,MSDm6,MSDm27,MSDm38,MSDm26,MSDm31,MSDm28,MSDm33);
				HV.add(MSDm29,MSDm24,MSDm34,MSDm37,MSDm36,MSDm23,MSDm5,MSDm32);
				HV.add(MSDm30,MSDm25);
				return;
		}
		 if(activeMSD.isInCut(4,2,3,2,2,3))
		{
				if(MSDm9.sourceInstance!=null && MSDm9.targetInstance!=null){
					EE.add(MSDm9);
				}
				if(MSDm47.sourceInstance!=null && MSDm47.targetInstance!=null){
					EE.add(MSDm47);
				}
				if(MSDm80.sourceInstance!=null && MSDm80.targetInstance!=null){
					EE.add(MSDm80);
				}
				HV.add(MSDm59,MSDm35,MSDm66,MSDm6,MSDm27,MSDm58,MSDm38,MSDm26);
				HV.add(MSDm57,MSDm67,MSDm70,MSDm31,MSDm61,MSDm28,MSDm33,MSDm64);
				HV.add(MSDm29,MSDm24,MSDm55,MSDm34,MSDm65,MSDm37,MSDm68,MSDm60);
				HV.add(MSDm36,MSDm62,MSDm23,MSDm5,MSDm32,MSDm63,MSDm30,MSDm69);
				HV.add(MSDm25,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,3,2,2,2,2))
		{
				if(MSDm20.sourceInstance!=null && MSDm20.targetInstance!=null){
					EE.add(MSDm20);
				}
				if(MSDm36.sourceInstance!=null && MSDm36.targetInstance!=null){
					EE.add(MSDm36);
				}
				if(MSDm68.sourceInstance!=null && MSDm68.targetInstance!=null){
					EE.add(MSDm68);
				}
				if(MSDm85.sourceInstance!=null && MSDm85.targetInstance!=null){
					EE.add(MSDm85);
				}
				HV.add(MSDm6,MSDm40,MSDm44,MSDm54,MSDm41,MSDm47,MSDm42,MSDm53);
				HV.add(MSDm48,MSDm50,MSDm45,MSDm46,MSDm51,MSDm43,MSDm49,MSDm5);
				HV.add(MSDm52,MSDm39);
				return;
		}
		 if(activeMSD.isInCut(4,3,2,2,2,3))
		{
				if(MSDm17.sourceInstance!=null && MSDm17.targetInstance!=null){
					EE.add(MSDm17);
				}
				if(MSDm33.sourceInstance!=null && MSDm33.targetInstance!=null){
					EE.add(MSDm33);
				}
				if(MSDm83.sourceInstance!=null && MSDm83.targetInstance!=null){
					EE.add(MSDm83);
				}
				HV.add(MSDm59,MSDm66,MSDm6,MSDm58,MSDm40,MSDm57,MSDm67,MSDm70);
				HV.add(MSDm44,MSDm61,MSDm54,MSDm41,MSDm47,MSDm64,MSDm42,MSDm55);
				HV.add(MSDm53,MSDm48,MSDm65,MSDm50,MSDm45,MSDm46,MSDm51,MSDm68);
				HV.add(MSDm43,MSDm60,MSDm49,MSDm62,MSDm5,MSDm63,MSDm52,MSDm69);
				HV.add(MSDm39,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,3,3,2,2,2))
		{
				if(MSDm13.sourceInstance!=null && MSDm13.targetInstance!=null){
					EE.add(MSDm13);
				}
				if(MSDm64.sourceInstance!=null && MSDm64.targetInstance!=null){
					EE.add(MSDm64);
				}
				if(MSDm81.sourceInstance!=null && MSDm81.targetInstance!=null){
					EE.add(MSDm81);
				}
				HV.add(MSDm35,MSDm6,MSDm27,MSDm38,MSDm26,MSDm40,MSDm31,MSDm44);
				HV.add(MSDm54,MSDm28,MSDm41,MSDm33,MSDm47,MSDm29,MSDm42,MSDm24);
				HV.add(MSDm53,MSDm34,MSDm48,MSDm37,MSDm50,MSDm45,MSDm46,MSDm51);
				HV.add(MSDm43,MSDm36,MSDm49,MSDm23,MSDm5,MSDm32,MSDm30,MSDm52);
				HV.add(MSDm25,MSDm39);
				return;
		}
		 if(activeMSD.isInCut(4,3,3,2,2,3))
		{
				if(MSDm10.sourceInstance!=null && MSDm10.targetInstance!=null){
					EE.add(MSDm10);
				}
				if(MSDm79.sourceInstance!=null && MSDm79.targetInstance!=null){
					EE.add(MSDm79);
				}
				HV.add(MSDm59,MSDm35,MSDm66,MSDm6,MSDm27,MSDm58,MSDm38,MSDm26);
				HV.add(MSDm40,MSDm57,MSDm67,MSDm70,MSDm31,MSDm44,MSDm61,MSDm54);
				HV.add(MSDm28,MSDm41,MSDm33,MSDm47,MSDm64,MSDm29,MSDm42,MSDm24);
				HV.add(MSDm55,MSDm53,MSDm34,MSDm48,MSDm65,MSDm37,MSDm50,MSDm45);
				HV.add(MSDm46,MSDm51,MSDm68,MSDm43,MSDm60,MSDm36,MSDm49,MSDm62);
				HV.add(MSDm23,MSDm5,MSDm32,MSDm63,MSDm30,MSDm52,MSDm69,MSDm25);
				HV.add(MSDm39,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,2,2,3,2,2))
		{
				if(MSDm22.sourceInstance!=null && MSDm22.targetInstance!=null){
					EE.add(MSDm22);
				}
				if(MSDm38.sourceInstance!=null && MSDm38.targetInstance!=null){
					EE.add(MSDm38);
				}
				if(MSDm70.sourceInstance!=null && MSDm70.targetInstance!=null){
					EE.add(MSDm70);
				}
				if(MSDm54.sourceInstance!=null && MSDm54.targetInstance!=null){
					EE.add(MSDm54);
				}
				HV.add(MSDm80,MSDm6,MSDm72,MSDm82,MSDm71,MSDm78,MSDm84,MSDm75);
				HV.add(MSDm85,MSDm73,MSDm79,MSDm81,MSDm77,MSDm76,MSDm86,MSDm5);
				HV.add(MSDm74,MSDm83);
				return;
		}
		 if(activeMSD.isInCut(4,2,2,3,2,3))
		{
				if(MSDm19.sourceInstance!=null && MSDm19.targetInstance!=null){
					EE.add(MSDm19);
				}
				if(MSDm35.sourceInstance!=null && MSDm35.targetInstance!=null){
					EE.add(MSDm35);
				}
				if(MSDm52.sourceInstance!=null && MSDm52.targetInstance!=null){
					EE.add(MSDm52);
				}
				HV.add(MSDm59,MSDm66,MSDm80,MSDm6,MSDm58,MSDm72,MSDm82,MSDm57);
				HV.add(MSDm71,MSDm67,MSDm78,MSDm70,MSDm84,MSDm61,MSDm75,MSDm85);
				HV.add(MSDm64,MSDm73,MSDm55,MSDm65,MSDm79,MSDm81,MSDm68,MSDm77);
				HV.add(MSDm60,MSDm62,MSDm76,MSDm86,MSDm5,MSDm63,MSDm74,MSDm69);
				HV.add(MSDm83,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,2,3,3,2,2))
		{
				if(MSDm15.sourceInstance!=null && MSDm15.targetInstance!=null){
					EE.add(MSDm15);
				}
				if(MSDm66.sourceInstance!=null && MSDm66.targetInstance!=null){
					EE.add(MSDm66);
				}
				if(MSDm50.sourceInstance!=null && MSDm50.targetInstance!=null){
					EE.add(MSDm50);
				}
				HV.add(MSDm35,MSDm80,MSDm6,MSDm27,MSDm72,MSDm38,MSDm82,MSDm26);
				HV.add(MSDm71,MSDm78,MSDm84,MSDm31,MSDm75,MSDm85,MSDm28,MSDm33);
				HV.add(MSDm29,MSDm73,MSDm24,MSDm34,MSDm79,MSDm37,MSDm81,MSDm77);
				HV.add(MSDm36,MSDm76,MSDm86,MSDm23,MSDm5,MSDm32,MSDm30,MSDm74);
				HV.add(MSDm83,MSDm25);
				return;
		}
		 if(activeMSD.isInCut(4,2,3,3,2,3))
		{
				if(MSDm12.sourceInstance!=null && MSDm12.targetInstance!=null){
					EE.add(MSDm12);
				}
				if(MSDm48.sourceInstance!=null && MSDm48.targetInstance!=null){
					EE.add(MSDm48);
				}
				HV.add(MSDm59,MSDm35,MSDm66,MSDm80,MSDm6,MSDm27,MSDm58,MSDm72);
				HV.add(MSDm38,MSDm82,MSDm26,MSDm57,MSDm71,MSDm67,MSDm78,MSDm70);
				HV.add(MSDm84,MSDm31,MSDm61,MSDm75,MSDm85,MSDm28,MSDm33,MSDm64);
				HV.add(MSDm29,MSDm73,MSDm24,MSDm55,MSDm34,MSDm65,MSDm79,MSDm37);
				HV.add(MSDm81,MSDm68,MSDm77,MSDm60,MSDm36,MSDm62,MSDm76,MSDm86);
				HV.add(MSDm23,MSDm5,MSDm32,MSDm63,MSDm30,MSDm74,MSDm69,MSDm83);
				HV.add(MSDm25,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,3,2,3,2,2))
		{
				if(MSDm21.sourceInstance!=null && MSDm21.targetInstance!=null){
					EE.add(MSDm21);
				}
				if(MSDm37.sourceInstance!=null && MSDm37.targetInstance!=null){
					EE.add(MSDm37);
				}
				if(MSDm69.sourceInstance!=null && MSDm69.targetInstance!=null){
					EE.add(MSDm69);
				}
				HV.add(MSDm80,MSDm6,MSDm72,MSDm82,MSDm40,MSDm71,MSDm78,MSDm84);
				HV.add(MSDm44,MSDm75,MSDm54,MSDm85,MSDm41,MSDm47,MSDm42,MSDm73);
				HV.add(MSDm53,MSDm48,MSDm79,MSDm50,MSDm81,MSDm45,MSDm46,MSDm51);
				HV.add(MSDm77,MSDm43,MSDm49,MSDm76,MSDm86,MSDm5,MSDm74,MSDm52);
				HV.add(MSDm83,MSDm39);
				return;
		}
		 if(activeMSD.isInCut(4,3,2,3,2,3))
		{
				if(MSDm18.sourceInstance!=null && MSDm18.targetInstance!=null){
					EE.add(MSDm18);
				}
				if(MSDm34.sourceInstance!=null && MSDm34.targetInstance!=null){
					EE.add(MSDm34);
				}
				HV.add(MSDm59,MSDm66,MSDm80,MSDm6,MSDm58,MSDm72,MSDm82,MSDm40);
				HV.add(MSDm57,MSDm71,MSDm67,MSDm78,MSDm70,MSDm84,MSDm44,MSDm61);
				HV.add(MSDm75,MSDm54,MSDm85,MSDm41,MSDm47,MSDm64,MSDm42,MSDm73);
				HV.add(MSDm55,MSDm53,MSDm48,MSDm65,MSDm79,MSDm50,MSDm81,MSDm45);
				HV.add(MSDm46,MSDm51,MSDm68,MSDm77,MSDm43,MSDm60,MSDm49,MSDm62);
				HV.add(MSDm76,MSDm86,MSDm5,MSDm63,MSDm74,MSDm52,MSDm69,MSDm83);
				HV.add(MSDm39,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,3,3,3,2,2))
		{
				if(MSDm14.sourceInstance!=null && MSDm14.targetInstance!=null){
					EE.add(MSDm14);
				}
				if(MSDm65.sourceInstance!=null && MSDm65.targetInstance!=null){
					EE.add(MSDm65);
				}
				HV.add(MSDm35,MSDm80,MSDm6,MSDm27,MSDm72,MSDm38,MSDm82,MSDm26);
				HV.add(MSDm40,MSDm71,MSDm78,MSDm84,MSDm31,MSDm44,MSDm75,MSDm54);
				HV.add(MSDm85,MSDm28,MSDm41,MSDm33,MSDm47,MSDm29,MSDm42,MSDm73);
				HV.add(MSDm24,MSDm53,MSDm34,MSDm48,MSDm79,MSDm37,MSDm50,MSDm81);
				HV.add(MSDm45,MSDm46,MSDm51,MSDm77,MSDm43,MSDm36,MSDm49,MSDm76);
				HV.add(MSDm86,MSDm23,MSDm5,MSDm32,MSDm30,MSDm74,MSDm52,MSDm83);
				HV.add(MSDm25,MSDm39);
				return;
		}
		 if(activeMSD.isInCut(4,3,3,3,2,3))
		{
				if(MSDm11.sourceInstance!=null && MSDm11.targetInstance!=null){
					EE.add(MSDm11);
				}
				HV.add(MSDm16,MSDm59,MSDm35,MSDm66,MSDm80,MSDm6,MSDm12,MSDm27);
				HV.add(MSDm58,MSDm72,MSDm38,MSDm82,MSDm7,MSDm11,MSDm26,MSDm40);
				HV.add(MSDm57,MSDm71,MSDm67,MSDm22,MSDm78,MSDm70,MSDm84,MSDm31);
				HV.add(MSDm18,MSDm44,MSDm61,MSDm75,MSDm54,MSDm85,MSDm13,MSDm28);
				HV.add(MSDm41,MSDm33,MSDm47,MSDm64,MSDm14,MSDm29,MSDm42,MSDm73);
				HV.add(MSDm9,MSDm24,MSDm55,MSDm53,MSDm34,MSDm48,MSDm65,MSDm79);
				HV.add(MSDm37,MSDm50,MSDm81,MSDm20,MSDm45,MSDm21,MSDm46,MSDm51);
				HV.add(MSDm68,MSDm77,MSDm17,MSDm43,MSDm60,MSDm36,MSDm49,MSDm19);
				HV.add(MSDm62,MSDm76,MSDm86,MSDm8,MSDm23,MSDm5,MSDm32,MSDm63);
				HV.add(MSDm15,MSDm30,MSDm74,MSDm52,MSDm69,MSDm83,MSDm10,MSDm25);
				HV.add(MSDm39,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,2,2,2,3,2))
		{
				if(MSDm23.sourceInstance!=null && MSDm23.targetInstance!=null){
					EE.add(MSDm23);
				}
				if(MSDm59.sourceInstance!=null && MSDm59.targetInstance!=null){
					EE.add(MSDm59);
				}
				if(MSDm45.sourceInstance!=null && MSDm45.targetInstance!=null){
					EE.add(MSDm45);
				}
				if(MSDm78.sourceInstance!=null && MSDm78.targetInstance!=null){
					EE.add(MSDm78);
				}
				HV.add(MSDm16,MSDm6,MSDm12,MSDm7,MSDm11,MSDm22,MSDm18,MSDm13);
				HV.add(MSDm14,MSDm9,MSDm20,MSDm21,MSDm17,MSDm19,MSDm8,MSDm5);
				HV.add(MSDm15,MSDm10);
				return;
		}
		 if(activeMSD.isInCut(4,2,2,2,3,3))
		{
				if(MSDm24.sourceInstance!=null && MSDm24.targetInstance!=null){
					EE.add(MSDm24);
				}
				if(MSDm43.sourceInstance!=null && MSDm43.targetInstance!=null){
					EE.add(MSDm43);
				}
				if(MSDm76.sourceInstance!=null && MSDm76.targetInstance!=null){
					EE.add(MSDm76);
				}
				HV.add(MSDm16,MSDm59,MSDm66,MSDm6,MSDm12,MSDm58,MSDm7,MSDm11);
				HV.add(MSDm57,MSDm67,MSDm22,MSDm70,MSDm18,MSDm61,MSDm13,MSDm64);
				HV.add(MSDm14,MSDm9,MSDm55,MSDm65,MSDm20,MSDm21,MSDm68,MSDm17);
				HV.add(MSDm60,MSDm19,MSDm62,MSDm8,MSDm5,MSDm63,MSDm15,MSDm69);
				HV.add(MSDm10,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,2,3,2,3,2))
		{
				if(MSDm55.sourceInstance!=null && MSDm55.targetInstance!=null){
					EE.add(MSDm55);
				}
				if(MSDm41.sourceInstance!=null && MSDm41.targetInstance!=null){
					EE.add(MSDm41);
				}
				if(MSDm74.sourceInstance!=null && MSDm74.targetInstance!=null){
					EE.add(MSDm74);
				}
				HV.add(MSDm16,MSDm35,MSDm6,MSDm12,MSDm27,MSDm38,MSDm7,MSDm11);
				HV.add(MSDm26,MSDm22,MSDm31,MSDm18,MSDm13,MSDm28,MSDm33,MSDm14);
				HV.add(MSDm29,MSDm9,MSDm24,MSDm34,MSDm37,MSDm20,MSDm21,MSDm17);
				HV.add(MSDm36,MSDm19,MSDm8,MSDm23,MSDm5,MSDm32,MSDm15,MSDm30);
				HV.add(MSDm10,MSDm25);
				return;
		}
		 if(activeMSD.isInCut(4,2,3,2,3,3))
		{
				if(MSDm39.sourceInstance!=null && MSDm39.targetInstance!=null){
					EE.add(MSDm39);
				}
				if(MSDm72.sourceInstance!=null && MSDm72.targetInstance!=null){
					EE.add(MSDm72);
				}
				HV.add(MSDm16,MSDm59,MSDm35,MSDm66,MSDm6,MSDm12,MSDm27,MSDm58);
				HV.add(MSDm38,MSDm7,MSDm11,MSDm26,MSDm57,MSDm67,MSDm22,MSDm70);
				HV.add(MSDm31,MSDm18,MSDm61,MSDm13,MSDm28,MSDm33,MSDm64,MSDm14);
				HV.add(MSDm29,MSDm9,MSDm24,MSDm55,MSDm34,MSDm65,MSDm37,MSDm20);
				HV.add(MSDm21,MSDm68,MSDm17,MSDm60,MSDm36,MSDm19,MSDm62,MSDm8);
				HV.add(MSDm23,MSDm5,MSDm32,MSDm63,MSDm15,MSDm30,MSDm69,MSDm10);
				HV.add(MSDm25,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,3,2,2,3,2))
		{
				if(MSDm28.sourceInstance!=null && MSDm28.targetInstance!=null){
					EE.add(MSDm28);
				}
				if(MSDm60.sourceInstance!=null && MSDm60.targetInstance!=null){
					EE.add(MSDm60);
				}
				if(MSDm77.sourceInstance!=null && MSDm77.targetInstance!=null){
					EE.add(MSDm77);
				}
				HV.add(MSDm16,MSDm6,MSDm12,MSDm7,MSDm11,MSDm40,MSDm22,MSDm18);
				HV.add(MSDm44,MSDm54,MSDm13,MSDm41,MSDm47,MSDm14,MSDm42,MSDm9);
				HV.add(MSDm53,MSDm48,MSDm50,MSDm20,MSDm45,MSDm21,MSDm46,MSDm51);
				HV.add(MSDm17,MSDm43,MSDm49,MSDm19,MSDm8,MSDm5,MSDm15,MSDm52);
				HV.add(MSDm10,MSDm39);
				return;
		}
		 if(activeMSD.isInCut(4,3,2,2,3,3))
		{
				if(MSDm25.sourceInstance!=null && MSDm25.targetInstance!=null){
					EE.add(MSDm25);
				}
				if(MSDm75.sourceInstance!=null && MSDm75.targetInstance!=null){
					EE.add(MSDm75);
				}
				HV.add(MSDm16,MSDm59,MSDm66,MSDm6,MSDm12,MSDm58,MSDm7,MSDm11);
				HV.add(MSDm40,MSDm57,MSDm67,MSDm22,MSDm70,MSDm18,MSDm44,MSDm61);
				HV.add(MSDm54,MSDm13,MSDm41,MSDm47,MSDm64,MSDm14,MSDm42,MSDm9);
				HV.add(MSDm55,MSDm53,MSDm48,MSDm65,MSDm50,MSDm20,MSDm45,MSDm21);
				HV.add(MSDm46,MSDm51,MSDm68,MSDm17,MSDm43,MSDm60,MSDm49,MSDm19);
				HV.add(MSDm62,MSDm8,MSDm5,MSDm63,MSDm15,MSDm52,MSDm69,MSDm10);
				HV.add(MSDm39,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,3,3,2,3,2))
		{
				if(MSDm56.sourceInstance!=null && MSDm56.targetInstance!=null){
					EE.add(MSDm56);
				}
				if(MSDm73.sourceInstance!=null && MSDm73.targetInstance!=null){
					EE.add(MSDm73);
				}
				HV.add(MSDm16,MSDm35,MSDm6,MSDm12,MSDm27,MSDm38,MSDm7,MSDm11);
				HV.add(MSDm26,MSDm40,MSDm22,MSDm31,MSDm18,MSDm44,MSDm54,MSDm13);
				HV.add(MSDm28,MSDm41,MSDm33,MSDm47,MSDm14,MSDm29,MSDm42,MSDm9);
				HV.add(MSDm24,MSDm53,MSDm34,MSDm48,MSDm37,MSDm50,MSDm20,MSDm45);
				HV.add(MSDm21,MSDm46,MSDm51,MSDm17,MSDm43,MSDm36,MSDm49,MSDm19);
				HV.add(MSDm8,MSDm23,MSDm5,MSDm32,MSDm15,MSDm30,MSDm52,MSDm10);
				HV.add(MSDm25,MSDm39);
				return;
		}
		 if(activeMSD.isInCut(4,3,3,2,3,3))
		{
				if(MSDm71.sourceInstance!=null && MSDm71.targetInstance!=null){
					EE.add(MSDm71);
				}
				HV.add(MSDm16,MSDm59,MSDm35,MSDm66,MSDm80,MSDm6,MSDm12,MSDm27);
				HV.add(MSDm58,MSDm72,MSDm38,MSDm82,MSDm7,MSDm11,MSDm26,MSDm40);
				HV.add(MSDm57,MSDm71,MSDm67,MSDm22,MSDm78,MSDm70,MSDm84,MSDm31);
				HV.add(MSDm18,MSDm44,MSDm61,MSDm75,MSDm54,MSDm85,MSDm13,MSDm28);
				HV.add(MSDm41,MSDm33,MSDm47,MSDm64,MSDm14,MSDm29,MSDm42,MSDm73);
				HV.add(MSDm9,MSDm24,MSDm55,MSDm53,MSDm34,MSDm48,MSDm65,MSDm79);
				HV.add(MSDm37,MSDm50,MSDm81,MSDm20,MSDm45,MSDm21,MSDm46,MSDm51);
				HV.add(MSDm68,MSDm77,MSDm17,MSDm43,MSDm60,MSDm36,MSDm49,MSDm19);
				HV.add(MSDm62,MSDm76,MSDm86,MSDm8,MSDm23,MSDm5,MSDm32,MSDm63);
				HV.add(MSDm15,MSDm30,MSDm74,MSDm52,MSDm69,MSDm83,MSDm10,MSDm25);
				HV.add(MSDm39,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,2,2,3,3,2))
		{
				if(MSDm30.sourceInstance!=null && MSDm30.targetInstance!=null){
					EE.add(MSDm30);
				}
				if(MSDm62.sourceInstance!=null && MSDm62.targetInstance!=null){
					EE.add(MSDm62);
				}
				if(MSDm46.sourceInstance!=null && MSDm46.targetInstance!=null){
					EE.add(MSDm46);
				}
				HV.add(MSDm16,MSDm80,MSDm6,MSDm12,MSDm72,MSDm82,MSDm7,MSDm11);
				HV.add(MSDm71,MSDm22,MSDm78,MSDm84,MSDm18,MSDm75,MSDm85,MSDm13);
				HV.add(MSDm14,MSDm73,MSDm9,MSDm79,MSDm81,MSDm20,MSDm21,MSDm77);
				HV.add(MSDm17,MSDm19,MSDm76,MSDm86,MSDm8,MSDm5,MSDm15,MSDm74);
				HV.add(MSDm83,MSDm10);
				return;
		}
		 if(activeMSD.isInCut(4,2,2,3,3,3))
		{
				if(MSDm27.sourceInstance!=null && MSDm27.targetInstance!=null){
					EE.add(MSDm27);
				}
				if(MSDm44.sourceInstance!=null && MSDm44.targetInstance!=null){
					EE.add(MSDm44);
				}
				HV.add(MSDm16,MSDm59,MSDm66,MSDm80,MSDm6,MSDm12,MSDm58,MSDm72);
				HV.add(MSDm82,MSDm7,MSDm11,MSDm57,MSDm71,MSDm67,MSDm22,MSDm78);
				HV.add(MSDm70,MSDm84,MSDm18,MSDm61,MSDm75,MSDm85,MSDm13,MSDm64);
				HV.add(MSDm14,MSDm73,MSDm9,MSDm55,MSDm65,MSDm79,MSDm81,MSDm20);
				HV.add(MSDm21,MSDm68,MSDm77,MSDm17,MSDm60,MSDm19,MSDm62,MSDm76);
				HV.add(MSDm86,MSDm8,MSDm5,MSDm63,MSDm15,MSDm74,MSDm69,MSDm83);
				HV.add(MSDm10,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,2,3,3,3,2))
		{
				if(MSDm58.sourceInstance!=null && MSDm58.targetInstance!=null){
					EE.add(MSDm58);
				}
				if(MSDm42.sourceInstance!=null && MSDm42.targetInstance!=null){
					EE.add(MSDm42);
				}
				HV.add(MSDm16,MSDm35,MSDm80,MSDm6,MSDm12,MSDm27,MSDm72,MSDm38);
				HV.add(MSDm82,MSDm7,MSDm11,MSDm26,MSDm71,MSDm22,MSDm78,MSDm84);
				HV.add(MSDm31,MSDm18,MSDm75,MSDm85,MSDm13,MSDm28,MSDm33,MSDm14);
				HV.add(MSDm29,MSDm73,MSDm9,MSDm24,MSDm34,MSDm79,MSDm37,MSDm81);
				HV.add(MSDm20,MSDm21,MSDm77,MSDm17,MSDm36,MSDm19,MSDm76,MSDm86);
				HV.add(MSDm8,MSDm23,MSDm5,MSDm32,MSDm15,MSDm30,MSDm74,MSDm83);
				HV.add(MSDm10,MSDm25);
				return;
		}
		 if(activeMSD.isInCut(4,2,3,3,3,3))
		{
				if(MSDm40.sourceInstance!=null && MSDm40.targetInstance!=null){
					EE.add(MSDm40);
				}
				HV.add(MSDm16,MSDm59,MSDm35,MSDm66,MSDm80,MSDm6,MSDm12,MSDm27);
				HV.add(MSDm58,MSDm72,MSDm38,MSDm82,MSDm7,MSDm11,MSDm26,MSDm40);
				HV.add(MSDm57,MSDm71,MSDm67,MSDm22,MSDm78,MSDm70,MSDm84,MSDm31);
				HV.add(MSDm18,MSDm44,MSDm61,MSDm75,MSDm54,MSDm85,MSDm13,MSDm28);
				HV.add(MSDm41,MSDm33,MSDm47,MSDm64,MSDm14,MSDm29,MSDm42,MSDm73);
				HV.add(MSDm9,MSDm24,MSDm55,MSDm53,MSDm34,MSDm48,MSDm65,MSDm79);
				HV.add(MSDm37,MSDm50,MSDm81,MSDm20,MSDm45,MSDm21,MSDm46,MSDm51);
				HV.add(MSDm68,MSDm77,MSDm17,MSDm43,MSDm60,MSDm36,MSDm49,MSDm19);
				HV.add(MSDm62,MSDm76,MSDm86,MSDm8,MSDm23,MSDm5,MSDm32,MSDm63);
				HV.add(MSDm15,MSDm30,MSDm74,MSDm52,MSDm69,MSDm83,MSDm10,MSDm25);
				HV.add(MSDm39,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,3,2,3,3,2))
		{
				if(MSDm29.sourceInstance!=null && MSDm29.targetInstance!=null){
					EE.add(MSDm29);
				}
				if(MSDm61.sourceInstance!=null && MSDm61.targetInstance!=null){
					EE.add(MSDm61);
				}
				HV.add(MSDm16,MSDm80,MSDm6,MSDm12,MSDm72,MSDm82,MSDm7,MSDm11);
				HV.add(MSDm40,MSDm71,MSDm22,MSDm78,MSDm84,MSDm18,MSDm44,MSDm75);
				HV.add(MSDm54,MSDm85,MSDm13,MSDm41,MSDm47,MSDm14,MSDm42,MSDm73);
				HV.add(MSDm9,MSDm53,MSDm48,MSDm79,MSDm50,MSDm81,MSDm20,MSDm45);
				HV.add(MSDm21,MSDm46,MSDm51,MSDm77,MSDm17,MSDm43,MSDm49,MSDm19);
				HV.add(MSDm76,MSDm86,MSDm8,MSDm5,MSDm15,MSDm74,MSDm52,MSDm83);
				HV.add(MSDm10,MSDm39);
				return;
		}
		 if(activeMSD.isInCut(4,3,2,3,3,3))
		{
				if(MSDm26.sourceInstance!=null && MSDm26.targetInstance!=null){
					EE.add(MSDm26);
				}
				HV.add(MSDm16,MSDm59,MSDm35,MSDm66,MSDm80,MSDm6,MSDm12,MSDm27);
				HV.add(MSDm58,MSDm72,MSDm38,MSDm82,MSDm7,MSDm11,MSDm26,MSDm40);
				HV.add(MSDm57,MSDm71,MSDm67,MSDm22,MSDm78,MSDm70,MSDm84,MSDm31);
				HV.add(MSDm18,MSDm44,MSDm61,MSDm75,MSDm54,MSDm85,MSDm13,MSDm28);
				HV.add(MSDm41,MSDm33,MSDm47,MSDm64,MSDm14,MSDm29,MSDm42,MSDm73);
				HV.add(MSDm9,MSDm24,MSDm55,MSDm53,MSDm34,MSDm48,MSDm65,MSDm79);
				HV.add(MSDm37,MSDm50,MSDm81,MSDm20,MSDm45,MSDm21,MSDm46,MSDm51);
				HV.add(MSDm68,MSDm77,MSDm17,MSDm43,MSDm60,MSDm36,MSDm49,MSDm19);
				HV.add(MSDm62,MSDm76,MSDm86,MSDm8,MSDm23,MSDm5,MSDm32,MSDm63);
				HV.add(MSDm15,MSDm30,MSDm74,MSDm52,MSDm69,MSDm83,MSDm10,MSDm25);
				HV.add(MSDm39,MSDm56);
				return;
		}
		 if(activeMSD.isInCut(4,3,3,3,3,2))
		{
				if(MSDm57.sourceInstance!=null && MSDm57.targetInstance!=null){
					EE.add(MSDm57);
				}
				HV.add(MSDm16,MSDm59,MSDm35,MSDm66,MSDm80,MSDm6,MSDm12,MSDm27);
				HV.add(MSDm58,MSDm72,MSDm38,MSDm82,MSDm7,MSDm11,MSDm26,MSDm40);
				HV.add(MSDm57,MSDm71,MSDm67,MSDm22,MSDm78,MSDm70,MSDm84,MSDm31);
				HV.add(MSDm18,MSDm44,MSDm61,MSDm75,MSDm54,MSDm85,MSDm13,MSDm28);
				HV.add(MSDm41,MSDm33,MSDm47,MSDm64,MSDm14,MSDm29,MSDm42,MSDm73);
				HV.add(MSDm9,MSDm24,MSDm55,MSDm53,MSDm34,MSDm48,MSDm65,MSDm79);
				HV.add(MSDm37,MSDm50,MSDm81,MSDm20,MSDm45,MSDm21,MSDm46,MSDm51);
				HV.add(MSDm68,MSDm77,MSDm17,MSDm43,MSDm60,MSDm36,MSDm49,MSDm19);
				HV.add(MSDm62,MSDm76,MSDm86,MSDm8,MSDm23,MSDm5,MSDm32,MSDm63);
				HV.add(MSDm15,MSDm30,MSDm74,MSDm52,MSDm69,MSDm83,MSDm10,MSDm25);
				HV.add(MSDm39,MSDm56);
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

		String arg01 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg01)!=null){
			arg01 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg01);
		}

		String arg10 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg10)!=null){
			arg10 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg10);
		}

		String arg04 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg04)!=null){
			arg04 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg04);
		}

		String arg05 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg05)!=null){
			arg05 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg05);
		}

		String arg02 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg02)!=null){
			arg02 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg02);
		}

		String arg03 = null;
		if(activeMSD.getPrivateVariable(String_arg_String_exact_String_arg03)!=null){
			arg03 = (String) activeMSD.getPrivateVariable(String_arg_String_exact_String_arg03);
		}

		Object result = null;
		// in case the object is already bounded returning the bounded object
		result = activeMSD.getLineInstance(lifelineIndex);
		if (result == null){
			SneakersMode sneakersMode = (SneakersMode) activeMSD.getLineInstance(SneakersMode_INST_sneakersMode);
			WaterproofSurfaceMode waterproofSurfaceMode = (WaterproofSurfaceMode) activeMSD.getLineInstance(WaterproofSurfaceMode_INST_waterproofSurfaceMode);
			HardSurfaceMode hardSurfaceMode = (HardSurfaceMode) activeMSD.getLineInstance(HardSurfaceMode_INST_hardSurfaceMode);
			RunningSurfaceMode runningSurfaceMode = (RunningSurfaceMode) activeMSD.getLineInstance(RunningSurfaceMode_INST_runningSurfaceMode);
			ShockabserverSurfaceMode shockabserverSurfaceMode = (ShockabserverSurfaceMode) activeMSD.getLineInstance(ShockabserverSurfaceMode_INST_shockabserverSurfaceMode);
			SurvivalMode survivalMode = (SurvivalMode) activeMSD.getLineInstance(SurvivalMode_INST_survivalMode);
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
