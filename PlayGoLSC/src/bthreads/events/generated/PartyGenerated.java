
package bthreads.events.generated;

import il.ac.wis.cs.bpjs2a.MessageEvent;

public class PartyGenerated
    extends MessageEvent
{

    public PartyGenerated(String className, Object ... args) {
		super("party", "BPJ", className,
			playgo.systemmodel.classes.Env.class, 
			playgo.systemmodel.classes.RGBMode.class);
		setArgsVals(java.util.Arrays.asList(args));
	}
}
