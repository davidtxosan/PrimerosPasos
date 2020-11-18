 import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor ");
	
	String edad_usuario=JOptionPane.showInputDialog("Introduce la edad, por favor ");
	
	int edad_usuarioentero=Integer.parseInt(edad_usuario);
	
	edad_usuarioentero++;
	
	System.out.println("hola " + nombre_usuario + " tienes " + edad_usuario + " años y el año que viene tendrás " + (edad_usuarioentero) + " años ");
	

	}

	

}
