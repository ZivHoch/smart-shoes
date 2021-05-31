//  The file MSDMethods.java was automatically generated using S2A .
//  For information see http://www.wisdom.weizmann.ac.il/~maozs/s2a/

package aspects;

import il.ac.wis.cs.s2a.runtime.lib.IAspectCreator;
import il.ac.wis.cs.s2a.runtime.lib.PlaygoCoordinator;

public class AspectsCreator implements IAspectCreator
{
	private transient PlaygoCoordinator playgoCoordinator = null;

	private MSDCoordinatorAspect aspectsCoordinator = null;

	public void createAspects()
	{
		playgoCoordinator = new PlaygoCoordinator();
		aspectsCoordinator = new MSDCoordinatorAspect(playgoCoordinator);
		aspectsCoordinator.addAspect(new MSDAspectMusic(playgoCoordinator));
		aspectsCoordinator.addAspect(new MSDAspectSneaker_surface(playgoCoordinator));
		aspectsCoordinator.addAspect(new MSDAspectFORBBIDEN(playgoCoordinator));
		aspectsCoordinator.addAspect(new MSDAspectuserControl(playgoCoordinator));
		aspectsCoordinator.addAspect(new MSDAspectBatteryState(playgoCoordinator));
		aspectsCoordinator.addAspect(new MSDAspectLightsActivatedByspotify(playgoCoordinator));
		aspectsCoordinator.addAspect(new MSDAspectLightsActivatedBySelectingMusic(playgoCoordinator));
		playgoCoordinator.setMSDCoordinatorAspect(aspectsCoordinator);
		aspectsCoordinator.subscribe();
		aspectsCoordinator.init();
	}

	public void restartAspects()
	{
		aspectsCoordinator.restartAspects(playgoCoordinator.getAllLscs().getLscs().values());
		playgoCoordinator.restartSubscribersForAllAspects();
		aspectsCoordinator.subscribe();
	}

	public PlaygoCoordinator getPlaygoCoordinator() {
		return playgoCoordinator;	}

}

