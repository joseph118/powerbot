package Tasks;

import Classes.Task;
import Classes.ClientContext;
import org.powerbot.script.Condition;

import java.util.concurrent.Callable;

/**
 * Created by Joseph18 on 12/4/2014.
 */
public class Chat extends Task<ClientContext> {

    public Chat(ClientContext ctx) {
        super(ctx);
    }
    private String task = "";

    @Override
    public boolean activate() {
        return ctx.chat.queryContinue();
    }

    @Override
    public void execute() {
        setTask("Clicking Continue");
        System.out.println(getTask());
        ctx.chat.clickContinue(true);

        Condition.wait(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                return !ctx.chat.get().isEmpty() || ctx.chat.queryContinue();
            }
        }, 1000, 5);
    }


    public String getTask(){
        return this.task;
    }
    private void setTask(String task){
        this.task = task;
    }
}
