package com.company;

import javax.swing.*;
import java.sql.*;

import static java.lang.Class.forName;

public class Main  extends JFrame  {

    public static void main(String[] args)
    {
        conn con= new conn();

   new Library_management_system().setVisible(true);
}}