package curs5;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 8;
		
		int x;
		
		x = (num1>num2) ? num1 : num2;
		System.out.println(x);
		
		if(num1>num2) {
			
			x = num1;
		} else {
			
			x = num2;
		}
		
		System.out.println(x);
	}

}
