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

public class Forgot  extends JFrame implements  ActionListener
{
        private JPanel contentpane;
        private JTextField textField1;
        private JTextField textField2;
        private JTextField textField3;
        private JTextField textField4;
        private JTextField textField5;
        private JButton b1,b2,b3;

        public static void main(String[] args){

            new Forgot().setVisible(true);
        }





             public  Forgot()
             {
                 super("Forget password");


                 setBounds(600, 250, 800, 650);
                 contentpane = new JPanel();
                 contentpane.setBorder(new EmptyBorder(5, 5, 5, 5));
                 setContentPane(contentpane);
                 contentpane.setBackground(Color.GRAY);
                 contentpane.setLayout(null);

                 JLabel username = new JLabel("Username :");
                 username.setForeground(Color.BLACK);
                 username.setFont(new Font("Tohama",Font.BOLD,20));
                 username.setBounds(99, 86, 120, 36);
                 contentpane.add(username);

                 JLabel name = new JLabel("Name :");
                 name.setForeground(Color.BLACK);
                 name.setFont(new Font("Tohama",Font.BOLD,20));
                 name.setBounds(99, 126, 120, 36);
                 contentpane.add(name);

                 JLabel branch = new JLabel("Branch :");
                 branch.setForeground(Color.BLACK);
                 branch.setFont(new Font("Tohama",Font.BOLD,20));
                 branch.setBounds(99, 166, 120, 36);
                 contentpane.add(branch);

                 JLabel mobile_no = new JLabel("Mobile_No :");
                 mobile_no.setForeground(Color.BLACK);
                 mobile_no.setFont(new Font("Tohama",Font.BOLD,20));
                 mobile_no.setBounds(99, 206, 120, 36);
                 contentpane.add(mobile_no);

                 JLabel password = new JLabel("Password :");
                 password.setForeground(Color.BLACK);
                 password.setFont(new Font("Tohama",Font.BOLD,20));
                 password.setBounds(99, 246, 120, 36);
                 contentpane.add(password);

                 textField1=new JTextField();
                 textField1.setBounds(250,86,200,36);
                 contentpane.add(textField1);
                 textField1.setColumns(35);

                 textField2=new JTextField();
                 textField2.setBounds(250,126,200,36);
                 textField2.setEditable(false);
                 contentpane.add(textField2);
                 textField2.setColumns(35);

                 textField3=new JTextField();
                 textField3.setBounds(250,166,200,36);
                 textField3.setEditable(false);
                 contentpane.add(textField3);
                 textField3.setColumns(35);

                 textField4=new JTextField();
                 textField4.setBounds(250,206,200,36);
                 contentpane.add(textField4);
                 textField4.setColumns(35);

                 textField5=new JTextField();
                 textField5.setBounds(250,246,200,36);
                 textField5.setEditable(false);
                 contentpane.add(textField5);
                 textField5.setColumns(35);

                 b1=new JButton("search");
                 b1.addActionListener( this);
                 b1.setFont(new Font("Tohama",Font.BOLD,20));
                 b1.setBounds(510,86,150,32);
                 b1.setForeground(Color.WHITE);
                 b1.setBackground(Color.BLACK);
                 contentpane.add(b1);

                 b2=new JButton("Retrieve");
                 b2.addActionListener(this);
                 b2.setFont(new Font("Tohama",Font.BOLD,20));
                 b2.setBounds(510,206,150,32);
                 b2.setForeground(Color.WHITE);
                 b2.setBackground(Color.BLACK);
                 contentpane.add(b2);

                 b3=new JButton("Back");
                 b3.addActionListener(this);
                 b3.setFont(new Font("Tohama",Font.BOLD,20));
                 b3.setBounds(300,315,150,32);
                 b3.setForeground(Color.WHITE);
                 b3.setBackground(Color.BLACK);
                 contentpane.add(b3);

                 JPanel panel=new JPanel();
                 panel.setForeground(new Color(34,148,34));
                 panel.setBorder(new TitledBorder(new LineBorder(new Color(128,120,0),5),"forgot password",
                         TitledBorder.LEADING,TitledBorder.TOP,null,Color.BLACK));
                 panel.setBounds(31,46,650,450);
                 contentpane.add(panel);
             }


    public void actionPerformed(ActionEvent e)
    {
        conn con=new conn();
        try{
            if(e.getSource()==b1)
            {
                String sql="select * from account where username=?";
                PreparedStatement st=con.c.prepareStatement(sql);

                st.setString(1,textField1.getText());
                ResultSet rs=st.executeQuery();

                while(rs.next())
                {
                    textField2.setText(rs.getString("name"));
                    textField3.setText(rs.getString("branch"));

                }
            }
            if(e.getSource()==b2) {
                String sql = "select * from account where mobile_no=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, textField4.getText());
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    textField5.setText(rs.getString("password"));
                }
            }
             if(e.getSource()==b3)
             {
                this.setVisible(false);
                new Login_user().setVisible(true);
             }

        }catch (Exception e1){}
    }
}
