package Classes;

import org.powerbot.script.Filter;
import org.powerbot.script.rt6.Npc;

/**
 * Created by Joseph18 on 12/5/2014.
 */
public class Methods{
    public static Filter<Npc> nonCombatFilter = new Filter<Npc>() {
        @Override
        public boolean accept(Npc npc) {
            return npc.valid() && !npc.inCombat();
        }
    };
}
