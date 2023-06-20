package food;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raghu
 */
import javax.swing.*;  

import java.awt.event.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class breads extends JFrame implements ActionListener{  

    JLabel l,l1; 
    

    JCheckBox cb1,cb2,cb3,cb4,cb5;  

    JButton b,b1;
    JTextField user =new JTextField(20);
    
    JTextField ad =new JTextField(20);
    
    int t=0;

    breads(){  

        l=new JLabel("ORDER YOUR FOOD");  
        l1=new JLabel("Confirm username & Delivery Address");
        
       l1.setBounds(20,50,300,20);  
        l.setBounds(200,20,300,20);  
        user.setBounds(50,70,150,30);
        ad.setBounds(200,70,150,30);
        cb1=new JCheckBox("NAAN @ 53");  

        cb1.setBounds(100,100,150,20);  

        cb2=new JCheckBox("BUTTER NAAN @ 70");  

        cb2.setBounds(100,150,150,20);  

        cb3=new JCheckBox("CHEESE NAAN @ 60");  

        cb3.setBounds(100,200,150,20);
        
        cb4=new JCheckBox("ROTI @ 50");  

        cb4.setBounds(100,250,150,20);
        
        cb5=new JCheckBox("BUTTER ROTI @ 100");  

        cb5.setBounds(100,300,150,20);

        b=new JButton("Order");  

        b.setBounds(100,350,80,30);
        
        b1=new JButton("Back");  

        b1.setBounds(300,350,80,30);  
        
        b1.addActionListener(this);
       
        b.addActionListener(this);  

        
        add(l1);add(user);add(b1);add(cb5);add(cb4);add(l);add(cb1);add(cb2);add(cb3);add(b);add(ad);  

        setSize(500,500);  

        setLayout(null);  

        setVisible(true);  

        setDefaultCloseOperation(EXIT_ON_CLOSE);     }  

    @Override
    public void actionPerformed(ActionEvent e) {
        if(cb1.isSelected())
        {
          t=t+53;
          String food= "NAAN";
          String amount="Rs 53";
          String customer= user.getText();
          String address= ad.getText();
          final String url = "jdbc:mysql://localhost:3306/logindb";
				    final String user = "root";
				    final String passwor = "";

				    final String INSERT_customer_SQL = "INSERT INTO sales(food,amount,customer,address) VALUES(?, ?,?,?);";
				    System.out.println(INSERT_customer_SQL);
			       
			        try (Connection connection = DriverManager.getConnection(url, user, passwor);

			           
			            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_customer_SQL)) {
			            preparedStatement.setString(1,food);
			            preparedStatement.setString(2,amount);
                                    preparedStatement.setString(3,customer);
                                    preparedStatement.setString(4,address);
			            System.out.println(preparedStatement);
                                        try {
                                            preparedStatement.executeUpdate();
                                        } catch (SQLException ex) {
                                            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(cb2.isSelected())
        {
          t=t+70; 
          String food= "BUTTERNAAN";
          String amount="Rs 70";
          String customer= user.getText();
          String address= ad.getText();
          final String url = "jdbc:mysql://localhost:3306/logindb";
				    final String user = "root";
				    final String passwor = "";

				    final String INSERT_customer_SQL = "INSERT INTO sales(food,amount,customer,address) VALUES(?, ?,?,?);";
				    System.out.println(INSERT_customer_SQL);
			       
			        try (Connection connection = DriverManager.getConnection(url, user, passwor);

			           
			            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_customer_SQL)) {
			            preparedStatement.setString(1,food);
			            preparedStatement.setString(2,amount);
                                    preparedStatement.setString(3,customer);
                                    preparedStatement.setString(4,address);
			            System.out.println(preparedStatement);
                                        try {
                                            preparedStatement.executeUpdate();
                                        } catch (SQLException ex) {
                                            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(cb3.isSelected())
        {
          t=t+60; 
          String food= "CHEESE NAAN";
          String amount="Rs 60";
          String customer= user.getText();
          String address= ad.getText();
          final String url = "jdbc:mysql://localhost:3306/logindb";
				    final String user = "root";
				    final String passwor = "";

				    final String INSERT_customer_SQL = "INSERT INTO sales(food,amount,customer,address) VALUES(?, ?,?,?);";
				    System.out.println(INSERT_customer_SQL);
			       
			        try (Connection connection = DriverManager.getConnection(url, user, passwor);

			           
			            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_customer_SQL)) {
			            preparedStatement.setString(1,food);
			            preparedStatement.setString(2,amount);
                                    preparedStatement.setString(3,customer);
                                    preparedStatement.setString(4,address);
			            System.out.println(preparedStatement);
                                        try {
                                            preparedStatement.executeUpdate();
                                        } catch (SQLException ex) {
                                            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(cb4.isSelected())
        {
          t=t+50;
          String food= "ROTI";
          String amount="Rs 50";
          String customer= user.getText();
          String address= ad.getText();
          final String url = "jdbc:mysql://localhost:3306/logindb";
				    final String user = "root";
				    final String passwor = "";

				    final String INSERT_customer_SQL = "INSERT INTO sales(food,amount,customer,address) VALUES(?, ?,?,?);";
				    System.out.println(INSERT_customer_SQL);
			       
			        try (Connection connection = DriverManager.getConnection(url, user, passwor);

			           
			            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_customer_SQL)) {
			            preparedStatement.setString(1,food);
			            preparedStatement.setString(2,amount);
                                    preparedStatement.setString(3,customer);
                                    preparedStatement.setString(4,address);
			            System.out.println(preparedStatement);
                                        try {
                                            preparedStatement.executeUpdate();
                                        } catch (SQLException ex) {
                                            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(cb5.isSelected())
        {
            
          t=t+100; 
          String food= "BUTTERROTI";
          String amount="Rs 100";
          String customer= user.getText();
          String address= ad.getText();
          final String url = "jdbc:mysql://localhost:3306/logindb";
				    final String user = "root";
				    final String passwor = "";

				    final String INSERT_customer_SQL = "INSERT INTO sales(food,amount,customer,address) VALUES(?, ?,?,?);";
				    System.out.println(INSERT_customer_SQL);
			       
			        try (Connection connection = DriverManager.getConnection(url, user, passwor);

			           
			            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_customer_SQL)) {
			            preparedStatement.setString(1,food);
			            preparedStatement.setString(2,amount);
                                    preparedStatement.setString(3,customer);
                                    preparedStatement.setString(4,address);
			            System.out.println(preparedStatement);
                                        try {
                                            preparedStatement.executeUpdate();
                                        } catch (SQLException ex) {
                                            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource()==b)
        {
            JOptionPane.showMessageDialog(rootPane, "Total price Rs"+t);
            payment window =new payment();
            window.setVisible(true);
            this.setVisible(false);
            
        }
        if(e.getSource()==b1)
        {
            dispose();
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
