package Tasks;

import Classes.Task;
import Classes.ClientContext;
import org.powerbot.script.Condition;

import java.util.concurrent.Callable;

/**
 * Created by Joseph18 on 12/5/2014.
 */
public class Talk extends Task<ClientContext> {
    private int healthPercentageThreshold;
    private String task = "";

    public Talk (ClientContext ctx, int healthPercentageThreshold){
        super(ctx);
        this.healthPercentageThreshold = healthPercentageThreshold;
    }

    @Override
    public boolean activate() {
        return  ctx.getHealth() < healthPercentageThreshold
                && !ctx.chat.queryContinue()
                && ctx.chat.get().isEmpty()
                && !ctx.players.local().inMotion()
                && ctx.getTargetNPC().valid()
                && !ctx.players.local().interacting().valid()
                && ctx.combatBar.targetName() == "";
    }

    @Override
    public void execute() {
        if (ctx.getTargetNPC().inViewport()) {
            setTask("Talking to NPC");
            System.out.println(getTask());
            ctx.getTargetNPC().interact("Talk-to");

            Condition.wait(new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {
                    return ctx.players.local().interacting().valid();
                }
            }, 1000, 3);

        } else {
            setTask("Walking to NPC");
            System.out.println(getTask());
            ctx.camera.turnTo(ctx.getTargetNPC());
            ctx.movement.step(ctx.getTargetNPC());
            Condition.wait(new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {
                    return ctx.getTargetNPC().inViewport();
                }
            }, 3000, 3);
        }
    }


    public String getTask(){
        return this.task;
    }
    private void setTask(String task){
        this.task = task;
    }
}
