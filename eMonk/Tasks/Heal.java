package Tasks;

import Classes.Task;
import org.powerbot.script.Condition;
import org.powerbot.script.rt6.ChatOption;
import Classes.ClientContext;

import java.util.concurrent.Callable;

/**
 * Created by Joseph18 on 12/5/2014.
 */
public class Heal extends Task<ClientContext> {
    private String task = "";

    public Heal(ClientContext ctx){
        super(ctx);
    }

    @Override
    public boolean activate() {
        return !ctx.chat.get().isEmpty();
    }

    @Override
    public void execute() {
        setTask("Talking with NPC to heal");
        System.out.println(getTask());
        ChatOption getOption = ctx.chat.select().text("Can you heal me? I'm Injured.").poll();

        if(getOption.valid()){
            ctx.input.send("{VK_1}");
        }

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
