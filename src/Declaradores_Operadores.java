
public class Declaradores_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//se puede declarar e incluso inicializar variables todas seguidas
		//int operador1=8,operador2=7,resultado=operador1+operador2;
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println(c);
		
	
	
		 
		final double apulgadas=2.54;
		 double cm=4;
		 double resultado=cm/apulgadas;
		 System.out.println(" en " + cm + " cm hay " +resultado + " pulgadas ");
		 
		 //voy a aplicarle formato al resultado para que solo me de 2 decimales al final 
		 
		 System.out.print(" en " + cm + " cm hay ");
		 System.out.printf("%1.2f", resultado);
		 

	}

}	
