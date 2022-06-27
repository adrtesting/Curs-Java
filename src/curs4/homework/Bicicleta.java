package curs4.homework;



public class Bicicleta extends Vehicul {
	
	private String brand;
	private String nivelPoluare;
	private int vitezaMedie;
	
	@Override
	public String getbrand() {
		return brand;
		
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String getnivelPoluare() {
		return nivelPoluare;
		
	}
	
	public void setnivelPoluare(String nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}
	
	@Override
	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}
	

}
