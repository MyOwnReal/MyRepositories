package BeatTheBoss;

import javax.swing.*;
import javax.swing.text.StringContent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Data extends JFrame {

    private JButton P1Critical;
    private JButton P2Critical;
    private JLabel Like;
    private JLabel Damage, Damage2;
    private JLabel NumLevel;
    private JTextField WriteAge1, WriteAge2;
    private double tempAge1, tempAge2;
    private int HPP2 = 100;
    private int HPP1 = 100;
    private int level = 0;
    private String happy = " :-)";

    private Data() {
        setSize(400, 600);
        setTitle("Mortal Punch");
        setBackground(Color.GREEN);
        setLayout(null);

        JButton p1punch = new JButton(" P1 Punch!");
        p1punch.setBounds(20, 40, 120, 20);
        add(p1punch);
        p1punch.addActionListener(e -> {
            Random PlayerPunch = new Random();

            HPP2 = HPP2 - PlayerPunch.nextInt(15);

            Damage.setText(String.valueOf(HPP2));

            NumLevel.setText("Level: " + level);
            level++;
            if (HPP2 <= 0) {
                JOptionPane.showMessageDialog(null, "Player 1 Win! Game Over!");

            }
        });

        JButton p2punch = new JButton(" P2 Punch!");
        p2punch.setBounds(20, 100, 120, 20);
        add(p2punch);
        p2punch.addActionListener(e -> {
            Random PlayerPunch = new Random();

            HPP1 = HPP1 - PlayerPunch.nextInt(15);

            Damage2.setText(String.valueOf(HPP1));

            NumLevel.setText("Level: " + level);
            level++;
            if (HPP1 <= 0) {
                JOptionPane.showMessageDialog(null, "Player 2 Win! Game Over!");

            }
        });

        P1Critical = new JButton(" P1 Critical Hit!");
        P1Critical.setBounds(20, 200, 120, 20);
        add(P1Critical);
        P1Critical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random PlayerPunch = new Random();

                HPP2 = HPP2 - PlayerPunch.nextInt(50);

                Damage.setText(String.valueOf(HPP2));

                NumLevel.setText("Level: " + level);
                level++;

                P1Critical.removeActionListener(this);

            }
        });

        P2Critical = new JButton(" P2 Critical Hit!");
        P2Critical.setBounds(180, 200, 120, 20);
        add(P2Critical);
        P2Critical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random PlayerPunch = new Random();

                HPP1 = HPP1 - PlayerPunch.nextInt(50);

                Damage2.setText(String.valueOf(HPP1));

                NumLevel.setText("Level: " + level);
                level++;

                P2Critical.removeActionListener(this);
            }
        });

        JButton ageVer1 = new JButton(" P1 Verify");
        ageVer1.setBounds(250, 250, 100, 20);
        add(ageVer1);
        ageVer1.addActionListener(e -> {
            ageVer1.setEnabled(false);
            tempAge1 = Double.parseDouble(WriteAge1.getText());
            if (tempAge1 < 18) {
                JOptionPane.showMessageDialog(null, "You are too Young!");
                dispose();

            } else if (tempAge1 > 18) {
                JOptionPane.showMessageDialog(null, "You are Redy to GO!");
            }
        });

        JButton ageVer2 = new JButton("P2 Verify");
        ageVer2.setBounds(250, 300, 100, 20);
        add(ageVer2);
        ageVer2.addActionListener(e -> {
            ageVer1.setEnabled(false);
            tempAge2 = Double.parseDouble(WriteAge2.getText());
            if (tempAge2 < 18) {
                JOptionPane.showMessageDialog(null, "You are too Young!");
                dispose();
            } else if (tempAge2 > 18) {
                JOptionPane.showMessageDialog(null, "You are Redy to GO!");
            }
        });

        JButton BExit = new JButton("Done!");
        BExit.setBounds(140, 350, 100, 20);
        add(BExit);
        BExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                P1Critical.removeActionListener(this);
                dispose();
            }
        });

        JButton OKButton = new JButton("OK !");
        OKButton.setBounds(140, 420, 100, 20);
        add(OKButton);
        OKButton.addActionListener(e -> Like.setText(String.valueOf(happy)));

        JLabel age1 = new JLabel("Write your Age P1 : ");
        age1.setBounds(20, 250, 120, 20);
        add(age1);

        JLabel age2 = new JLabel("Write your Age P2 : ");
        age2.setBounds(20, 300, 120, 20);
        add(age2);

        WriteAge1 = new JTextField(" ");
        WriteAge1.setBounds(150, 250, 120, 20);
        add(WriteAge1);

        WriteAge2 = new JTextField(" ");
        WriteAge2.setBounds(150, 300, 120, 20);
        add(WriteAge2);

        JLabel showHPP2 = new JLabel("Player 2 HP");
        showHPP2.setBounds(200, 40, 100, 20);
        add(showHPP2);

        JLabel showHPP1 = new JLabel("Player 1 HP");
        showHPP1.setBounds(200, 100, 100, 20);
        add(showHPP1);

        JLabel levelCrit = new JLabel("Critial Hit Use Ones");
        levelCrit.setBounds(120, 150, 150, 20);
        levelCrit.setForeground(Color.magenta);
        add(levelCrit);


        Damage = new JLabel(" ");
        Damage.setBounds(300, 40, 100, 20);
        Damage.setForeground(Color.red);
        add(Damage);

        Damage2 = new JLabel(" ");
        Damage2.setBounds(300, 100, 100, 20);
        Damage2.setForeground(Color.red);
        add(Damage2);

        NumLevel = new JLabel("Level: " + level);
        NumLevel.setBounds(150, 15, 150, 20);
        NumLevel.setForeground(Color.BLUE);
        NumLevel.setFont(new Font("<changeme>", Font.PLAIN, 16));
        add(NumLevel);

        JLabel enjoy = new JLabel("Clik " + "       " + "   if you Enjoy Game :) ");
        enjoy.setBounds(140, 390, 300, 20);
        enjoy.setForeground(Color.red);
        add(enjoy);

        JLabel OK = new JLabel("OK !");
        OK.setBounds(165, 390, 300, 20);
        OK.setForeground(Color.BLUE);
        add(OK);

        Like = new JLabel();
        Like.setBounds(140, 460, 60, 20);
        Like.setForeground(Color.RED);
        // Like.setText(String.valueOf(happy));
        add(Like);
    }

    public static void main(String[] args) {

        Data MyWindow = new Data();
        MyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyWindow.setVisible(true);
    }

}




