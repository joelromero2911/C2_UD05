import java.util.Scanner;
import javax.swing.JOptionPane;

public class UD05_13_App {

	public static void main(String[] args) {
		
//		13) Crea una aplicación llamada CalculadoraInversa, nos pedirá 2 operandos (int) y un signo
//		aritmético (String), según este último se realizara la operación correspondiente. Al final
//		mostrara el resultado en un cuadro de dialogo.
//		
//		Los signos aritméticos disponibles son:
//			+: suma los dos operandos.
//			-: resta los operandos.
//			*: multiplica los operandos.
//			/: divide los operandos, este debe dar un resultado con decimales (double)
//			^: 1º operando como base y 2º como exponente.
//			%: módulo, resto de la división entre operando1 y operando2.
		
//		Variables
		Scanner sc = new Scanner(System.in);
		float resultado = 0;
		
//		Programa
		System.out.print("Introduce un numero: ");
		String num1Str = sc.nextLine();
		int num1 = Integer.parseInt(num1Str);
		System.out.print("Introduce un segundo numero: ");
		String num2Str = sc.nextLine();
		int num2 = Integer.parseInt(num2Str);
		System.out.print("Introduce el signo de la operacion que quieres realizar: ");
		String signo = sc.nextLine();
		sc.close();
		
		switch(signo){
		    case"+":
		        resultado = num1+num2;
		        break;
		    case"-":
		    	resultado = num1-num2;
		        break;
		    case"*":
		    	resultado = num1*num2;
		        break;
		    case"/":
		    	resultado = num1/num2;
		        break;
		    case"^":
		    	resultado = num1^num2;
		        break;
		    case"%":
		    	resultado = num1%num2;
		        break;
		    default:
		        System.out.println("No has introducido un signo correcto");
		}
		
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

	}

}
