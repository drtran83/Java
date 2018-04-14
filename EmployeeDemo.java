package Chapter3;
/* 

Info:  
 Name:  Tom Tran
 Class:  CISS 238 - Java
 Professor:  James Barringer
 Week:  1
 Date:  October 25, 2017
 Chap:  3
 Programming Challenge: 3

  Description:
 Employee Demo Class
  
  The program will create three instances of employee class as new employee objects
  The program will set information of employee to corresponding variable in employee class
  The program will display the employee information.


*/

public class EmployeeDemo
{
	public static void main(String[] args)
	{
		System.out.println("Employee Class Demo by Tom Tran\n");
		
		// Create three instances of the Employee class.
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		// Store data for the first employee.
		employee1.setName("Susan Meyers");
		employee1.setIdNumber(47899);
		employee1.setDepartment("Accounting");
		employee1.setPosition("Vice President");
		
		// Store data for the second employee.
		employee2.setName("Mark Jones");
		employee2.setIdNumber(39119);
		employee2.setDepartment("IT");
		employee2.setPosition("Programmer");

		// Store data for the third employee.
		employee3.setName("Joy Rogers");
		employee3.setIdNumber(81774);
		employee3.setDepartment("Manufacturing");
		employee3.setPosition("Engineer");
	
		// Display the data for employee 1.
		System.out.println("Employee #1");
		System.out.println("Name: " + employee1.getName());
		System.out.println("ID Number: " + employee1.getIdNumber());
		System.out.println("Department: " + employee1.getDepartment());
		System.out.println("Position: " + employee1.getPosition());
		System.out.println();
		
		// Display the data for employee 2.
		System.out.println("Employee #2");
		System.out.println("Name: " + employee2.getName());
		System.out.println("ID Number: " + employee2.getIdNumber());
		System.out.println("Department: " + employee2.getDepartment());
		System.out.println("Position: " + employee2.getPosition());
		System.out.println();
		
		// Display the data for employee 3.
		System.out.println("Employee #3");
		System.out.println("Name: " + employee3.getName());
		System.out.println("ID Number: " + employee3.getIdNumber());
		System.out.println("Department: " + employee3.getDepartment());
		System.out.println("Position: " + employee3.getPosition());
		System.out.println();
	}
}
