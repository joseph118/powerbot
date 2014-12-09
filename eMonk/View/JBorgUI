package View;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.NumberFormat;
import Script.jBorg;
import javax.swing.Timer;

/**
 * Created by Joseph18 on 12/5/2014.
 */
public class jBorgUI implements ItemListener{
    JPanel menuGroup;
    jBorg getClass;
    JLabel lblTime;
    JLabel lblKills;
    JLabel lblTask;
    long startBotTime = System.currentTimeMillis();

    private String readableTime(){
        long x = System.currentTimeMillis();
        x = x - startBotTime;
        return (x/(1000*60*60))%24 + ":" + (x/(1000*60))%60 + ":" + (x/1000)%60;
    }

    public jBorgUI(jBorg x){
        this.getClass = x;
        lblTime = new JLabel("Total Time: 0");
        lblKills = new JLabel("Total Kills: 0");
        lblTask = new JLabel("Current Task: Idle");
    }

    public void updateTime(){
        lblTime.setText("Total Time: " + readableTime());
    }

    public void updateUI(){
        lblKills.setText(getClass.getTotalKills());
        lblTask.setText(getClass.getTask());
    }

    public void userInterface(Container pane){
        JPanel menuStart = new JPanel(new GridLayout(4,1));
        JPanel menuRun = new JPanel(new GridLayout(3, 1));

        menuRun.add(lblTime);
        menuRun.add(lblKills);
        menuRun.add(lblTask);
        menuRun.setBorder(BorderFactory.createEmptyBorder(0,8,0,8));

        menuGroup = new JPanel(new CardLayout());
        menuGroup.add(menuStart, "Menu");
        menuGroup.add(menuRun, "Stats");

        JPanel cboPane = new JPanel();
        String cboItems[] = {"Menu", "Stats"};
        final JComboBox cbo = new JComboBox(cboItems);
        cbo.setEditable(false);
        cbo.addItemListener(this);
        cboPane.add(cbo);


        NumberFormat format = NumberFormat.getNumberInstance();
        NumberFormatter health = new NumberFormatter(format);
        health.setValueClass(Integer.class);
        health.setMinimum(0);
        health.setMaximum(100);
        health.setCommitsOnValidEdit(true);

        JPanel m1 = new JPanel();
        m1.setLayout(new GridLayout(1,2));
        JLabel hp = new JLabel("Health in % before talking to Monk");
        final JFormattedTextField txtHP = new JFormattedTextField(health);
        txtHP.setValue(new Integer(80));
        txtHP.setColumns(2);
        hp.setLabelFor(txtHP);
        m1.add(hp);
        m1.add(txtHP);

        JPanel m2 = new JPanel();
        m2.setLayout(new GridLayout(1, 2));
        final JCheckBox useSkills = new JCheckBox();
        useSkills.setSelected(false);
        JLabel skills = new JLabel("Use Combat Skills? ");
        skills.setLabelFor(useSkills);
        m2.add(skills);
        m2.add(useSkills);

        JPanel m3 = new JPanel(new GridLayout(1,2));
        JLabel bb = new JLabel("");
        //final JCheckBox txtBB = new JCheckBox();
        final JLabel bb1 = new JLabel("");
        bb.setLabelFor(bb1);
        m3.add(bb);
        m3.add(bb1);

        JPanel m4 = new JPanel(new GridLayout(1,1,8,8));

        final JButton btnStart = new JButton("Start");
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                int getTxtHealth = Integer.parseInt(txtHP.getText());
                txtHP.setEditable(false);
                boolean getUseSkills;
                if(useSkills.isSelected()){
                    getUseSkills = true;
                } else {
                    getUseSkills = false;
                }
                useSkills.setEnabled(false);
                getClass.setHealthPercentageToHeal(getTxtHealth);
                getClass.setIsSkillOn(getUseSkills);
                getClass.startBot();
                btnStart.setVisible(false);
                cbo.setSelectedItem("Stats");
            }
        });
        m4.add(btnStart);
        m4.setBorder(BorderFactory.createEmptyBorder(8,0,0,0));

        menuStart.add(m1);
        menuStart.add(m2);
        menuStart.add(m3);
        menuStart.add(m4);

        menuGroup.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
        pane.add(cboPane, BorderLayout.PAGE_START);
        pane.add(menuGroup, BorderLayout.CENTER);
    }

    public void itemStateChanged(ItemEvent evt){
        CardLayout cl = (CardLayout)(menuGroup.getLayout());
        cl.show(menuGroup, (String)evt.getItem());
    }

}
