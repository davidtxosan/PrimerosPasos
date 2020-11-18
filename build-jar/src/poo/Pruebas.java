package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1= new Empleados("Paco");

		Empleados trabajador2= new Empleados("Ana");
		
		Empleados trabajador3= new Empleados("Antonio");
		
		Empleados trabajador4= new Empleados("María");
		
		trabajador1.cambiaSeccion("RRHH");

		
		
		System.out.println(trabajador1.devuelvedatos()+ "\n" + trabajador2.devuelvedatos()+ "\n" + 
		trabajador3.devuelvedatos()+ "\n" + trabajador4.devuelvedatos());
		
		System.out.println(Empleados.dameIdSiguiente());
		

		
	}

}

class Empleados{
	
	
	public Empleados(String nom){
		
		nombre=nom;
		
		seccion="Administración";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
			
	}
	
	public void cambiaSeccion(String seccion){//SETTER
		
		this.seccion=seccion;
		
	}
	

	public String devuelvedatos(){//GETTER
		
		return "El nombre es: " + nombre + " y la sección es: " + seccion + " y el Id es: " + Id;
		
	}
	
	public static String dameIdSiguiente(){
		
		return "El IdSiguiente es: " + IdSiguiente;
	}
	
	
	
	private final String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=1;
	
}
