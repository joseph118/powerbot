package Classes;

import Model.Abilities;
import org.powerbot.script.rt6.Action;
import org.powerbot.script.rt6.Npc;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Created by Joseph18 on 12/6/2014.
 */
public class ClientContext extends org.powerbot.script.rt6.ClientContext{
    private Abilities getAbilitiesList;
    private ArrayList<ActionRT6> actionList;
    private Npc targetNPC;
    private int npcID;

    public ClientContext(org.powerbot.script.rt6.ClientContext ctx){
        super(ctx);
        getAbilitiesList = new Abilities();
        actionList = new ArrayList<ActionRT6>();
    }

    public double getHealth(){
        return (this.combatBar.health() / (double) this.combatBar.maximumHealth()) * 100;
    }

    public ArrayList<ActionRT6> getActionBar(){
        return this.actionList;
    }

    public void setActionBar(){
        final Action[] actions = this.combatBar.actions();
        for(Action act : actions){
            if(act.valid() == true && act.type() == Action.Type.ABILITY){
                ActionRT6 ab = new ActionRT6(this, act.slot(), act.type(), act.id());
                ab.setAdrenaline(getAbilitiesList.getAdrenaline(act.id()));
                ab.setName(getAbilitiesList.getName(act.id()));
                this.actionList.add(ab);
            }
        }
        System.out.println("Skills Found: " + this.actionList.size());
    }

    public void setTargetNpc(Npc npc){
        this.targetNPC = npc;
    }

    public void findClosestNpc(){
        setTargetNpc(this.npcs.select().select(Methods.nonCombatFilter).id(npcID).nearest().poll());
    }

    public Npc getTargetNPC(){
        return this.targetNPC;
    }

    public void setNpcID(int id){
        this.npcID = id;
    }
}
