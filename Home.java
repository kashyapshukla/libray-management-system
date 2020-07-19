package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener
{
    JPanel contentpane;
    JButton b1,b2,b3,b4,b5,b6;
    public  static void main(String[] args){
     new Home().setVisible(true);
    }


    public  Home()
    {
        super("Home");

       setBounds(200,50,1300,950);
        contentpane=new JPanel();
        contentpane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentpane);
        contentpane.setBackground(Color.GRAY);
        contentpane.setLayout(null);

        JMenuBar menuBar=new JMenuBar();
        menuBar.setBackground(Color.ORANGE);
        menuBar.setBounds(0,0,1500,40);
        menuBar.setBorder(new LineBorder(Color.BLACK,5));
        contentpane.add(menuBar);

        JMenu record=new JMenu("Record");
        record.setForeground(Color.BLACK);
        record.setBounds(0,0,50,50);
        menuBar.add(record);

        JMenuItem bookdetails=new JMenuItem("Book Details");
        bookdetails.addActionListener(this);
        record.add(bookdetails);

        JMenuItem studentdetails=new JMenuItem("Student Details");
        studentdetails.addActionListener(this);
        record.add(studentdetails);

        JMenu help=new JMenu("Help");
        help.setForeground(Color.BLACK);
        help.setBounds(0,0,50,50);
        menuBar.add(help);

        JMenuItem aboutus=new JMenuItem("About us");
        aboutus.addActionListener(this);
        help .add(aboutus);

        JMenu exit=new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        exit.setBounds(0,0,50,50);
        menuBar.add(exit);

        JMenuItem logout=new JMenuItem("logout");
        logout.addActionListener(this);
        exit.add(logout);

        JMenuItem exit1=new JMenuItem("Exit");
        exit1.addActionListener(this);
        exit.add(exit1);

        JLabel l1=new JLabel("KS Library Management System");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("segoe ui semilight",Font.BOLD,55));
        l1.setBounds(260,50,1000,70);
        contentpane.add(l1);

        JLabel l2=new JLabel("");
        l2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("com/company/icon/second.png"));
        Image i2=i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l2=new JLabel(i3);
        l2.setBounds(180,180,150,150);
        contentpane.add(l2);

        b1=new JButton(" add Book");
        b1.addActionListener(this);
        b1.setFont(new Font("Tohama",Font.BOLD,32));
        b1.setBounds(150,350,200,40);
        b1.setForeground(Color.ORANGE);
        b1.setBackground(Color.BLACK);
        contentpane.add(b1);

        JLabel l3=new JLabel("");
        l3.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("com/company/icon/third.png"));
        Image i5=i4.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        l3=new JLabel(i6);
        l3.setBounds(520,180,150,150);
        contentpane.add(l3);


        b2=new JButton("statistic");
        b2.addActionListener(this);
        b2.setFont(new Font("Tohama",Font.BOLD,32));
        b2.setBounds(500,350,200,40);
        b2.setForeground(Color.ORANGE);
        b2.setBackground(Color.BLACK);
        contentpane.add(b2);

        JLabel l4=new JLabel("");
        l4.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i7= new ImageIcon(ClassLoader.getSystemResource("com/company/icon/fourth.png"));
        Image i8=i7.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        l4=new JLabel(i9);
        l4.setBounds(890,180,150,150);
        contentpane.add(l4);

        b3=new JButton("add Student");
        b3.addActionListener(this);
        b3.setFont(new Font("Tohama",Font.BOLD,32));
        b3.setBounds(850,350,250,40);
        b3.setForeground(Color.ORANGE);
        b3.setBackground(Color.BLACK);
        contentpane.add(b3);

        JPanel panel=new JPanel();
        panel.setBackground(Color.ORANGE);
        panel.setForeground(new Color(34,148,34));
        panel.setBorder(new TitledBorder(new LineBorder(new Color(1),5),"Operation",
                TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
        panel.setBounds(100,150,1050,300);
        contentpane.add(panel);

        JLabel l5=new JLabel("");
        l5.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i10= new ImageIcon(ClassLoader.getSystemResource("com/company/icon/fifth.png"));
        Image i11=i10.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        l5=new JLabel(i12);
        l5.setBounds(190,550,150,150);
        contentpane.add(l5);

        b4=new JButton("issue Book");
        b4.addActionListener(this);
        b4.setFont(new Font("Tohama",Font.BOLD,32));
        b4.setBounds(150,730,250,40);
        b4.setForeground(Color.ORANGE);
        b4.setBackground(Color.BLACK);
        contentpane.add(b4);

        JLabel l6=new JLabel("");
        l6.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i13= new ImageIcon(ClassLoader.getSystemResource("com/company/icon/sixth.png"));
        Image i14=i13.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i15=new ImageIcon(i14);
        l6=new JLabel(i15);
        l6.setBounds(530,550,150,150);
        contentpane.add(l6);

        b5=new JButton("Return Book");
        b5.addActionListener(this);
        b5.setFont(new Font("Tohama",Font.BOLD,32));
        b5.setBounds(500,730,250,40);
        b5.setForeground(Color.ORANGE);
        b5.setBackground(Color.BLACK);
        contentpane.add(b5);

        JLabel l7=new JLabel("");
        l7.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i17= new ImageIcon(ClassLoader.getSystemResource("com/company/icon/seventh.png"));
        Image i18=i17.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i19=new ImageIcon(i18);
        l7=new JLabel(i19);
        l7.setBounds(890,550,150,150);
        contentpane.add(l7);

        b6=new JButton("About us");
        b6.addActionListener(this);
        b6.setFont(new Font("Tohama",Font.BOLD,32));
        b6.setBounds(850,730,250,40);
        b6.setForeground(Color.ORANGE);
        b6.setBackground(Color.BLACK);
        contentpane.add(b6);

        JPanel pane2=new JPanel();
        pane2.setBackground(Color.ORANGE);
        pane2.setForeground(new Color(34,148,34));
        pane2.setBorder(new TitledBorder(new LineBorder(new Color(1),5),"Action",
                TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
        pane2.setBounds(100,500,1050,300);
        contentpane.add(pane2);
    }


    public void actionPerformed(ActionEvent e) {
     try {
      conn con = new conn();
      if(e.getSource()==b1)
      {
       this.setVisible(false);
       new Add_book().setVisible(true);
      }else if(e.getSource()==b2)
      {
       this.setVisible(false);
      // new statistic().setVisible(true);
      }else if(e.getSource()==b3)
      {
       this.setVisible(false);
       new Add_student().setVisible(true);
      }
      else if(e.getSource()==b4)
        {
           this.setVisible(false);
           new issue_book().setVisible(true);
       }
      else if(e.getSource()==b5)
      {
       this.setVisible(false);
       new Return_book().setVisible(true);
      }else if(e.getSource()==b6)
      {
       this.setVisible(false);
      // new About_us().setVisible(true);
      }



      String mag=e.getActionCommand();
      if(mag.equals("Book Details"))
      {
       this.setVisible(false);
       new Book_details().setVisible(true);
      }else if(mag.equals("Student Details"))
      {
       this.setVisible(false);
       new Student_Details().setVisible(true);
      }else if(mag.equals("About us"))
      {
       this.setVisible(false);
       new About_us().setVisible(true);
      }else if(mag.equals("logout"))
      {
       this.setVisible(false);
       new Login_user().setVisible(true);
      }else if(mag.equals("Exit"))
      {
       this.setVisible(false);

      }


     }catch (Exception e1){}

    }
}
