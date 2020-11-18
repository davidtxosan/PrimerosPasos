import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primero crear un objeto de tipo scanner que cogera los valores qeu se introducen en la consola
	Scanner entrada=new Scanner(System.in);
	
	//creamos el menú que nos sale por consola apra elegir una opcion
	
	System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo ");
	
	//creamos una variable llamada "figura" que contiene el valor elegido en el menú por el usuario
	
	int figura=entrada.nextInt();
	
	 // creamos el condicional switch para elegir que hará el programa según el numero elegido en el menú
	
	switch(figura){
	
	//si el usuario ha elegido el numero 1,la variable "figura" valdrá 1 y entrará en case 1
	
	case 1:
		
		// se crea una variable llamada "lado" cuyo valor almacena lo que se meta el usuario en la ventana emergente
		
		int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
		
		//se muestra por pantalla un mensaje y se calcula con esta formula el area del cuadrado
		
		System.out.println("el área del cuadrado es: "+ Math.pow(lado, 2));
		
		//se pone break para finalizar el case
		
		break;
		//aqui entraria si el valor de la variable "figura" vale 2:
	case 2:
		
		int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
		
		System.out.println("el área del Rectángulo es: "+ base*altura);
		
		break;
		
		//aqui entraria si el valor de la variable "figura" vale 3:
		
	case 3:
		
		 base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
		 altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
		
		System.out.println("El area del triangulo es: "+ (base*altura)/2);
		
		break;
		
		//aqui entraria si el valor de la variable "figura" vale 4:
		
	case 4:
		
		int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce la radio"));
		
	
		System.out.print("el área del círculo es: ");
		System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)));
		
		
		break;
		
		//aqui entraria si el valor de la variable "figura" no es ninguno de los valores anteriores:
		
	default:
		
		System.out.println("La opción no es correcta ");
		
		break;
		
		
	}
	//si no pongo esto ultimo me da advertencia de que la variable "entrada" nunca se cierra

	entrada.close();
}
}
