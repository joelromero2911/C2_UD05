import java.util.Scanner;

public class UD05_12_App {

	public static void main(String[] args) {
		
//		12) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
//		se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas
//		la contraseña y mostrara un mensaje diciendo "Enhorabuena". Piensa bien en la condición
//		de salida (3 intentos y si acierta sale, aunque le queden intentos).
		
//		Variables
		Scanner sc = new Scanner(System.in);
		final String CONTRASENA = "1234";
		int intentos = 3;
		
//		Programa
		while(intentos > 0) {
			System.out.print("Introduce la contrasena (Te quedan " + intentos + " intentos): ");
			String intentoContrasena = sc.nextLine();
//			System.out.println(intentoContrasena + "\n" + CONTRASENA);
			if(intentoContrasena.equals(CONTRASENA)) {
				System.out.println("Enhorabuena");
				break;
			}
			intentos--;
			if(intentos <= 0) {
				System.out.println("Te has quedado sin intentos.");
			}
			
		}
		sc.close();

	}

}
