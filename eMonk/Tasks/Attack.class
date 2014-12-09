package Tasks;

import Classes.Task;
import Classes.ClientContext;
import org.powerbot.script.Condition;
import java.util.concurrent.Callable;

/**
 * Created by Joseph18 on 12/3/2014.
 */
public class Attack extends Task<ClientContext> {
    private int healthPercentageThreshold;
    private String task = "";

    public Attack(ClientContext ctx, int healthPercentageThreshold){
        super(ctx);
        this.healthPercentageThreshold = healthPercentageThreshold;
    }


    @Override
    public boolean activate() {
        return ctx.combatBar.targetName() == ""
                && ctx.getHealth() > healthPercentageThreshold
                && ctx.getTargetNPC().valid()
                && !ctx.players.local().inMotion()
                && !ctx.players.local().interacting().valid();
    }

    @Override
    public void execute() {
        if (ctx.getTargetNPC().inViewport()) {
            setTask("Attacking NPC");
            System.out.println(getTask());
            ctx.camera.turnTo(ctx.getTargetNPC());
            ctx.getTargetNPC().interact("Attack");

            Condition.wait(new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {
                    return !ctx.players.local().idle() || ctx.players.local().interacting().valid();
                }
            });

        } else {
            setTask("Moving to NPC");
            System.out.println(getTask());
            ctx.movement.step(ctx.getTargetNPC());
            ctx.camera.turnTo(ctx.getTargetNPC());

            Condition.wait(new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {
                    return ctx.getTargetNPC().inViewport();
                }
            }, 1000, 5);
        }
    }

    public String getTask(){
        return this.task;
    }
    private void setTask(String task){
        this.task = task;
    }
}
