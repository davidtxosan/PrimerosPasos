import java.util.Scanner;


public class Entrada_con_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada_int= new Scanner(System.in);
		
		System.out.println("Introduce el primer numero a multiplicar");
		
		int primero=entrada_int.nextInt();
		
		System.out.println("Introduce el segundo numero a multiplicar");
		
		int segundo=entrada_int.nextInt();
		
		System.out.println("el resultado de multiplicar "+ primero +" y "+ segundo +" es "+ (primero*segundo));
		
		entrada_int.close();
	}

}
