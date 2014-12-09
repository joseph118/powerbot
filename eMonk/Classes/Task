package Classes;

import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;

/**
 * Created by Joseph18 on 11/29/2014.
 */
public abstract class Task <C extends ClientContext> extends ClientAccessor<C>{
    public Task(C ctx){
        super(ctx);
    }

    public abstract boolean activate();
    public abstract void execute();
    public abstract String getTask();
}
