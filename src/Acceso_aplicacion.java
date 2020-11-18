import javax.swing.JOptionPane;


public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos una variable llamada clave de tipo String con el valor David
		
		String clave="David";
		
		//creamos otra variable String con un valor vacio
		
		String pass="";
		
		/*creamos el bucle while con una condicion que de cumplirse entraria dentro 
		del bucle.
		
		Si la variable clave y la variable pass no son iguales..*/
	
		
		while (clave.equals(pass)!=true){
			
			//entonces sale una ventana emergente pidiendonos la contraseña
			
			pass=JOptionPane.showInputDialog("Introduzca su contraseña");
			
			//si de nuevo la variable clave no es igual ala variable pass que introducimos
			
			if (clave.equals(pass)!=true){
				
				//entonces nos sale un mensaje de contraseña incorrecta
				
				System.out.println("Contraseña incorrecta.");
				
			}
			
			//se sigue ejecutando el bucle hasta que la la variable clave y la variable 
			//pass sean iguales,con lo que la condicion del bucle while se deja de cumplir y 
			//saldriamos del bucle,saliendonos el mensaje que está fuera del bucle.
		}
		System.out.println("acceso permitido");

	}

}
