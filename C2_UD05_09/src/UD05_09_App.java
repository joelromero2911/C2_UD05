
public class UD05_09_App {

	public static void main(String[] args) {
		
//		9) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle
//		que desees.
		
//		Variables
		
//		Programa
		for(int cont = 1; cont <= 100; cont++) {
			if(cont%2 == 0 && cont%3 == 0) {
				System.out.println(cont);
			}
		}

	}

}
