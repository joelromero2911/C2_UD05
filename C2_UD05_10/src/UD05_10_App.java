import java.util.Scanner;

public class UD05_10_App {

	public static void main(String[] args) {
		
//		10) Realiza una aplicación que nos pida un número de ventas a introducir, después nos
//		pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final
//		mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
		
//		Variables
		Scanner sc = new Scanner(System.in);
		int sumaTotal = 0;
		
//		Programa
		System.out.print("Introduce el numero de ventas: ");
		String ventasStr = sc.nextLine();
		int ventas = Integer.parseInt(ventasStr);
		
		for(int cont = 0; cont < ventas; cont++) {
			System.out.print("Introduce precio venta: ");
			String ventaStr = sc.nextLine();
			int venta = Integer.parseInt(ventaStr);
			sumaTotal += venta;
		}
		
		sc.close();
		
		System.out.println("La suma total es de: " + sumaTotal);

	}

}
