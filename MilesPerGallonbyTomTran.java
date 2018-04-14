package Chapter2;

/* 

Info:  
 Name:  Tom Tran
 Class:  CISS 238 - Java
 Prof:  James Barringer
 Week:  1
 Date:  October 25, 2017
 Chap:  2
 Programming Challenge: 2

  Description:
  Miles Per Gallon Calculator Program
  
  The program will have three variables that store miles, gallons, and mpg
  The program will ask user to enter in data for each variable
  The program will calculate the MPG based on data that was entered by user.


*/

import java.util.Scanner;				// for the scanner class

public class MilesPerGallonbyTomTran {

	public static void main(String[] args) {
		
		
		//Variables
		
		double miles;											// store miles variable as Double
		double gallons;											// store gallon variable as Double
		double mpg;												// store Miles-Per-Gallon result as Double
		
		// Scanner object to read input
		Scanner input = new Scanner(System.in);
		
		// Intro
		System.out.println("Welcome to Tom Tran's Miles Per Gallon Program\n");
		
		//Get miles
		System.out.printf("Enter the miles driven: ");			
		miles = input.nextDouble();								
		
		//Get Gallons
		System.out.printf("Enter the gallons of fuel used: ");	
		gallons = input.nextDouble();							
		
		//Calculate Miles-Per-Gallon
		mpg = miles / gallons;												
		
		// Display results
		System.out.printf("The miles-per-gallon is: %12.15f" , mpg);	

	}
}
