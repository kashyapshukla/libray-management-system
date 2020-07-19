package com.company;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student_Details extends JFrame implements ActionListener
{
    JPanel contentpane;
    JButton b1;
    JTable table;

    public static void main(String[] args) {
        new Student_Details().setVisible(true);
    }



    public void Student() {
        try {
            conn con = new conn();
            String sql = "select * from Student";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {

        }
    }


    public Student_Details()
    {
     super("Student Details");


    setBounds(150,150,1200,700);
    contentpane=new JPanel();
    contentpane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentpane);
    contentpane.setBackground(Color.GRAY);
    contentpane.setLayout(null);

    JScrollPane scrollPane=new JScrollPane();
    scrollPane.setBounds(79,133,1000,400);
    contentpane.add(scrollPane);


    table=new JTable();
    table.setBackground(Color.orange);
    table.setForeground(Color.BLACK);
    table.setFont(new Font("Tohama",Font.BOLD,20));

        scrollPane.setViewportView(table);


    b1=new JButton("back");
    b1.addActionListener( this);
    b1.setBounds(79,90,150,32);
    b1.setForeground(Color.WHITE);
    b1.setBackground(Color.BLACK);
    contentpane.add(b1);

    JPanel panel=new JPanel();
    panel.setForeground(new Color(34,148,34));
    panel.setBorder(new TitledBorder(new LineBorder(new Color(128,120,0),5),"Student Details",
            TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
    panel.setBounds(31,46,1100,500);
    contentpane.add(panel);

    JLabel l1=new JLabel("Student Details");
    l1.setForeground(Color.BLACK);
    l1.setFont(new Font("segoe ui semilight",Font.BOLD,55));
    l1.setBounds(200,90,300,36);
    panel.add(l1);



    setVisible(true);
    Student();


}



    public void actionPerformed(ActionEvent e)
    {
        try
        {
            conn con=new conn();
            if(e.getSource()==b1)
            {
                this.setVisible(false);
                new Home().setVisible(true);
            }
        }catch (Exception e1){}
    }
}

