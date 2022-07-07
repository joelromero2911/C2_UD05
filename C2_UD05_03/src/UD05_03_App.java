import javax.swing.JOptionPane;

public class UD05_03_App {

	public static void main(String[] args) {
		
//		3) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
//		(recuerda usar JOptionPane).
		
//		Variables
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
//		Programa
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);

	}

}
