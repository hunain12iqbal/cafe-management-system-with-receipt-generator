/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeshop;

import java.sql.*;
import javax.swing.JOptionPane;
public class MyConnection {
    
    Connection cc;
    Statement st;
    String dbt = "jdbc:sqlserver://DESKTOP-BIDQUFO:1433;databaseName=cafe;user=Hunain;password=123";
    
    public MyConnection(){
        
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cc = DriverManager.getConnection(dbt);
            st = cc.createStatement();
            
            
            
            
            
            
            
         
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    
    
    
    
    
    
    
    
}
