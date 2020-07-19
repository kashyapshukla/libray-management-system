package com.company;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
public class Login_user extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1, b2, b3;


    public Login_user() {
        setLayout(null);
        setBackground(new Color(169, 160, 169));
        setBounds(600, 300, 600, 400);

        panel1 = new JPanel();
        panel1.setBackground(new Color(177, 224, 23));
        setContentPane(panel1);//it is use to cover hole panel
        panel1.setLayout(null);

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(124, 93, 95, 24);
        panel1.add(l1);

        JLabel l2 = new JLabel("Password :");
        l2.setBounds(124, 124, 95, 24);
        panel1.add(l2);

        textField = new JTextField();
        textField.setBounds(210, 93, 250, 28);
        panel1.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(210, 123, 250, 28);
        panel1.add(passwordField);

        b1 = new JButton("login");
        b1.addActionListener(this);

        b1.setForeground(new Color(46, 139, 87));
        b1.setBackground(new Color(250, 250, 210));
        b1.setBounds(180, 181, 113, 39);
        panel1.add(b1);

        b2 = new JButton("signup");
        b2.addActionListener(this);

        b2.setForeground(new Color(46, 139, 87));
        b2.setBackground(new Color(250, 250, 210));
        b2.setBounds(315, 181, 113, 39);
        panel1.add(b2);

        b3 = new JButton("forgot password");
        b3.addActionListener(this);

        b3.setForeground(new Color(46, 139, 87));
        b3.setBackground(new Color(250, 250, 210));
        b3.setBounds(250, 230, 113, 39);
        panel1.add(b3);


        JLabel l3 = new JLabel("trouble in login ?");
        l3.setBounds(124, 230, 110, 28);
        panel1.add(l3);


    }

    public void actionPerformed(ActionEvent e1) {
        if (e1.getSource() == b1) {
            Boolean status = false;
            try {
                conn con = new conn();
                String sql = "select * from Account where Username=? and Password=? ";
                PreparedStatement st=con.c.prepareStatement(sql);

                st.setString(1, textField.getText());
                st.setString(2, passwordField.getText());

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    this.setVisible(false);
                    new Loading().setVisible(true);
                   // new Home().setVisible(true);
                } else
                    JOptionPane.showMessageDialog(null, "invalid login!");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (e1.getSource() == b2) {
            this.setVisible(false);
            new Signup().setVisible(true);

        }

        if (e1.getSource() == b3) {
            this.setVisible(false);
            new Forgot().setVisible(true);

        }

    }


public static void main(String[] args){
    new Login_user().setVisible(true);
}
}