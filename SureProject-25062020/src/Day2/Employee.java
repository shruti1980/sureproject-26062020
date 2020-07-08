package Day2;

public class Employee {
		
	int salary;
	int bonus;
	
	public Employee() {
		System.out.println("I am a constructor");
		salary = 109000;
		bonus = 1000;
	}
	
	void calculatesalary() {
		int totalsalary = salary + bonus;
		System.out.println( "Total salary is  :  "  +   totalsalary);
	}
	
	int calculatesalary1() {
		int totalsalary = salary + bonus;
		return totalsalary;
				
	}
	
	int calculatesalary2(int sal,int bon) {
		int totalsalary = sal + bon;
		return totalsalary;
	}
	
	
	int calculatesalary3(int salary	,int bonus) {
		int totalsalary = this.salary + this.bonus;
		return totalsalary;
	}
	

}
