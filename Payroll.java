package Chapter7;

/*Name:  Tom Tran
 * Class:  CISS 238 - Java
 * Professor: James Barringer
 * Week: 3
 * Date: November 8, 2017
 * Chapter: 7 
 * Programming Challenge 7 - PayRoll Class
 * 
 */

public class Payroll {
	
		// Constant for the number of employees
		public final int NUM_EMPLOYEES = 7;

		// Array of employee ID numbers
		private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
		// Array to hold hours worked
		private int[] hours = new int[NUM_EMPLOYEES];

		// Array to hold pay rates
		private double[] payRate = new double[NUM_EMPLOYEES];

		// Array to hold wages earned
		private double[] wages = new double[NUM_EMPLOYEES];
		
		public

		/**
		 * getGrossPay method Returns the gross pay for the employee whose data is
		 * stored at element i of each array.
		 */

		// constructor
		void getGrossPay() {

			for (int i = 0; i < NUM_EMPLOYEES; i++) {

				wages[i] = hours[i] * payRate[i];
			}

		}

		// setters

		/**
		 * setEmployeeIdAt method
		 */

		void setEmployeeIdAt(int index, int employeeId) {
			this.employeeId[index] = employeeId;
		}

		/**
		 * setHoursAt method
		 */

		void setHoursAt(int index, int hours) {
			this.hours[index] = hours;
		}

		/**
		 * setPayRateAt method
		 */

		void setPayRateAt(int index, double payRate) {
			this.payRate[index] = payRate;
		}

		/**
		 * setWagesAt method
		 */
		void setWagesAt(int index, double wages) {
			this.wages[index] = wages;
		}

		// getters

		/**
		 * getEmployeeIdAt method
		 */

		int getEmployeeIdAt(int index) {
			return employeeId[index];
		}

		/**
		 * getHoursAt method
		 */

		int getHoursAt(int index) {
			return hours[index];
		}

		int[] getHours() {
			return hours;
		}

		/**
		 * getPayRateAt method
		 */

		double getPayRateAt(int index) {
			return payRate[index];
		}

		double[] getPayRate() {
			return payRate;
		}

		/**
		 * getWagesAt method
		 */

		double getWagesAt(int index) {

			return wages[index];
		}

		double[] getWages() {

			return wages;
		}
}
