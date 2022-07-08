package homeworkcurs7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class LegumeFile {
	

	public void writeCalori() throws IOException {
		
		try {
			
			OutputStream outPut = new FileOutputStream("lista.legume");
			
			Properties prop = new Properties();
			prop.setProperty("Mar", "52");
			prop.setProperty("Praz", "60");
			prop.setProperty("Ridiche", "15");
			prop.setProperty("Conopida", "24");
			prop.setProperty("Edamame", "121");	
			
			prop.store(outPut, "Categoriile de legume");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void readCalori(String key) throws IOException {
		
		InputStream obj = new FileInputStream("lista.legume");
		Properties prop = new Properties();
		prop.load(obj);
		System.out.println(prop.getProperty(key));
		

	}

}
