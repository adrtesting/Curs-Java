package curs6;

import java.util.Scanner;

public class HomeWorkTestSavingsAccount {

		public static void main(String[] args) {
			
			HomeWorkCustomer homeWorkCustomer = new HomeWorkCustomer("Adrian", "adresa", "email");
			testprogram(homeWorkCustomer);
			
			HomeWorkSavingsAccount homeWorkSavingsAccount = new HomeWorkSavingsAccount("1231231", 30, "Adrian");
			testprogram2(homeWorkSavingsAccount);
		}
	
		public static void testprogram(HomeWorkCustomer obj) {
			
			System.out.println("Hi " + obj.name());
			
		}
		
		public static void testprogram2 (HomeWorkAccount obj1) {
			
				System.out.println("Please enter the amount to widraw ");	
				Scanner scan = new Scanner(System.in);
				scan.close();
		
		}

}
