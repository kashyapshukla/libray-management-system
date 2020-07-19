package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;

public class Loading extends JFrame implements Runnable {
    private JPanel contentpane;
    private JProgressBar progressBar;
    Connection conn;
    int a;
    Thread th;

        public static void main(String[] args){
            new Loading().setVisible(true);
        }



    public  void  setuploading(){
        th.start();
    }
    public void run() {
        try{
              for(int i=0;i<=200;i++)
              {
                a=a+1;
                int m=progressBar.getMaximum();
                int y=progressBar.getValue();
                if (y < m)
                {
                    progressBar.setValue(progressBar.getValue()+1);
                }else
                    {
                        i=201;
                        setVisible(false);
                        new Home().setVisible(true);
                    }
                Thread.sleep(50);
              }
           }catch (Exception e){
            e.printStackTrace();
        }

            }


    public Loading()
    {
        super("Loading");
        th = new Thread((Runnable) this);

        setBounds(600,300,600,400);
        setBackground(Color.GRAY);
        contentpane=new JPanel();
        setContentPane(contentpane);
        contentpane.setLayout(null);
        contentpane.setBackground(Color.GRAY);

        JLabel Library=new JLabel("KS LIBRARY MANAGEMENT SYSTEM");
        Library.setForeground(Color.BLACK);
        Library.setFont(new Font("Trebuchet MS", Font.BOLD,30));
        Library.setBounds(80,46,500,36);
        contentpane.add(Library);

        progressBar=new JProgressBar();
        progressBar.setFont(new Font("Tahoma", Font.BOLD,25));
        progressBar.setStringPainted(true);
        progressBar.setBounds(130,135,300,26);
        contentpane.add(progressBar);


        JPanel panel=new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setBounds(0,0,590,390);
        contentpane.add(panel);

        setuploading();
        new Login_user().setVisible(true);

    }

}
