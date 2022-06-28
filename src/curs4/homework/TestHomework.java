package curs4.homework;

public class TestHomework {

	public static void main(String[] args) {
		
		Bicicleta bicicleta = new Bicicleta(" Pegas", 0, 90);
		bicicleta.detaliivehicul();
		verificaMotorizarea(bicicleta);
		
		Masina masina = new Masina(" Dacia", 86, 190);
		masina.detaliivehicul();
		verificaMotorizarea(masina);
		
}
	

	public static void  verificaMotorizarea (Vehicul obj) {
	System.out.println("Aceaste este o " + obj.nume() + " si are " + obj.motorizare() );
}

}

