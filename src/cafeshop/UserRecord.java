/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeshop;

/**
 *
 * @author Hunain
 */
public class UserRecord {
    
    
     private String name, pass;
    
    public UserRecord(String name, String pass){
        this.name = name;
        this.pass = pass;
        
        }
    
    String getname(){
        return name;
                
    }
    String getpass(){
        return pass;
                
    }
    
  }

 class Feedcus{
    
    private String feedback;
    public Feedcus(String feedback){
        this.feedback=feedback;
    }
    String getfeedback(){
        return feedback;
    }
    
    
    
    
}