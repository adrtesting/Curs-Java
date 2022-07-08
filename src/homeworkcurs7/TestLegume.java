package homeworkcurs7;

import java.io.IOException;
import java.util.Scanner;

public class TestLegume {
	
	//TextFileProcessor obj = new TextFileProcessor();
	//obj.writeTxtFile("Textul meu din fisier!\n");
	
	static String leguma;

	public static void main(String[] args) throws IOException {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce leguma doriti sa cumparati?");
		try {
			leguma = scan.next();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LegumeFile obj = new LegumeFile();
		System.out.println();

		obj.writeCalori();
		obj.readCalori("Conopida");
		
	

	}
}

