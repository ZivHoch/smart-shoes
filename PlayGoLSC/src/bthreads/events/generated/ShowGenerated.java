
package bthreads.events.generated;

import il.ac.wis.cs.bpjs2a.MessageEvent;

public class ShowGenerated
    extends MessageEvent
{

    public ShowGenerated(String className, Object ... args) {
		super("show", "BPJ", className,
			playgo.systemmodel.classes.Env.class, 
			playgo.systemmodel.classes.SneakersMode.class);
		setArgsVals(java.util.Arrays.asList(args));
	}
}
