/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac4q4;
import java.util.Scanner;
/**
 *
 * @author wong
 */
public class TestCarRegistration {
    
        //todo:: By using array, create 3 CarType objects
        public static CarType[] carTypeArr ={
    
    	new CarType("Toyota","Vios",1.5),
    	new CarType("Nissan","Tienna",2.0),
    	new CarType("Honda","City",1.8)
    };
        
         public static void main(String []args){
  	//todo:: create an array that will able to store 6 registrations
        
  	Registration[] regArr = new Registration[1];	
  	Scanner scanner = new Scanner(System.in);
  	
  	for (int i = 0; i <  regArr.length/*todo:: loop until the number of registration */; ++i) {

  		System.out.println("\nRegistration number: " + Registration.getNextRegNo());
  		
                //todo:: request and read the owner detail
  		System.out.print("Enter owner's name : ");
                String name = scanner.nextLine();
                System.out.print("Enter IC number : ");
                String icNo = scanner.nextLine();
                
                //create owner object
    		Owner owner = new Owner(name,icNo);
                
  		//todo:: request and read car detail
  		System.out.print("\nEnter plate no : ");
    		String plateNo = scanner.next();
    		System.out.print("Enter color : ");
    		String color = scanner.next();
    		System.out.print("Enter year : ");
    		int year = scanner.nextInt();
                
  		System.out.println("\nCar Types: ");
  		//todo:: display all available carType
                for(int j = 0; j < carTypeArr.length; ++j){
    			System.out.println((j+1) + "." + carTypeArr[j].toString());
    		}
                
  		System.out.print("\nSelect car type [1.." + carTypeArr.length/* todo:: display the max number of car option */ + "]: ");
  		int selection = scanner.nextInt();
  		
                //todo:: get cartype from array (based on selection)
                CarType carType = carTypeArr[selection-1];
                
  		//todo:: create car object
  		Car car  = new Car(plateNo, color, year);
                
  		//todo:: register the car
               regArr[i] = new Registration(owner, car, carType);
                
  		scanner.nextLine();
  	}
  
  	//todo:: display all registration detail
        displayListing(regArr);
  }
  
 public static void displayListing(Registration[] regArr){
    	System.out.printf("\n\n%50s\n","Car Registration Listing");
    	System.out.printf("%-6s %-12s %-12s %-10s %-8s %-8s %-10s %-10s %-5s\n","Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make","Model","Capacity");
    	
    	for(int i = 0; i < regArr.length; ++i){
    		System.out.println(regArr[i].toString());
    	}
    }
}
