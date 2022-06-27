package curs4.homework;

public class Vehicul {
	
	private String brand;
	private String nivelPoluare;
	private int vitezaMedie;
	private String nume;
	private String motorizare;
	
	public String getNume() {
		return nume;
		
	}
	
	public void setNume(String nume) {
		this.nume = nume;
		
	}
	
	public String getMotorizare() {
		return motorizare;
	}
	
	public void setMotorizare(String motorizare) {
		this.motorizare = motorizare;
	}
	
	public void getdetaliivehicul() {
		System.out.println(nivelPoluare + "pentru masina" + brand + "este : 5" + "si" + vitezaMedie +  "atinsa este de 180km/h");
		
	}

	public String getbrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	public String getnivelPoluare() {
		// TODO Auto-generated method stub
		return nivelPoluare;
	}

	public void setVitezaMedie(int vitezaMedie) {
		return;
	}
	
	
}
