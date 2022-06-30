package curs5;

import java.util.Scanner;

public class HomeWorkArray {

	public static void main(String[] args) {

		String[] months = new String[13];
		months[0] = "Incorrect number";
		months[1] = "Ianuarie";
		months[2] = "Feburarie ";
		months[3] = "Martie ";
		months[4] = "Aprilie";
		months[5] = "Mai";
		months[6] = "Iunie";
		months[7] = "Iulie";
		months[8] = "August";
		months[9] = "Septembrie";
		months[10] = "Octombrie";
		months[11] = "Noiembrie";
		months[12] = "Decembrie";
		
		int year = 13;
	
		
		do {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Te rog introdu numarul unei luni");
			year = scan.nextInt();
			
			if(year >= 13 ) {
				System.out.println("Numar invalid - introdu un numar de la 1 la 12");
			} else { 
				System.out.println(months[year]);
			} 
			
		} while (year >= 13);
	
	}
	

}


