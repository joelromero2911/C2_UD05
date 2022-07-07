
public class UD05_01_App {

	public static void main(String[] args) {
		
//		1) Declara 2 variables numéricas(con el valor que desees),e indica cual es mayor de los
//		dos. Si son iguales indicalo también. Ves cambiando los valores para comprobar que
//		funciona.
		
//		Variables
		int num1 = 10;
		int num2 = 5;
		
//		Programa
		if(num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		}
		
		num2 = 11;
		if(num1 < num2) {
			System.out.println(num1 + " es menor que " + num2);
		}
		
		num2 = num1;
		if(num1 == num2) {
			System.out.println(num1 + " es igual que " + num2);
		}

	}

}
