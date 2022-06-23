package curs3;

import java.util.Scanner;

public class HomeWork {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userValue = "TestUser";
		int parolaValue = 1234;
		int maxiumattempts = 0;
		scan.close();
		
		do {
			if(maxiumattempts >= 3) {
				System.out.println("Maximum attempts reached. User blocked");
				break;
			} 
			
			System.out.println("Te rog introdu user :");
			String EnterUser = scan.next();
			System.out.println("Introdu parola : ");
			int EnterPassword = scan.nextInt();
			
			if (EnterUser == userValue && EnterPassword == parolaValue) {
				System.out.println("Login Succesful");
			break;
			}
			else {
				System.out.println("Login Error");
				maxiumattempts ++;
			}
		
		} while (maxiumattempts <= 3);		
		
	}

}
