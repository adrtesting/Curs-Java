package curs2;

import java.util.Scanner;

public class Login {
	
	String username = "Admin";
	String password = "admin123";
	
	String userIntrodus;
	String passIntrodus;
	
	public void loginInApp() {
		
		//&& -- and
		// || -> OR 
		
		if(userIntrodus.equals(username) && passIntrodus.equals(password)) {
			System.out.println("Login sucessful");
			
		} else {
			System.out.println("Username or password is wrong");
		}
		
	}
	
	public void askTheUser() {
		
		System.out.println("Please insert your username :");
		Scanner scan = new Scanner(System.in);
		userIntrodus = scan.next();
		System.out.println("Please insert your password : ");
		passIntrodus = scan.next();
		
	}
	

}
