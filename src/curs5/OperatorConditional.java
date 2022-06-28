package curs5;

import java.util.Scanner;

public class OperatorConditional {
	
	/*
	 * Citeste 2 numere de la tastatura si verifica urmatoarele reguli:
	 * verifica daca fiecare numar este pozitiv
	 * verifica daca ambele nr sunt pozitive
	 * verifica care dintre cele doua numere este cel mai mic
	 * 
	 */

	public static void main(String[] args) {

		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please inser first number : ");
		
		num1 = scan.nextInt();
		System.out.println("Please insert second number : ");
		num2 = scan.nextInt();
		
		//result = (conditie) ? expresie1 : expresie2
		//result = (num1>=0) ? "Num1 is pozitiv" : "Num1 is negative";
		
		
		//verifica daca fiecare numar este pozitiv
//		if(num1>=0) {
//			System.out.println("Num1 is pozitiv");
//		} else {
//			System.out.println("Num1 is negative");
//		}
		
		String result;
		result = (num1>=0) ? "Num1 is pozitiv" : "Num1 is negativ";
		System.out.println(result);
		
		result = (num2>=0) ? "Num2 is pozitiv" : "Num2 is negativ";
		System.out.println(result);
		
//		if(num2>=0) {
//			System.out.println("Num2 is pozitiv");
//			
//		}else  {
//			System.out.println("Num2 is negative");
//		}
//		
		//verifica daca ambele nr sunt pozitive
		
		result = (num1>=0 && num2>=0) ? "Both are pozitiv" : "At least one is negative";
		System.out.println(result);
		
//		if(num1>=0 && num2>=0) {
//			System.out.println("Both are pozitive");
//		} else {
//			System.out.println("At least one is negative");
//		}
		
		result = (num1 == num2) ? "Numbers are equal":(num1>num2)?"Num2 is the smallest!":"Num1 is the smallest";
		System.out.println(result);
		
		//verifica care dintre cele doua numere este cel mai mic
		
//		if(num1>num2) {
//			System.out.println("Num2 is the smallest!");
//		} else if(num1 == num2) {
//			System.out.println("Numbers are equal");
//		} else {
//			System.out.println("Num1 is the smallest");
//		}
		
	}

}
