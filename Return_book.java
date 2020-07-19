package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Return_book extends JFrame implements ActionListener
{
    private JPanel contentpane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7,textField8,textField9,textField10,textField11,textField12,textField14,textField15;
    private JButton b1, b3,b2;

    public static void main(String[] args){
        new issue_book().setVisible(true);
    }

    public Return_book ()
    {
        super("Return Book");

        setBounds(260,300,1200,600);
        contentpane = new JPanel();
        contentpane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentpane);
        contentpane.setBackground(Color.GRAY);
        contentpane.setLayout(null);

        JLabel bool_id = new JLabel("Book id :");
        bool_id.setForeground(Color.BLACK);
        bool_id.setFont(new Font("Tohama",Font.BOLD,20));
        bool_id.setBounds(47, 80, 120, 36);
        contentpane.add(bool_id);

        JLabel name = new JLabel("Name:");
        name.setForeground(Color.BLACK);
        name.setFont(new Font("Tohama",Font.BOLD,20));
        name.setBounds(47, 120, 120, 36);
        contentpane.add(name);

        JLabel ISBN = new JLabel("ISBN :");
        ISBN.setForeground(Color.BLACK);
        ISBN.setFont(new Font("Tohama",Font.BOLD,20));
        ISBN.setBounds(47, 166, 120, 36);
        contentpane.add(ISBN);

        JLabel publisher = new JLabel("Publisher :");
        publisher.setForeground(Color.BLACK);
        publisher.setFont(new Font("Tohama",Font.BOLD,20));
        publisher.setBounds(47, 206, 120, 36);
        contentpane.add(publisher);

        JLabel adition = new JLabel("Edition :");
        adition.setForeground(Color.BLACK);
        adition.setFont(new Font("Tohama",Font.BOLD,20));
        adition.setBounds(47, 246, 120, 36);
        contentpane.add(adition);

        JLabel pages = new JLabel("Pages :");
        pages.setForeground(Color.BLACK);
        pages.setFont(new Font("Tohama",Font.BOLD,20));
        pages.setBounds(47, 286, 120, 36);
        contentpane.add(pages);

        JLabel Date = new JLabel(" Issue Date :");
        Date.setForeground(Color.BLACK);
        Date.setFont(new Font("Tohama",Font.BOLD,20));
        Date.setBounds(47, 390, 120, 36);
        contentpane.add(Date);

        JLabel return_date = new JLabel(" Return Date :");
        return_date.setForeground(Color.BLACK);
        return_date.setFont(new Font("Tohama",Font.BOLD,20));
        return_date.setBounds(500, 390, 200, 36);
        contentpane.add(return_date);

        textField15=new JTextField();
        textField15.setBounds(700,390,200,36);
        contentpane.add(textField15);

        textField15.setColumns(35);



        textField14=new JTextField();
        textField14.setBounds(200,390,200,36);
        contentpane.add(textField14);
        textField14.setEditable(false);
        textField14.setColumns(35);



        textField1=new JTextField();
        textField1.setBounds(150,86,80,36);
        contentpane.add(textField1);

        textField1.setColumns(35);

        textField2=new JTextField();
        textField2.setBounds(150,126,200,36);
        textField2.setEditable(false);
        contentpane.add(textField2);
        textField2.setColumns(35);

        textField3=new JTextField();
        textField3.setBounds(150,166,200,36);
        textField3.setEditable(false);
        contentpane.add(textField3);
        textField3.setColumns(35);

        textField4=new JTextField();
        textField4.setBounds(150,206,200,36);
        textField4.setEditable(false);
        contentpane.add(textField4);
        textField4.setColumns(35);

        textField5=new JTextField();
        textField5.setBounds(150,246,200,36);
        textField5.setEditable(false);
        contentpane.add(textField5);
        textField5.setColumns(35);

        textField6=new JTextField();
        textField6.setBounds(150,286,200,36);
        textField6.setEditable(false);
        contentpane.add(textField6);
        textField6.setColumns(35);

        JLabel sname = new JLabel("SName :");
        sname.setForeground(Color.BLACK);
        sname.setFont(new Font("Tohama",Font.BOLD,20));
        sname.setBounds(680, 86, 120, 36);
        contentpane.add(sname);


        JLabel username = new JLabel("Username :");
        username.setForeground(Color.BLACK);
        username.setFont(new Font("Tohama",Font.BOLD,20));
        username.setBounds(680, 126, 120, 36);
        contentpane.add(username);



        JLabel branch = new JLabel("Branch :");
        branch.setForeground(Color.BLACK);
        branch.setFont(new Font("Tohama",Font.BOLD,20));
        branch.setBounds(680, 163, 120, 36);
        contentpane.add(branch);

        JLabel mobile_no = new JLabel("Mobile_No :");
        mobile_no.setForeground(Color.BLACK);
        mobile_no.setFont(new Font("Tohama",Font.BOLD,20));
        mobile_no.setBounds(680, 207, 120, 36);
        contentpane.add(mobile_no);

        JLabel sem = new JLabel("Semister :");
        sem.setForeground(Color.BLACK);
        sem.setFont(new Font("Tohama",Font.BOLD,20));
        sem.setBounds(680, 247, 120, 36);
        contentpane.add(sem);

        JLabel address = new JLabel("Address :");
        address.setForeground(Color.BLACK);
        address.setFont(new Font("Tohama",Font.BOLD,20));
        address.setBounds(680, 287, 120, 36);
        contentpane.add(address);

        textField7=new JTextField();
        textField7.setBounds(800,86,200,36);
        textField7.setEditable(false);
        contentpane.add(textField7);
        textField7.setColumns(35);

        textField8=new JTextField();
        textField8.setBounds(800,126,200,36);
        textField8.setEditable(false);
        contentpane.add(textField8);
        textField8.setColumns(35);

        textField9=new JTextField();
        textField9.setBounds(800,166,200,36);
        textField9.setEditable(false);
        contentpane.add(textField9);
        textField9.setColumns(35);

        textField10=new JTextField();
        textField10.setBounds(800,206,200,36);
        textField10.setEditable(false);
        contentpane.add(textField10);
        textField10.setColumns(35);

        textField11=new JTextField();
        textField11.setBounds(800,246,200,36);
        textField11.setEditable(false);
        contentpane.add(textField11);
        textField11.setColumns(35);

        textField12=new JTextField();
        textField12.setBounds(800,286,200,36);
        textField12.setEditable(false);
        contentpane.add(textField12);
        textField12.setColumns(35);

        JPanel panel=new JPanel();
        panel.setForeground(new Color(34,148,34));
        panel.setBorder(new TitledBorder(new LineBorder(new Color(128,120,0),5),"Book Details",
                TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
        panel.setBounds(30,60,500,300);
        contentpane.add(panel);

        JPanel p2=new JPanel();
        p2.setForeground(new Color(34,148,34));
        p2.setBorder(new TitledBorder(new LineBorder(new Color(128,120,0),5),"Student Details ",
                TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
        p2.setBounds(660,60,400,300);
        contentpane.add(p2);

        b1=new JButton("search");
        b1.setBounds(550,90,100,60);
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        panel.add(b1);

        b2=new JButton("Return_book");
        b2.setBounds(40,450,150,60);
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentpane.add(b2);

        b3=new JButton("Back");
        b3.setBounds(200,450,150,60);
        b3.addActionListener(this);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentpane.add(b3);

    }


    public void actionPerformed(ActionEvent e)
    {
        String a= textField1.getText();
        String b= textField2.getText();
        String c= textField3.getText();
        String d= textField4.getText();
        String E= textField5.getText();
        String f= textField6.getText();
        String g= textField7.getText();
        String h= textField8.getText();
        String i= textField9.getText();
        String j= textField10.getText();
        String k= textField11.getText();
        String l= textField12.getText();
        String m= textField14.getText();
        String n= textField15.getText();

        try
        {
            conn con=new conn();
            if(e.getSource()==b1)
            {
                String sql="select * from Issue_book where Book_id='"+a+"'";
                PreparedStatement st=con.c.prepareStatement(sql);
                ResultSet rs=st.executeQuery();


                while (rs.next())
                {
                    textField2.setText(rs.getString("name"));
                    textField3.setText(rs.getString("ISBN"));
                    textField4.setText(rs.getString("Publisher"));
                    textField5.setText(rs.getString("Edition"));
                    textField6.setText(rs.getString("pages"));
                    textField7.setText(rs.getString("sname"));
                    textField8.setText(rs.getString("username"));
                    textField9.setText(rs.getString("Branch"));
                    textField10.setText(rs.getString("Mobile_no"));
                    textField11.setText(rs.getString("sem"));
                    textField12.setText(rs.getString("address"));
                    textField14.setText(rs.getString("issue_date"));

                }

            }
            if(e.getSource()==b2)
            {
                String sql="insert into Return_book (Book_id,name,ISBN,Publisher,Edition,Pages,SName,Username,Branch,Mobile_no,Semister,Address,Issue_date,Return_date)  value('"+a+"','"+b+"','"+c+"','"+d+"','"+E+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"','"+n+"')";
                PreparedStatement st=con.c.prepareStatement(sql);






                int I=st.executeUpdate();
                if(I>0)
                {
                    JOptionPane.showMessageDialog(null,"successfully Complited");

                }
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                textField8.setText("");
                textField9.setText("");
                textField10.setText("");
                textField11.setText("");
                textField12.setText("");
                textField14.setText("");
                textField15.setText("");




            }
            if(e.getSource()==b3)
            {
                this.setVisible(false);
                new Home().setVisible(true);
            }
        }catch (Exception e1){}
    }
}



