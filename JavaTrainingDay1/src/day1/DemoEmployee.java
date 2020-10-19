package day1;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee test = new Employee();
		test.calculateSalary();
		
		Employee test1 = new Employee(12000,1200);
		test1.calculateSalary();
		
		Employee nupur;
		nupur = new Employee();
		//Constructor
		
		nupur.salary = 78679;
		nupur.bonus = 886;
		
		nupur.calculateSalary();
		
		Employee rishabh = new Employee();
		rishabh.salary = 768898;
		rishabh.bonus = 87678;
		
		int salary = rishabh.calculateSalary1();
		
		System.out.println("Rishabh's Salary = "+ salary);
		
		Employee a = new Employee();
		int b= a.calculateSalary(8487, 86);
		System.out.printf("A's salary = "+a.calculateSalary(8487, 86));
		
	}

}
