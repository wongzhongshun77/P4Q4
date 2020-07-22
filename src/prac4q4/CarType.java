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
public class CarType {
    
    //data member
    private String make;
    private String model;
    private double capacity;
    
    //constructor
    public CarType(String make, String model, double capacity) {
    this.make = make;
    this.model = model;
    this.capacity = capacity;
 
}

    //method
    public String toString() {
        
        return String.format("%-10s %-10s %-5.1f", make, model, capacity);
    }
}
