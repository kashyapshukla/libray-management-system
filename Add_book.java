package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Add_book extends JFrame implements ActionListener
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
public static void main(String[] args){
    new Add_book().setVisible(true);
}

    public  Add_book()
    {


            super("Add Book");
            setBounds(600, 250, 800, 650);
            contentpane = new JPanel();
            contentpane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentpane);
            contentpane.setBackground(Color.GRAY);
            contentpane.setLayout(null);


            JLabel bool_id = new JLabel("Book id :");
            bool_id.setForeground(Color.BLACK);
            bool_id.setFont(new Font("Tohama",Font.BOLD,20));
            bool_id.setBounds(99, 86, 120, 36);
            contentpane.add(bool_id);

            JLabel name = new JLabel("Name :");
            name.setForeground(Color.BLACK);
            name.setFont(new Font("Tohama",Font.BOLD,20));
            name.setBounds(99, 126, 120, 36);
            contentpane.add(name);

            JLabel ISBN = new JLabel("ISBN :");
            ISBN.setForeground(Color.BLACK);
            ISBN.setFont(new Font("Tohama",Font.BOLD,20));
            ISBN.setBounds(99, 166, 120, 36);
            contentpane.add(ISBN);

            JLabel publisher = new JLabel("Publisher :");
            publisher.setForeground(Color.BLACK);
            publisher.setFont(new Font("Tohama",Font.BOLD,20));
            publisher.setBounds(99, 206, 120, 36);
            contentpane.add(publisher);

            JLabel adition = new JLabel("Edition :");
            adition.setForeground(Color.BLACK);
            adition.setFont(new Font("Tohama",Font.BOLD,20));
            adition.setBounds(99, 246, 120, 36);
            contentpane.add(adition);

            JLabel pages = new JLabel("Pages :");
            pages.setForeground(Color.BLACK);
            pages.setFont(new Font("Tohama",Font.BOLD,20));
            pages.setBounds(99, 286, 120, 36);
            contentpane.add(pages);


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

            textField5=new JTextField();
            textField5.setBounds(250,246,200,36);
            contentpane.add(textField5);
            textField5.setColumns(35);

            textField6=new JTextField();
            textField6.setBounds(250,286,200,36);
            contentpane.add(textField6);
            textField6.setColumns(35);


            b1=new JButton("Add");
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
            panel.setBorder(new TitledBorder(new LineBorder(new Color(128,120,0),5),"Add Book",
                    TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
            panel.setBounds(31,46,600,400);
            contentpane.add(panel);


            setVisible(true);

        }


    public void actionPerformed(ActionEvent ae)
    {
                String a= textField1.getText();
                String b= textField2.getText();
                String c= textField3.getText();
                String d= textField4.getText();
                String e= textField5.getText();
                String f= textField6.getText();
        try{
            conn con=new conn();
            if(ae.getSource()==b1)
            {
                String sql="insert into book  value('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"')";
                PreparedStatement st = con.c.prepareStatement(sql);





                int i=st.executeUpdate();
                if(i>0)
                {
                    JOptionPane.showMessageDialog(null,"successfully Completed");
                }
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
            }
            if (ae.getSource()==b2)
            {
                this.setVisible(false);
                new Home().setVisible(true);

            }
        } catch(Exception e1)
        {

        }
    }
    }
