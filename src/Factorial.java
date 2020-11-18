import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		//para tipos de resultados muy grandes hay que cambiar el tipo "int" a tipo"long" sino dara un numero raro
		long resultado=1L;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero:"));
		for (int i=numero;i>0;i--){
			
			resultado=resultado*i;
		}
		
		System.out.println("el factorial de "+ numero+ " es "+resultado);
	}
	
	

}
