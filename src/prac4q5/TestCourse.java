/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac4q5;

/**
 *
 * @author wong
 */
public class TestCourse {

    public static void main(String[] args){
    	Course c = new Course("Introduction To Computers", 250);
    	c.addStudents("Ali Said");
    	c.addStudents("Wong Ken");
    	c.addStudents("Peter Lim");
    	
    	System.out.println(c.toString() + "\nTotal Fees Collected : " + String.format("%.2f\n", c.calcFeesCollected()));
    	
    	String[] studList = c.getStudentNames();
    	
    	System.out.println("Student List: ");
    	
    	for(int i = 0; i < c.getNoOfStudents(); i++){
    		System.out.println((i+1) + ", " + studList[i]);
    	}
    }
    
    
}
