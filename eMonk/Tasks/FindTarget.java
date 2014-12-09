package Tasks;

import Classes.ClientContext;
import Classes.Task;

/**
 * Created by Joseph18 on 12/8/2014.
 */
public class FindTarget extends Task<ClientContext> {
    private int killCounter;
    public FindTarget(ClientContext ctx){
        super(ctx);
        killCounter = 0;
    }

    @Override
    public boolean activate() {
        return !ctx.getTargetNPC().valid();
    }

    @Override
    public void execute() {
        killCounter++;
        System.out.println("Total Kills: " + killCounter);
        ctx.findClosestNpc();
    }

    public String getTask(){
        return "Total Kills: " + this.killCounter;
    }

}
