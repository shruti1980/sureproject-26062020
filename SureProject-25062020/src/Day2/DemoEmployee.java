package Day2;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee shruti;
		
		shruti= new Employee();
				
		shruti.salary = 100000;
		shruti.bonus = 5000;
		
		shruti.calculatesalary();
		
		System.out.println("------------------------------------------------------------");
		
		Employee sushma = new Employee();
		sushma.salary = 300000;
		sushma.bonus = 20000;
		int sushmaSalary = sushma.calculatesalary1();
		
		System.out.println("Salary of Sushma : "+ sushmaSalary);
		
		System.out.println("--------------------------------------------------------");
		
		Employee sandhya = new Employee();
		int  sandhyaSalary = sandhya.calculatesalary2(600000, 9000);
		System.out.println("Salary of Sandhya : " + sandhyaSalary);
		
		System.out.println("--------------------------------------------------------");
	//argument variables overrides instance variables	
		Employee sonu = new Employee();
		sonu.salary = 500000;
		sonu.bonus = 5000;
		
		int  sonuSalary = sonu.calculatesalary3(700000, 7000);
		System.out.println("Salary of Sonu : " + sonuSalary);
		
				
					
		
		
		
		

	}

}
