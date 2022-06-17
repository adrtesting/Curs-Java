package curs2;

public class ParSauImpar {
	
 // UpperCamelCase -> se foloseste la clase
// lowercamlecase -> metode
	
	public void  verificaParSauImpar(int numar) {
		//in paranteza rotunda este adaugat un parameter care va fi ulterior apelat cu scopul de a automatiza
		
		//la % este operator matematic din Java == il folosim ca sa folosim compararea a doua obiecte
		if(numar % 2 == 0 ) {
			//se executa doar daca conditia din if este adevarata
			System.out.println(numar + " este par!");
		} else {
			//se executa doar daca conditia din if este falsa
			System.out.println(numar + " este impar!");
		}
		
	}

}
