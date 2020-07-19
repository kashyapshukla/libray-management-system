package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class About_us extends JFrame
{
    private JPanel contentpane;


    public About_us()
    {
        super("About Us");
        setBounds(200 ,300,1200,700);
        contentpane=new JPanel();
        setContentPane(contentpane);
        contentpane.setBackground(Color.GRAY);
        contentpane.setLayout(null);

        JLabel l1=new JLabel("KS Library Management System");
        l1. setBounds(100,100,1000,60);
        l1.setFont(new Font("segoe ui semilight",Font.BOLD,55));
        l1.setForeground(Color.BLACK);
        contentpane.add(l1);

        JPanel pane2=new JPanel();
        pane2.setForeground(new Color(34,148,34));
        pane2.setBackground(Color.ORANGE);
        pane2.setBorder(new TitledBorder(new LineBorder(new Color(1),5),"",
                TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
        pane2.setBounds(80,80,870,100);
        contentpane.add(pane2);


        JLabel l2=new JLabel("Developed by:-");
        l2. setBounds(60,300,600,60);
        l2.setFont(new Font("segoe ui semilight",Font.BOLD,55));
        l2.setForeground(Color.black);
        contentpane.add(l2);

        JLabel l3=new JLabel("Kashyap Shukla");
        l3. setBounds(500,300,600,70);
        l3.setFont(new Font("segoe ui semilight",Font.BOLD,55));
        l3.setForeground(Color.black);
        contentpane.add(l3);

        JLabel l4=new JLabel("Email id:-");
        l4. setBounds(60,450,400,60);
        l4.setFont(new Font("segoe ui semilight",Font.BOLD,55));
        l4.setForeground(Color.black);
        contentpane.add(l4);

        JLabel l5=new JLabel("kashyapshukla32@gmail.com");
        l5. setBounds(320,460,800,40);
        l5.setFont(new Font("segoe ui semilight",Font.BOLD,50));
        l5.setForeground(Color.black);
        contentpane.add(l5);

        JPanel panel=new JPanel();
        panel.setForeground(new Color(34,148,34));
        panel.setBorder(new TitledBorder(new LineBorder(new Color(128,120,0),5),"",
                TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
        panel.setBounds(10,250,1050,300);
        contentpane.add(panel);























    }


}
