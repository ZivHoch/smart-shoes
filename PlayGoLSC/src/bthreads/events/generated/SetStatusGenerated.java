
package bthreads.events.generated;

import il.ac.wis.cs.bpjs2a.MessageEvent;

public class SetStatusGenerated
    extends MessageEvent
{

    public SetStatusGenerated(String className, Object ... args) {
		super("setStatus", "BPJ", className,
			playgo.systemmodel.classes.Env.class, 
			playgo.systemmodel.classes.SneakersMode.class);
		setArgsVals(java.util.Arrays.asList(args));
	}
}
