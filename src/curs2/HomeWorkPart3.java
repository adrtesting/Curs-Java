package curs2;

import java.util.Scanner;


public class HomeWorkPart3 {
	
	String ziuasaptamanii;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu un numar de la 1 la 7 :");
		ziuasaptamanii = scan.next();
		scan.close();
		
	}
	
	public void Saptamana() {
		
		switch(ziuasaptamanii.toUpperCase()) {
		case "1":
			System.out.println("Luni");
			break;
		case "2":
			System.out.println("Marti");
			break;
		case "3":
			System.out.println("Miercuri");
			break;
		case "4":
			System.out.println("Joi");
			break;
		case "5":
			System.out.println("Vineri");
			break;
		case "6":
			System.out.println("Sambata");
			break;
		case "7":
			System.out.println("Duminica");
			break;
		default:
			System.out.println("Te rog sa introduci un numar de la 1 la 7");
		}
	}
	

}
