package curs1;

public class WageCalculator {
	
	public int hoursWorked = 40;

	public static void main(String[] args) {
		
		Tester tester1 = new Tester();
		tester1.setName("Oana");
		System.out.println(tester1.getName());
		
		Tester tester2 = new Tester();
		tester2.setName("Matei");
		System.out.println(tester2.getName());
		
		tester1.setRatePerHour(55);
		System.out.println(tester1.getRatePerHour());
		
		tester2.setRatePerHour(30);
		System.out.println(tester2.getRatePerHour());
		
		WageCalculator curs = new WageCalculator();
		curs.calculateSalary(tester1.getRatePerHour());
		System.out.println(curs.calculateSalary(tester1.getRatePerHour()));
	}
	
	public int calculateSalary(int plataPeOra) {
		
		int salary = plataPeOra*hoursWorked;
		return salary;
	}

}
