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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
    
    public class chinese extends JFrame implements ActionListener{  
    String food ="";
    JLabel l,l1;
    JTextField user =new JTextField(20);
    
    JTextField ad =new JTextField(20);

    JCheckBox cb1,cb2,cb3,cb4,cb5;  

    JButton b,b1;
    
    int t=0;

    chinese(){  

        l=new JLabel("ORDER YOUR FOOD");  
        l1=new JLabel("Confirm username & Delivery Address");
        
        l1.setBounds(20,50,300,20);  
        l.setBounds(200,20,300,20);  
        user.setBounds(50,70,150,30);
        ad.setBounds(200,70,150,30); 

        cb1=new JCheckBox("CHICKNOODLES@140");  

        cb1.setBounds(100,100,150,20);  

        cb2=new JCheckBox("CHICKENRICE @140");  

        cb2.setBounds(100,150,150,20);  

        cb3=new JCheckBox("VEGNOODLE @120");  

        cb3.setBounds(100,200,150,20);
        
        cb4=new JCheckBox("VEGRICE @ 120");  

        cb4.setBounds(100,250,150,20);
        
        cb5=new JCheckBox("EGGRICE @ 130");  

        cb5.setBounds(100,300,150,20);

        b=new JButton("Order");  

        b.setBounds(100,350,80,30);
        
        b1=new JButton("Back");  

        b1.setBounds(300,350,80,30);  
        
        b1.addActionListener(this);
       

        b.addActionListener(this);  

        add(user);add(ad);add(l1);add(b1);add(cb5);add(cb4);add(l);add(cb1);add(cb2);add(cb3);add(b);  

        setSize(500,500);  

        setLayout(null);  

        setVisible(true);  

        setDefaultCloseOperation(EXIT_ON_CLOSE);     }  

    @Override
    public void actionPerformed(ActionEvent e) {
        if(cb1.isSelected())
        {
          food=food+"Chicknoodles ";
          t=t+140; 
        }
        if(cb2.isSelected())
        {
          food=food+"Chickrice ";
          t=t+140; 
        }
        if(cb3.isSelected())
        {
           food=food+"Vegnoodles ";
          t=t+120; 
        }
        if(cb4.isSelected())
        {
          food=food+"Vegrice ";
          t=t+120; 
        }
        if(cb5.isSelected())
        {
          food=food+"Eggrice ";
          t=t+130; 
        }
        if(e.getSource()==b)
        {
            JOptionPane.showMessageDialog(rootPane, "Total price Rs"+t);
            String customer= user.getText();
          String address= ad.getText();
          String to=String.valueOf(t);
          final String url = "jdbc:mysql://localhost:3306/logindb";
				    final String user = "root";
				    final String passwor = "";

				    final String INSERT_customer_SQL = "INSERT INTO sales(food,Amount,customer,address) VALUES(?, ?,?,?);";
				    System.out.println(INSERT_customer_SQL);
			       
			        try (Connection connection = java.sql.DriverManager.getConnection(url, user, passwor);

			           
			            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_customer_SQL)) {
			            preparedStatement.setString(1,food);
			            preparedStatement.setString(2,to);
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
    
