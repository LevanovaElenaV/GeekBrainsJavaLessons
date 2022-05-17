package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
    }

    public void init() {
        setVisible(true);
        setSize(500,500);
        setLocation(650,250);
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout layout = new GridLayout(1,2);
        JPanel panel = new JPanel();

        JButton btn1 = new JButton("Выход");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(btn1, BorderLayout.SOUTH);

        JButton btn2 = new JButton("Чпок");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Чпок");
            }

        });


        panel.add(btn2, BorderLayout.EAST);

        add(panel, BorderLayout.SOUTH);
    }
}
