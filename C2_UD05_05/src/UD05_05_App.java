import java.util.Scanner;

public class UD05_05_App {

	public static void main(String[] args) {
		
//		5) Lee un número por teclado e indica si es divisible entre 2 (resto=0). Si no lo es, también
//		debemos indicarlo.
		
//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Introduce un numero: ");
		
		String numStr = sc.nextLine();
		sc.close();
		
		int num = Integer.parseInt(numStr);
		
		if(num%2 == 0) {
			System.out.println(num + " es divisible entre 2.");
		}else {
			System.out.println(num + " NO es divisible entre 2.");
		}

	}

}
