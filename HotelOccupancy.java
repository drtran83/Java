package Chapter5;

/*Name:  Tom Tran
 * Class:  CISS 238 - Java
 * Professor: James Barringer
 * Week: 2
 * Date: October 31, 2017
 * Chapter: 5 
 * Programming Challenge 5: Hotel Occupancy
 * 
 * Description: A hotel's occupancy is calculated as follows:
 * 
 * Occupancy rate = number of rooms occupied / total number of rooms.
 * 
 * Write a program that calculates the occupancy rate for each floor of a hotel.  The program
 * should start by asking the user for the number of floors that the hotel has.  A loop should then
 * iterate once for each floor.  During each iteration, the loop should ask for the number
 * of rooms on the floor and how many of them are occupied.  After all the iterations, the program
 * should display the number of rooms the hotel has, the number that are occupied, the number that
 * are vacant, and the occupancy rate for the hotel.
 * 
 * Input validation: Do not accept a value less than 1 for the number of floors.  
 * Do not accept a number less than 10 for the number of rooms on a floor. 
 * 
 */

import java.util.Scanner;

public class HotelOccupancy {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Hotel Occupancy Program by Tom Tran\n");

		// variables

		int floors; 							// stores number of floors
		int roomsOccupied = 0; 					// stores rooms occupied
		double occupancyRate = 0; 				// stores occupancy rate.
		double rooms = 0;						// stores number of rooms
		double totalRooms = 0; 					// stores total rooms
		double totalRoomsOccupied = 0; 			// stores total rooms occupied
		double totalVacancy = 0; 				// stores total vacancy
		

		// Scanner
		Scanner input = new Scanner(System.in);

		// prompt user
		System.out.print("Enter the number of floors that your hotel has: ");
		floors = input.nextInt();

		// Floor count validation
		while (floors < 1) 
		{
			System.out.print("Invalid, enter 1 floor or more: ");
			floors = input.nextInt();
		}

		// prompt user for the number rooms on each floor.
		for (int count = 0; count < floors; count++) { // set count as
														// accumulator
			System.out.print("How many rooms does Floor " + (count + 1) + " have? ");
			rooms = input.nextDouble();

			// room validation
			while (rooms < 10) 
			{
				System.out.print("Invalid, enter 10 rooms or more: ");
				rooms = input.nextDouble();
			}

			// prompt user for the number of rooms occupied
			System.out.print("How many occupied rooms does Floor " + (count + 1) + " have? ");
			roomsOccupied = input.nextInt();

			if (roomsOccupied > rooms)
			{
				System.out.print("\nYou have entered a occupied room amount that is greater than rooms available " +
			"\nEnter the amount of occupied rooms that is less than " + rooms + ": ");
				roomsOccupied = input.nextInt();
			}
			
			// calculate total rooms
			totalRooms += rooms;

			// calculate total occupied rooms
			totalRoomsOccupied += roomsOccupied;

		}

		// calculate total vacancy
		totalVacancy = totalRooms - totalRoomsOccupied;

		// calculate occupancy rate
		occupancyRate = (totalRoomsOccupied / totalRooms);

		// Display Occupancy data
		System.out.println("\nNumber of rooms: " + totalRooms + "\nOccupied rooms: " + totalRoomsOccupied
				+ "\nVacant rooms: " + totalVacancy + "\nOccupancy rate: " + occupancyRate);

	}

}
