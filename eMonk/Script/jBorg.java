package Script;

import Classes.Task;
import Classes.ClientContext;
import Tasks.*;
import View.jBorgUI;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;

import javax.swing.*;
import java.util.*;
import java.util.List;

/**
 * Created by Joseph18 on 11/29/2014.
 */


@Script.Manifest(name = "eMonk Destroyer", description = "Kills monks for ever")
public class jBorg extends PollingScript<ClientContext>{
    public jBorg(){
        ctx.setNpcID(npcID);
    }

    private final int npcID = 7727;
    private int healthPercentageBeforeHealing = 90;
    private int minimumHealthPercentage = 20;
    private boolean isSkillOn = false;
    private JFrame frame;
    jBorgUI f;
    private String task = "Current Task: Idle";
    private String totalKills = "Total Kills: 0";

    private List<Task> taskList = new ArrayList<Task>();

    @Override
    public void start(){
        UIManager.put("swing.boldMetal", Boolean.FALSE);

        frame = new JFrame("eMonk Killer");
        f = new jBorgUI(this);
        f.userInterface(frame.getContentPane());
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void startBot(){
        ctx.setActionBar();
        ctx.findClosestNpc();
        taskList.addAll(Arrays.asList(
                new Attack(ctx, healthPercentageBeforeHealing),
                new Talk(ctx, healthPercentageBeforeHealing),
                new Chat(ctx),
                new Heal(ctx),
                new Danger(ctx, minimumHealthPercentage),
                new Skills(ctx, isSkillOn, minimumHealthPercentage),
                new FindTarget(ctx)
        ));
    }

    @Override
    public void poll(){
        for (Task task : taskList){
            f.updateTime();
            if(task.activate()){
                task.execute();
                if(task.getTask().contains("Total Kills")){
                    setKillCounter(task.getTask());
                } else {
                    setTask(task.getTask());
                }
                f.updateUI();
            }
        }
    }

    public String getTask(){
        return this.task;
    }
    private void setTask(String task){
        this.task = "Current Task: " + task;
    }
    public String getTotalKills(){
        return this.totalKills;
    }
    private void setKillCounter(String totalKills){
        this.totalKills = totalKills;
    }

    public void setHealthPercentageToHeal(int x){
        this.healthPercentageBeforeHealing = x;
    }

    public void setIsSkillOn(boolean x){
        this.isSkillOn = x;
    }
}
