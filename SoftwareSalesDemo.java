package Chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Name:  Tom Tran
 * Class:  CISS 238 - Java
 * Professor: James Barringer
 * Week: 2
 * Date: October 31, 2017
 * Chapter 4: 
 * Programming Challenge 4: Software Sales, page 274
 * 
*/

public class SoftwareSalesDemo {
	public static void main(String[] args) {
		
		int units; // To hold units sold

		System.out.println("Welcome to the Software Sales Program by Tom Tran\n");
		
		// Create a Scanner object for keyboard input.
		Scanner input = new Scanner(System.in);

		// Get the units sold.
		System.out.print("Enter the units sold: ");
		units = input.nextInt();

		// Create a SoftwareSales object.
		SoftwareSales sales = new SoftwareSales(units);

		// Display purchase info.
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		System.out.println("Units sold: " + sales.getUnitsSold());
		System.out.println("Discount: $" + dollar.format(sales.getDiscount()));
		System.out.println("Cost: $" + dollar.format(sales.getCost()));
	}
}
