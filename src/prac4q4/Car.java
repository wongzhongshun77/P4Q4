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
public class Car {
    
    //data members
    private String plateNo;
    private String color;
    private int year;
  
    //constructor
    public Car(String plateNo, String color, int year) {
    this.plateNo = plateNo;
    this.color = color;
    this.year = year;
  
}

    //method
    public String toString() {
        return String.format("%-10s %-8s %-8d" , plateNo, color , year);
    }
    
}