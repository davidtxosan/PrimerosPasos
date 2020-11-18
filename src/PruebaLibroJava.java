import java.lang.*;
public class PruebaLibroJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce tu edad, por favor");
		
		 String linea=System.console().readLine();
		 
		 int numero=Integer.parseInt(linea);
		 
		
		System.out.println("hola "+". El año que viene tendrás "+ (numero+1)+ " años.");

	}

}
