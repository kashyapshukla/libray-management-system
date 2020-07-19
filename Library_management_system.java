package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Library_management_system extends JFrame implements ActionListener

{

    JLabel l1;
    JButton b1;
    JPanel contentpane;


    public Library_management_system()
    {
        setSize(1346, 490);
        contentpane=new JPanel();
        contentpane.setBounds(300,300,1346,300);
        setContentPane(contentpane);
        setLayout(null);
        setLocation(300,300);


        l1=new JLabel("");
        b1=new JButton("Next");
        contentpane.add(l1);
        contentpane.add(b1);
        b1.setBackground(Color.white);
        b1.addActionListener(this);
        b1.setForeground(Color.BLACK);


        JLabel l1=new JLabel("");
        l1.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("com/company/icon/first.jpg"));
        Image i2=i1.getImage().getScaledInstance(1346,490,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l1=new JLabel(i3);
       contentpane.add(l1);

        b1.setBounds(1050,150,200,40);
        l1.setBounds(0,0,1346,490);

        setVisible(true);


    }


    public void actionPerformed(ActionEvent e) {

try{
    if(e.getSource()==b1)
        new Login_user().setVisible(true);
        this.setVisible(false);

    }catch (Exception e1){}
    }

   public static void main(String[] args){
        new Library_management_system().setVisible(true);

   }

}
