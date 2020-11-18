import java.util.*;


public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos una variable con el metodo Math.random,que será de tipo decimal,
		//lo multiplicamos por 100 para que este conprendido entre 0 y 100 
		//y lo convertimos a tipo entero para quitarle los decimales.
		
		int aleatorio=(int)(Math.random()*100);
		//ocultamos el System.out.println(Math.random()*100; para que no se vea el numero aleatorio
		
		//creamos una variable de tipo scanner que recogerá lo que pongamos por consola
		
		Scanner entrada=new Scanner(System.in);
		
		//creamos una variable de tipo entero y con valor 0
	
		int numero=0;
		
		//creamos la variable intentos con valor 0
		
		int intentos=0;
		
		// creamos un bucle while que tiene como condicion inicial que la variable
		//numero(que es 0) y la variable aleatorio(que no sabemos cual es)sean
		//distintos para entrar en el bucle
		
		while (numero!=aleatorio){
			
			//incrementamos al variable intentos en 1 cada vez que se realiza el bucle
			
			intentos++;
			//pantalla en consola que nos pide un numero
			
			System.out.println("introduzca un numero");
			
			//guarda ese numero en la variable numero(su valor ya no seria 0)
			
			numero=entrada.nextInt();
			
			//ahora ponemos varias condiciones,segun el valor del numero inctroducido
			//pondra un mensaje por consola u otro
			
			if (aleatorio<numero){
				
				System.out.println("el numero es mas pequeño");
				
			}
			else if (aleatorio>numero){
				
				System.out.println("el numero es mayor");
			}
			
		}
		//cuando el numero guardado en la variable "numero" sea igual al de la variable "aleatorio"
		//la condicion del bucle no se cumplirá y se saldra de el,saliendo por pantalla el siguiente mensaje
		
			System.out.println("el numero es correcto.Lo has conseguido en "+intentos +" intentos.");
			
		entrada.close();	

	}

}
