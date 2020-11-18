import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos la variable entrada con el metodo contructor especial de scanner diciendo que la entrada
		//de datos se va a producir a traves de la consola(system.in)
		
		Scanner entradas=new Scanner(System.in);
		
		//mensaje de consola
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entradas.nextInt();
		
		if(edad<18){
			
			System.out.println("Eres un adolescente ");
		}
		
		else if(edad<40){
			
			System.out.println("Eres joven ");
		}
		else if(edad<65){
			
			System.out.println("Eres maduro ");
		}
		else {
			
			System.out.println("cuidate ");
		}
		//si no pongo esto ultimo me da advertencia de que la variable "entradas" nunca se cierra
		entradas.close();
		}
		
	
}


