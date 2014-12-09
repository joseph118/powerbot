package Tasks;

import Classes.Task;
import Classes.ClientContext;
import org.powerbot.script.rt6.GameObject;

/**
 * Created by Joseph18 on 12/5/2014.
 */
public class Danger extends Task<ClientContext> {
    private int minimumHealthPercentage;
    private String task = "";

    public Danger(ClientContext ctx, int minimumHealthPercentage){
        super(ctx);
        this.minimumHealthPercentage = minimumHealthPercentage;
    }

    @Override
    public boolean activate() {
        return ctx.getHealth() < minimumHealthPercentage
                && ctx.getTargetNPC().valid();
    }

    @Override
    public void execute() {
        GameObject safeObject = ctx.objects.select().id(30849).nearest().poll();
        if (safeObject.inViewport()) {
            ctx.movement.step(safeObject);
            setTask("Running to Safety");
            System.out.println(getTask());
        } else {
            setTask("Moving to Safety");
            System.out.println(getTask());
            ctx.camera.turnTo(safeObject);
            ctx.movement.step(safeObject);
        }
    }

    public String getTask(){
        return this.task;
    }
    private void setTask(String task){
        this.task = task;
    }
}
