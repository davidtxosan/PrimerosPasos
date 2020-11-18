
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="David Sanchez Jaramillo";
		
		System.out.println("Mi nombre es " + nombre);
		
		//el metodo length() al lado de la variable cuenta los caracteres de la variable
		
		System.out.println("Mi nombre tiene " + nombre.length()+ " letras.");
		
		//el metodo charAt con la posicion entre parentesis y al lado de la variable ,nos da
		//el caracter que está en esa posicion dentro de la cadena de caracteres de la variable.
		System.out.println("la primera letra de " + nombre + " es la " + nombre.charAt(0));
		
		//aqui utilizamos una forma para que nos de la ultima letra PERO DE CUALQUIER cadena de caracteres,no
		//solo la del ejemplo,por si cambia de longitud.Dentro del parentesis del metodo charAt donde hay que poner la posicion he
		//puesto el metodo length que mide la cantidad de caracteres menos uno,ya que empieza de 0,para elegir la ultima posicion de la 
		//cadena de caracteres.
		
		System.out.println("la ultima letra de " + nombre + " es la " + nombre.charAt(nombre.length()-1));

		
		
		
		



	}

}
