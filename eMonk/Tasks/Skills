package Tasks;

import Classes.ActionRT6;
import Classes.Task;
import org.powerbot.script.Condition;
import Classes.ClientContext;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import static org.powerbot.script.Random.nextInt;

/**
 * Created by Joseph18 on 12/3/2014.
 */
public class Skills extends Task<ClientContext> {
    private boolean isSkillOn;
    private ArrayList<ActionRT6> getAbilities = ctx.getActionBar();
    private int ran = 0;
    private int minimumHealthPercentage = 0;
    private int localAdrenaline = 0;
    private String task = "";

    public Skills(ClientContext ctx, boolean isSkillOn, int minimumHealthPercentage){
        super(ctx);
        this.isSkillOn = isSkillOn;
        this.minimumHealthPercentage = minimumHealthPercentage;
    }

    @Override
    public boolean activate() {
        ran = nextInt(0, getAbilities.size());
        return isSkillOn == true
                && !ctx.players.local().idle()
                && ctx.players.local().inCombat()
                && ctx.getTargetNPC().valid()
                && ctx.combatBar.targetName() != ""
                && getAbilities.size() != 0;
    }

    @Override
    public void execute(){
        localAdrenaline = ctx.players.local().adrenalinePercent();
        if(getAbilities.get(ran).getAdrenaline() <= localAdrenaline){
            if (getAbilities.get(ran).ready()) {
                setTask("Using Skill - " + getAbilities.get(ran).getName());
                System.out.println(getTask());
                getAbilities.get(ran).select(true);
                Condition.wait(new Callable<Boolean>() {
                    @Override
                    public Boolean call() throws Exception {
                        return ctx.players.local().idle()
                                || ctx.getHealth() < minimumHealthPercentage
                                || ctx.getTargetNPC().valid();
                    }
                });
            }
        } else {
            System.out.println("Not Enough Adrenaline to use: " + getAbilities.get(ran).getName());
        }
    }

    public String getTask(){
        return this.task;
    }
    private void setTask(String task){
        this.task = task;
    }
}
