package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

public class Signup extends JFrame implements ActionListener
{

    private JPanel contentpane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton b1, b2;

    public static void main(String[] arg)
    {

    }

    public Signup()
    {

        super("SIGNUP");
        setBounds(600, 250, 800, 650);
        contentpane = new JPanel();
        contentpane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentpane);
        contentpane.setBackground(Color.GRAY);
        contentpane.setLayout(null);

        JLabel name = new JLabel("Name :");
        name.setForeground(Color.BLACK);
        name.setFont(new Font("Tohama",Font.BOLD,20));
        name.setBounds(99, 86, 120, 36);
        contentpane.add(name);


        JLabel username = new JLabel("Username :");
        username.setForeground(Color.BLACK);
        username.setFont(new Font("Tohama",Font.BOLD,20));
        username.setBounds(99, 126, 120, 36);
        contentpane.add(username);

        JLabel password = new JLabel("Password :");
        password.setForeground(Color.BLACK);
        password.setFont(new Font("Tohama",Font.BOLD,20));
        password.setBounds(99, 166, 120, 36);
        contentpane.add(password);



        JLabel mobile_no = new JLabel("Mobile_No :");
        mobile_no.setForeground(Color.BLACK);
        mobile_no.setFont(new Font("Tohama",Font.BOLD,20));
        mobile_no.setBounds(99, 206, 120, 36);
        contentpane.add(mobile_no);


        textField1=new JTextField();
        textField1.setBounds(250,86,200,36);
        contentpane.add(textField1);
        textField1.setColumns(35);

        textField2=new JTextField();
        textField2.setBounds(250,126,200,36);
        contentpane.add(textField2);
        textField2.setColumns(35);

        textField3=new JTextField();
        textField3.setBounds(250,166,200,36);
        contentpane.add(textField3);
        textField3.setColumns(35);


        textField4=new JTextField();
        textField4.setBounds(250,206,200,36);
        contentpane.add(textField4);
        textField4.setColumns(35);



        b1=new JButton("Create");
        b1.addActionListener(this);
        b1.setFont(new Font("Tohama",Font.BOLD,20));
        b1.setBounds(200,380,150,32);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        contentpane.add(b1);

        b2=new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Tohama",Font.BOLD,20));
        b2.setBounds(380,380,150,32);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        contentpane.add(b2);

        JPanel panel=new JPanel();
        panel.setForeground(new Color(34,148,34));
        panel.setBorder(new TitledBorder(new LineBorder(new Color(128,120,0),5),"Create account",
                TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
        panel.setBounds(31,46,600,400);
        contentpane.add(panel);


        setVisible(true);

    }


    public void actionPerformed(ActionEvent e)
    {
        String a= textField1.getText();
        String b= textField2.getText();
        String c=textField3.getText();
        String d=textField4.getText();


        try{
        conn con=new conn();
         if(e.getSource()==b1)
         {
            String sql="insert into account value('"+a+"','"+b+"','"+c+"','"+d+"')";
             PreparedStatement st = con.c.prepareStatement(sql);



             int i=st.executeUpdate();
             if(i>0)
             {
                 JOptionPane.showMessageDialog(null,"successfully Complited");
             }
             textField1.setText("");
             textField2.setText("");
             textField3.setText("");
             textField4.setText("");

         }
            if (e.getSource()==b2)
            {
                this.setVisible(false);
                new Login_user().setVisible(true);

            }
        } catch(Exception e1)
        {

        }
        }
    }