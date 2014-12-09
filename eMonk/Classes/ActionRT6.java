package Classes;

import org.powerbot.script.rt6.Action;
import org.powerbot.script.rt6.ClientContext;

/**
 * Created by Joseph18 on 12/8/2014.
 */
public class ActionRT6 extends Action {
    private String name;
    private int adrenaline;

    public ActionRT6(ClientContext ctx, int slot, Action.Type type, int id){
        super(ctx, slot, type, id);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAdrenaline(int adrenaline){
        this.adrenaline = adrenaline;
    }

    public String getName(){
        return this.name;
    }

    public int getAdrenaline(){
        return this.adrenaline;
    }

}
