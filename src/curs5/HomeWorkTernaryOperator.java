package curs5;

import java.util.Scanner;

public class HomeWorkTernaryOperator {

	public static void main(String[] args) {
		
		//discount unei facturi 
		//Daca factura este mai mare decat 100 aplica un dsicount de 10%
		//Daca factura este mai mica decat 100 aplica un discount de 5%
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu' valoarea facturi");
		
	
		int discount = 100;
		discount = scan.nextInt();
		
		String factura = (discount >= 100 && discount <= 100) ? "discount de 10%" : "discount de 5%";
		
		System.out.println(factura);
		
	
}
}


