package homeworkcurs7;

import java.io.FileWriter;
import java.io.IOException;

public class TextLeguma {
	

	public void writeTxtFile(String lista) {
		
		try {
			FileWriter myWriter = new FileWriter("lista.legume.txt");
			myWriter.write(lista);
			myWriter.close();
			System.out.println("Am creat lista");
		} catch (IOException e) {
			System.out.println("Nu se afla in lista");
			e.printStackTrace();
		}
	}
		
	}
	

