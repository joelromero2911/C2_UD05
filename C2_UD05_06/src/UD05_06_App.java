import java.util.Scanner;

public class UD05_06_App {

	public static void main(String[] args) {
		
//		6) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
//		calcule el precio final con IVA. El IVA sera una constante que sera del 21%

//		Variables
		final float IVA = 21; // 21%
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Introduce el precio de un producto: ");
		
		String precioStr = sc.nextLine();
		sc.close();
		
		float precio = Float.parseFloat(precioStr);
		
		System.out.println("Precio final con IVA: " + (precio+(precio*(IVA/100))) + " eur.");
	}

}
