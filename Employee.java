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
  
  This employee class will have variables that store the employees:
  Name, iDNumber, Department, and position.
  
  This class will have appropriate setters and getters for the variables to be
  accessed by EmployeeDemo.java

*/

public class Employee{

		// variables
		
		private String Name;
		private int IdNumber;
		private String Department;
		private String Position;
		
	// constructors
	
		// Default constructor
		public Employee(){
			Department = "";
			IdNumber = 0;
			Name ="";
			Position = "";
		}
		
		// constructor
		public Employee(String empName, int empIdNumber, String empDep, String empPosition){
			
			Department = empDep;
			IdNumber = empIdNumber;
			Name = empName;
			Position = empPosition;
		}
		
		
		
		// setter methods
		
		public void setDepartment(String empDep){
			Department = empDep;
		}
		
		public void setIdNumber(int empIDNumber){
			IdNumber =  empIDNumber;
		}
		
		public void setName(String empName){
			Name = empName;
		}
		
		public void setPosition(String empPosition){
			Position = empPosition;
		}
		
		// getter methods
		
		public String getDepartment(){
			return Department;
		}
		
		public int getIdNumber(){
			return IdNumber;
		}
		
		
		public String getName(){
			return Name;
		}
		
		public String getPosition(){
			return Position;
		}
		
	


	

}
