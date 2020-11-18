

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//bucle for
		/*for(int i=0;i<3;i++){
			
			System.out.println("nombre: " + empleados[i].dameNombre() + 
					"Sueldo: " + empleados[i].dameSueldo() + " Fecha de alta: " + empleados[i].dameFechaContrato());
		}*/
		
		/*Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		Empleado empleado2=new Empleado("Ana López", 95000, 1995, 06, 02);
		
		Empleado empleado3=new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre :" + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
				+ " fecha de alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre :" + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
				+ " fecha de alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre :" + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
				+ " fecha de alta: " + empleado3.dameFechaContrato());*/
		
		
		
		Empleado[] empleados=new Empleado[3];
		
		empleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		empleados[1]=new Empleado("Ana López", 95000, 1995, 06, 02);
		empleados[2]=new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		/*for(int i=0;i<3;i++){
			
			empleados[i].subeSueldo(5);		
			
		}*/
		//bucle for each
		
		for(Empleado e: empleados){
			
			e.subeSueldo(5);	
			
		}
		//bucle for each
		for(Empleado e: empleados){
			
			System.out.println("nombre: " + e.dameNombre() + 
					"Sueldo: " + e.dameSueldo() + " Fecha de alta: " + e.dameFechaContrato());
			
			
		}
		

	}

}

class Empleado{
	
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);//creamos un objeto de tipo GregorianCalendar
		
		altaContrato=calendario.getTime();/*en una variable de tipo Date almacenamos lo que nos de el metodo getTime.
		Este metodo pertenece a la clase GregorianCalendar*/
		
		
	}
	
	public String dameNombre(){//METODO GETTER
		
		return  nombre;
	}
	
	public  double dameSueldo(){//GETTER
		
		return sueldo;
	}
	
	public Date dameFechaContrato(){//GETTER
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje){//SETTER
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;//Es igual a poner sueldo=sueldo+aumento
	}
	
	//declaramos las variables de clase al final de la clase,aunque se pueden poner al principio tambien
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
}
