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
public class Registration {
    
    //data members
    private int regNo;
    private Owner owner;
    private Car car;
    private CarType carType;
    private static int nextRegNo = 1001;
    
    //constructor
    public Registration(Owner owner, Car car,CarType carType) {
    this.regNo = nextRegNo++;
    this.owner = owner;
    this.car = car;
    this.carType = carType;
}
    
    //method
    //getter
    public static int getNextRegNo(){
    	return nextRegNo;
    }

    public String toString(){
    	return String.format("%-6d %-24s %-28s %-10s\n",regNo,owner.toString(),car.toString(),carType.toString());
    }
}
