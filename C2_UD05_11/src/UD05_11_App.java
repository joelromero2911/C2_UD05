import java.util.Scanner;
import java.util.Scanner;

public class UD05_11_App {

	public static void main(String[] args) {
		
//		11) Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral
//		o no. Usa un switch para ello.
		
//		Variables
		Scanner sc = new Scanner(System.in);
		
//		Programa
		System.out.print("Introduce un dia de la semana: ");
		String dia = sc.nextLine();
		sc.close();
		
		dia = dia.toLowerCase();
		switch(dia){
		    case"lunes":
		        System.out.println(dia + " es una dia laboral.");
		        break;
		    case"martes":
		        System.out.println(dia + " es una dia laboral.");
		        break;
		    case"miercoles":
		        System.out.println(dia + " es una dia laboral.");
		        break;
		    case"jueves":
		        System.out.println(dia + " es una dia laboral.");
		        break;
		    case"viernes":
		        System.out.println(dia + " es una dia laboral.");
		        break;
		    case"sabado":
		        System.out.println(dia + " NO es una dia laboral.");
		        break;
		    case"domingo":
		        System.out.println(dia + " NO es una dia laboral.");
		        break;
		    default:
		        System.out.println("No has introducido un dia correcto");
		}

	}

}
