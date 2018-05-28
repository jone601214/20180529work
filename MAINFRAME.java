import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
public class MAINFRAME extends JFrame {
    private JButton jbtnStart = new JButton("Start");
    private JButton jbtnEXIT = new JButton("EXIT");

    public MAINFRAME() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocation(100,50);
        this.setSize(800,600);
        this.setLayout(null);
      jbtnStart.setBounds(100,150,150,150);
      jbtnEXIT.setBounds(600,150,150,150);
        this.add(jbtnStart);
        this.add(jbtnEXIT);
        jbtnStart.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jbtnEXIT.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}