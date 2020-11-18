import java.util.*;

import javax.swing.JOptionPane;


public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige una opción,por favor : \n1:suma \n2:resta \n3:multiplicación \n4:división");
		
		int calculadora=entrada.nextInt();
		
		switch (calculadora){
		
		case 1:
			
			int numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
			int numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
			System.out.println("El resultado es :"+ (numero1+numero2));
			
			break;
			
		case 2:
			
			numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
			numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
			System.out.println("El resultado es :"+ (numero1-numero2));
			
			break;
			
		case 3:
			
			numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
			numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
			System.out.println("El resultado es :"+ (numero1*numero2));
			break;
			
		case 4:
			
			numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
			numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
			System.out.println("El resultado es :"+ (numero1/numero2));
			
			break;
			
		default:
			
			System.out.println("la opcion no es correcta, vuelva a intentarlo ");
			
			break;			
		}
		//si no pongo esto ultimo me da advertencia de que la variable "entrada" nunca se cierra

		entrada.close();
	}
}
