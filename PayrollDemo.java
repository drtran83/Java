package Chapter7;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Name:  Tom Tran
 * Class:  CISS 238 - Java
 * Professor: James Barringer
 * Week: 3
 * Date: November 8, 2017
 * Chapter: 7 
 * Programming Challenge 7 - PayRoll Demo
 * 
 * Description: PayRoll Demo will use the PayRoll class to get employee's ID, hours worked, and pay rate
 * The Demo will then calculate according to user input data per each employee and display the results
 * 
 * 
 */

public class PayrollDemo {
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to Tom Tran's PayRoll Demo\n");
		
				// create local variable
				// Hours worked
				// Hourly pay rate

				int hours; // holds Hours worked
				double payRate; // holds Hourly Pay Rate

				// Create a Scanner object for keyboard input.

				Scanner userInput = new Scanner(System.in);

				// Create a Payroll object.

				Payroll pay = new Payroll();

				// in a loop Get the hours and pay rate for each employee.
				// using a while loop validate the input
				// store valid data in the payroll class arrays

				for (int index = 0; index < 7; index++) {

					// get the employee ID.

					System.out.println("EmployeeID: " + pay.getEmployeeIdAt(index));

					// get hours worked.

					System.out.println("Enter the hours worked: ");
					hours = userInput.nextInt();
					pay.setHoursAt(index, hours);

					while (hours < 0) {

						// input validation
						System.out.println("The number you entered is invalid, enter 0 or greater" + "of hours worked");
						System.out.println("Enter the hours worked: ");
						hours = userInput.nextInt();
						pay.setHoursAt(index, hours);

					}

					// get hourly pay rate.

					System.out.println("Enter the hourly pay rate: ");
					payRate = userInput.nextDouble();
					pay.setPayRateAt(index, payRate);

					while (payRate < 6.00) {

						// input validations
						System.out.println(
								"The number you entered is invalid, please enter 6.00 or greater for" + " the pay rate");
						System.out.println("Enter the hourly pay rate: ");
						payRate = userInput.nextDouble();
						pay.setPayRateAt(index, payRate);
					}

				}

				// display the info.

				pay.getGrossPay(); // calculate gross pay method

				System.out.println("\nPAYROLL DATA");
				System.out.println("============");
				for (int index = 0; index < 7; index++) {
					System.out.println(
							"\nEmployee ID: " + pay.getEmployeeIdAt(index) + "\nGross Pay: " + "$" + pay.getWagesAt(index));
				}

			}
}
