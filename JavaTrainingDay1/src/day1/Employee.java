package day1;

public class Employee {

	int salary; 
	int bonus;
	
	//Constructor
	public Employee() {
		salary = 5000;
		bonus = 500;
	}
	
	//Parameterized constructor
	public Employee(int salary, int bonus) {
		
		this.salary = salary;
		this.bonus = bonus;
	}
	
	
	void calculateSalary(){
		//local variable
		int totalSalary;
		totalSalary = salary+bonus;
		
		System.out.println("Total Salary ="+totalSalary);
	}
	
	int calculateSalary1(){
		//local variable
		int totalSalary;
		totalSalary = salary+bonus;
		return totalSalary;
	}
	
	
	//argument level variable
	int calculateSalary(int sal,int bon){
		//local variable
		int totalSalary;
		totalSalary = sal+bon;
		return totalSalary;
	}
}
