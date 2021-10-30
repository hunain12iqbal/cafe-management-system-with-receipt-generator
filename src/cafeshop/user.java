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
class user {
    
    
    private String id, price;
    private String tim;
    public user(String id, String price, String tim){
        this.id = id;
        this.price = price;
        this.tim = tim;
        }
    
    String getid(){
        return id;
                
    }
    String getprice(){
        return price;
                
    }
    String gettim(){
        return tim;
                
    }
    
  }
class Staff{

    private String name, department,date1;
    private int id;
    private long phone;
    float salary;
    
    public Staff(String name, String department, String date1,int id, long phone, float salary){
        this.name = name;
        this.department =  department;
        this.date1 = date1;
        this.id = id;
        this.salary = salary;
        this.phone = phone;
         }
    
    
    String getname(){
        return name;
    }
    String getdepartment(){
        return department;
    }
    String getdate1(){
        return date1;
    }
    int getid(){
        return id;
    }
    float salary(){
        return salary;
    }
    long getno(){
        return phone;
    }
    
    
}
