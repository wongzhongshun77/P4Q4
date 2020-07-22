/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac4q4;

/**
 *
 * @author wong
 */
public class Owner {
    
   //data members
   private String name;
   private String icNo;
   
    //CONSTRUCTOR
   public Owner(String name,String icNo){
   this.name = name;
   this.icNo = icNo;
   
}
   
public String toString(){
    
    return String.format("%-12s %-12s", name, icNo);
   }
}
