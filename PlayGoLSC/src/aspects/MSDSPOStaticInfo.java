package aspects;

import java.util.ArrayList;
import java.util.HashMap;

public class MSDSPOStaticInfo {

	private static HashMap<String,HashMap<Integer,String>> interactionsLifelines=null;
	private static HashMap<String,HashMap<Integer,String>> interactionsVariables=null;


	public static HashMap<String,HashMap<Integer,String>>
		getInteractionLifelines()
	{
		if(interactionsLifelines==null){
			buildInteractionsLifelines();
		}
		return interactionsLifelines;
	}

	private static void buildInteractionsLifelines()
	{
		interactionsLifelines=new HashMap<String,HashMap<Integer,String>>();
		HashMap<Integer,String> lifelines = null;

		lifelines = new HashMap<Integer,String>();
		lifelines.put(0,"musicSelected");
		lifelines.put(1,"rGBMode");
		interactionsLifelines.put("LightsActivatedBySelectingMusic", lifelines);

		lifelines = new HashMap<Integer,String>();
		lifelines.put(0,"shoesConnectedToSpotify");
		lifelines.put(1,"rGBMode");
		interactionsLifelines.put("LightsActivatedByspotify", lifelines);

		lifelines = new HashMap<Integer,String>();
		lifelines.put(0,"User");
		lifelines.put(1,"musicMode");
		lifelines.put(2,"musicSelected");
		lifelines.put(3,"shoesConnectedToSpotify");
		lifelines.put(4,"Clock");
		interactionsLifelines.put("Music", lifelines);

		lifelines = new HashMap<Integer,String>();
		lifelines.put(0,"battery");
		lifelines.put(1,"sneakersMode");
		interactionsLifelines.put("BatteryState", lifelines);

		lifelines = new HashMap<Integer,String>();
		lifelines.put(0,"rGBMode");
		lifelines.put(1,"sneakersMode");
		interactionsLifelines.put("Sneaker_surface", lifelines);

		lifelines = new HashMap<Integer,String>();
		lifelines.put(0,"sneakersMode");
		lifelines.put(1,"waterproofSurfaceMode");
		lifelines.put(2,"hardSurfaceMode");
		lifelines.put(3,"runningSurfaceMode");
		lifelines.put(4,"shockabserverSurfaceMode");
		lifelines.put(5,"survivalMode");
		interactionsLifelines.put("FORBBIDEN", lifelines);

		lifelines = new HashMap<Integer,String>();
		lifelines.put(0,"User");
		lifelines.put(1,"musicSelected");
		interactionsLifelines.put("userControl", lifelines);
	}


	public static HashMap<String,HashMap<Integer,String>>
		getInteractionVariables()
	{
		if(interactionsVariables==null){
			buildInteractionsVariables();
		}
		return interactionsVariables;
	}

	private static void buildInteractionsVariables()
	{
		interactionsVariables=new HashMap<String,HashMap<Integer,String>>();
		HashMap<Integer,String> variables = null;
	}

}

