package curs2;

import java.util.Scanner;

public class HomeWorkPart2 {
	
	int  varsta1;


	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce varsta ai? ");
		varsta1 = scan.nextInt();
		scan.close();
		 
	}
	
	public void showResults() {
		System.out.println(varsta1  + " "  );
	
	}
	
	
	
	public void insertAge() {
		askTheUser();
		
		if ((varsta1 < 18)) {
			showResults();
			
		} else if (varsta1 >= 18 && varsta1 <= 65) {
			System.out.println("Esti Adult");
			showResults();
			
		} else {
			System.out.println("Esti batran");
			
		}
	}

}
