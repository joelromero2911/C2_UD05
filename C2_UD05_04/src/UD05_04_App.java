import java.util.Scanner;

public class UD05_04_App {

	public static void main(String[] args) {
		
//		4) Haz una aplicación que calcule el área de un circulo (pi*R²). El radio se pedirá por teclado
//		(recuerda pasar de String a double con Double.parseDouble).Usa la constante PI y el
//		método pow de Math.
		
//		Variables
		final double PI = Math.PI;
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Introduce el radio de circulo: ");
		
		String radioStr = sc.nextLine();
		sc.close();
		
		Double radio = Double.parseDouble(radioStr);
		
		System.out.println("Area: " + (PI*Math.pow(radio, 2)));

	}

}
