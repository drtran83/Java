package Chapter8;


/*Info
 * Name:  Tom Tran
 * Class:  CISS 238 - Java
 * Prof: James barringer
 * Week: 4
 * Date: November 14, 2017
 * Chapter: 8
 * 
 * Project: Chapter 8 - Programming Challenge 1 - Backward String
 *
 * Description:  Program will take a simple user input passed to a method that uses
 * am array and for loop to reverse the string.
 * 
 */

import java.util.Scanner; // Scanner

public class BackwardString {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the backwards string program by Tom Tran\n");

		// tell user to enter something
		System.out.println("Enter something: ");

		// Scanner to get input
		Scanner uInput = new Scanner(System.in);

		// get user input
		String inputStr = uInput.nextLine();

		// Show what the user input
		System.out.println("What you entered : " + inputStr);

		// Variables

		char temp;														// temp char variable
		char[] array = inputStr.toCharArray();							// take inputstr and put it into char array
		int len = array.length;											// length variable for array length

		// loop to reverse the string
		for (int i = 0; i < (inputStr.length()) / 2; i++, len--) {
			temp = array[i];											// set temp to array with i count
			array[i] = array[len - 1];									// array length will - 1
			array[len - 1] = temp;										// set array length - 1 to temp
		}
		
		// print output that is backwards
		System.out.println("Now it is backwards! : " + String.valueOf(array));
	}

}
