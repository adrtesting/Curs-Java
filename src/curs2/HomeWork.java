package curs2;

import java.util.Scanner;

public class HomeWork {
	
	String intrebare = "Care este punctajul tau?";
	
	public void test() {
		
		if (intrebare.matches("^[0-10]*[11-20]*[21-30]*[31-40]*[41-50]*[51-60]*[61-65]$") ) {
			
			System.out.println("Ai picat. Mai incearca");
			
		} else {
			
			System.out.print("Felicitari, Ai trecut");
		}
		
	}
	
	public void askTheUser() {
		
		 System.out.println("Care punctajul testului tau? ");
		Scanner scan = new Scanner(System.in);
		 intrebare = scan.next();
		 scan.close();
			
		}

	}


