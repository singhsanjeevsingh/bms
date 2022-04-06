/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Sachin Kumar
 */
import java.sql.*;
import javax.swing.*;

public class database {
    public static Connection db(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankManagement","root","Kabcd02.");
           return con;
     
       }
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
