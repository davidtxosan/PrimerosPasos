package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] empleados=new Empleado[6];
		
		empleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		empleados[1]=new Empleado("Ana López", 95000, 1995, 06, 02);
		
		empleados[2]=new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		empleados[3]=new Empleado("Antonio Fernandez", 47000, 2009, 11, 9);
		
		empleados[4]=jefe_RRHH;//Polimorfismo en accion.Principio de sustitución
		
		empleados[5]= new Jefatura("Maria",95000,1999,05,26);
		
		Jefatura jefa_Finanzas=(Jefatura)empleados[5];
		
		jefa_Finanzas.estableceIncentivo(55000);
		
		Empleado director_comercial=new Jefatura("Sandra", 85000, 2012, 05, 05);
		
		Comparable ejemplo=new Empleado("Elizabeth" ,95000, 2011,06,07);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		
		System.out.println("El jefe "+ jefa_Finanzas.dameNombre() + " tiene un bonus de " + jefa_Finanzas.establece_bonus(500));
		
		System.out.println(empleados[3].dameNombre()+ " tiene un bonus de: " + empleados[3].establece_bonus(200));
	
		for(Empleado e: empleados){
			
			e.subeSueldo(5);	
			
		}
		
			Arrays.sort(empleados);
			

		for(Empleado e: empleados){
			
			System.out.println("nombre: " + e.dameNombre() 
					+ " Sueldo: " + e.dameSueldo() 
					+ " Fecha de alta: " + e.dameFechaContrato());
	
		}
	
	}

}

class Empleado implements Comparable{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);//creamos un objeto de tipo GregorianCalendar
		
		altaContrato=calendario.getTime();/*en una variable de tipo Date almacenamos lo que nos de el metodo getTime.
		Este metodo pertenece a la clase GregorianCalendar*/
		
		++IdSiguiente;
		
		Id=IdSiguiente;
		
		
	}
	
	public double establece_bonus(double gratificacion){
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	public Empleado(String nom){
		
		this(nom, 30000, 2000, 01, 01);
	}
	
	
	public String dameNombre(){//METODO GETTER
		
		return  nombre + " Id: " + Id;
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
	
	public int compareTo(Object miObjeto){
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		if(this.Id<otroEmpleado.Id){
			
			return -1;
		}
		
		if(this.Id>otroEmpleado.Id){
			
			return 1;
		}
		return 0;
	};
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
	
}

class Jefatura extends Empleado implements Jefes{
	
	
	
	public Jefatura(String nom, double sue, int agno, int mes,int dia){
		
		super(nom,sue,agno,mes,dia);
	}
	
	public String tomar_decisiones(String decision){
		
		return "Un miembro de la dirección ha tomado la decicisón de : " + decision;
	}
	
	public double establece_bonus(double gratificacion){
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	public void estableceIncentivo(double b){
		
		incentivo=b;
	}
	
	public double dameSueldo(){//metodo setter que sobreescribe el de la clase Empleado
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	private double incentivo;
		
}
