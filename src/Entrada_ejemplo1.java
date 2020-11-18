import java.util.*;


public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lo siguiente es para que no me diga que entrada sigue abierto y tener que poner al final
		//entrada(close);
		
		@SuppressWarnings("resource")
		
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.println("Introduce la base y la altura separadas por espacio");
		
		double base=entrada.nextDouble();
		double altura=entrada.nextDouble();
		System.out.println("el area es:"+ base*altura);
		
		
		
	
	}

}
