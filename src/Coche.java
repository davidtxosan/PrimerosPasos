

public class Coche {//CLASE COCHE
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	private String color;
	private int peso_total;
	boolean asientos_cuero,climatizador;
	
	public Coche(){//METODO CONSTRUCTOR para establecer valores iniciales.
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
					
	}
	public String dime_datos_generales(){//METODO GETTER
		
		return "La plataforma del vehiculo tiene: " + ruedas + " ruedas. " + "Mide " + largo/1000 +
				" metros con un ancho de " + ancho + "cm y un peso de plataforma de " + peso_plataforma + " kg.";		
	}
	public String dime_color(){//METODO GETTER
	
		return "El color del coche es: " + color;
	}

	public void establece_color(String color_coche){//METODO SETTER
	
		color=color_coche;
		
	}
	public void establece_asientos(String asientos_cuero){//METODO SETTER
		
		if(asientos_cuero.equalsIgnoreCase("si")){
			
			this.asientos_cuero=true;
		}else{
			
			this.asientos_cuero=false;
		}	
	}
	
	public String dime_asientos(){//METODO GETTER
		
		if(asientos_cuero==true){
			
			return"El coche tiene asientos de cuero";
		}else{
			
			return"el coche tiene asientos de serie";
		}
	}
	
	public void establece_climatizador(String climatizador){//METODO SETTER
		
		if(climatizador.equalsIgnoreCase("si")){
			
			this.climatizador=true;
		}else{
			
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador(){//METODO GETTER
		
		if(climatizador==true){
			
			return "el coche lleva climatizador";
	}else{
		return "el coche lleva aire acondicionado";
	}
	}
	
	public String dime_peso_coche(){//METODO SETTER Y GETTER
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true){
			
			peso_total=peso_total+50;
		}
		if(climatizador==true){
			
			peso_total=peso_total+20;
		}
		return "el peso del coche es " + peso_total;
	}
	
	public int dime_precio(){//METODO GETTER
		
		int precio_final=10000;
		
		if(asientos_cuero==true){
			
			precio_final+=2000;
		}
		if(climatizador==true){
			
			precio_final+=1500;
		}
		return  precio_final;
		
	}
}
