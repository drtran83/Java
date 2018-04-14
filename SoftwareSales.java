package Chapter4;

/*
 * Name:  Tom Tran
 * Class:  CISS 238 - Java
 * Professor: James Barringer
 * Week: 2
 * Date: October 31, 2017
 * Chapter 4: 
 * Programming Challenge 4: Software Sales, page 274
 * 
 * Description: A software company sells a package that retails for $99.00.  
 * Quantity discounts are given:
 * Quantity 10-19 = 20% discount
 * Quantity 20-49 = 30% discount
 * Quantity 50-99 = 40% discount
 * Quantity 100+ = 50% discount
 * 
 * Design a class that stores the number of units sold and has a method that 
 * returns the total cost of purchase.
 */

public class SoftwareSales {


	private 
	
	// variables
	
	double unitsSold,				 			// stores units
			discount, 							// stores discount
			cost, 								// stores cost
			price, 						   		// stores price
			subTotal;						 	// stores subTotal
	
	public

	// constructors

	// Default Constructor
	
	SoftwareSales(double units) {
		unitsSold = units;
		discount = 0;
		cost = 0;
		price = 99;
		subTotal = 0;

	}

	// Constructor
	
	SoftwareSales(double u, double d, double c, double p, double s) {
		u = unitsSold;
		d = discount;
		c = cost;
		p = price;
		s = subTotal;

	}

	// setters
	
	void setCost(double c) {
		c = cost;

	}

	void setDiscount(double d) {

		d = discount;

	}

	void setUnitsSold(double uS) {
		uS = unitsSold;
	}

	void setSubTotal(double sT) {
		sT = subTotal;

	}

	// getters

	double getSubTotal() {
		return subTotal = price * unitsSold;
	}
	
	double getCost() {
		return cost = subTotal - discount;
	}

	double getUnitsSold() {
		return unitsSold;
	}

	// Get Discount Function calculates the discount
	// according to the amount of units sold.

	double getDiscount() {

		getSubTotal();					// calls getSubTotal for this function to use it.
		
		// if units more than 10 but less than 19, discount is 20%
		if (unitsSold >= 10 && unitsSold <= 19) 
		{
			discount = .2 * subTotal;
		}

		// if packages greater than 20, less then 49 then 30% discount
		else if (unitsSold >= 20 && unitsSold <= 49) 
		{
			discount = .3 * subTotal;
		}

		// if packages great than 50, less than 99 then 40% discount
		else if (unitsSold >= 50 && unitsSold <= 99) 
		{
			discount = .4 * subTotal;
		}
		
		// if packages greater than 100
		else if (unitsSold >= 100) 
		{
			discount = .5 * subTotal;
		}

		// if packages less than 10, then no discount
		else
		{
			discount = .0;	
		}
		
		// Return discount
		return discount;
	}


}
