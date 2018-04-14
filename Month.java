package Chapter6;

/*Name:  Tom Tran
 * Class:  CISS 238 - Java
 * Professor: James Barringer
 * Week: 3
 * Date: November 8, 2017
 * Chapter: 6 
 * Programming Challenge 6 - Month Class
 * 
 * Description: The Month Demo's will use this Month class to get
 * the month name and number according to what the demo's call.
 * 
 * 
 */

public class Month {

	private

	int monthNum; // Holds the number of the month

	public

	// Default no argument constructor that sets the monthNumber field to 1

	Month() 
	{
		monthNum = 1;
	}

	/*
	 * First overloaded constructor that will accept the number of month as
	 * argument int m then pass numberMonth to m set the numberMonth to 1 if
	 * value passed is not between 1 and 12
	 */

	Month(int m) 
	{
		monthNum = m;
		if (monthNum < 1 || monthNum > 12) {
			monthNum = 1;
		}
	}

	// Second Overloaded Constructor that accepts the
	// names of the months as arguments

	Month(String m) 
	{
		if (m.equalsIgnoreCase("January")) {
			monthNum = 1;
		} else if (m.equalsIgnoreCase("February")) {
			monthNum = 2;
		} else if (m.equalsIgnoreCase("March")) {
			monthNum = 3;
		} else if (m.equalsIgnoreCase("April")) {
			monthNum = 4;
		} else if (m.equalsIgnoreCase("May")) {
			monthNum = 5;
		} else if (m.equalsIgnoreCase("June")) {
			monthNum = 6;
		} else if (m.equalsIgnoreCase("July")) {
			monthNum = 7;
		} else if (m.equalsIgnoreCase("August")) {
			monthNum = 8;
		} else if (m.equalsIgnoreCase("September")) {
			monthNum = 9;
		} else if (m.equalsIgnoreCase("October")) {
			monthNum = 10;
		} else if (m.equalsIgnoreCase("November")) {
			monthNum = 11;
		} else if (m.equalsIgnoreCase("December")) {
			monthNum = 12;
		} else {
			monthNum = 1;
		}
	}

	// Setters

	/*
	 * setMonthNumber method that accepts int m as argument and assign to
	 * monthNumber field. set if the value is not between 1 and 12, set
	 * monthNumber back to 1 like before.
	 */
	void setMonthNumber(int m) 
	{
		this.monthNum = m;
		if (monthNum < 1 || monthNum > 12) {
			this.monthNum = 1;
		}
	}

	// Getters

	// getMonthNumber method that returns monthNumber value.

	int getMonthNumber() 
	{
		return monthNum;
	}

	/*
	 * getMonthName method that returns the name of month mased on what is
	 * stored in the numberMonth field. Use case statement to switch the
	 * numbered moth with a string representing the month.
	 */

	String getMonthName() 
	{

		String name; // String to store name of the month

		// Switch statement that accepts monthNum as argument and sets
		// the name according to the monthNum inputted.

		switch (monthNum) {
		case 1:
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
		default:
			name = "Unknown";
		}
		return name;
	}

	// toString method that returns the same value as getMonthName method.

	public String toString() {
		return getMonthName();
	}

	/*
	 * boolean method that accepts a month object as an argument then returns
	 * true or false after comparing the new object with the object that is
	 * accepting it.
	 */

	boolean equals(Month month2) 
	{

		boolean status; // holds boolean and named status.

		if (month2.getMonthNumber() == monthNum)
			status = true;
		else
			status = false;

		return status;
	}

	/*
	 * greaterThan method that compares the month object and checks to see if it
	 * is greater than the object accepting it.
	 */

	boolean greaterThan(Month month2) 
	{

		boolean status;

		if (monthNum > month2.getMonthNumber())
			status = true;
		else
			status = false;

		return status;
	}

	/*
	 * lessThan method that compares the month object and checks to see if it is
	 * less than the object accepting it.
	 * 
	 */

	boolean lessThan(Month month2) {

		boolean status;

		if (monthNum < month2.getMonthNumber())
			status = true;
		else
			status = false;

		return status;
	}

}
