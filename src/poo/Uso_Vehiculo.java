package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche1= new Coche();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580);
		
		mifurgoneta1.establece_color("azul");
		
		mifurgoneta1.establece_climatizador("si");
		
		mifurgoneta1.establece_asientos("si");
		
		System.out.println(mifurgoneta1.dime_datos_generales()+ "\n" + mifurgoneta1.dime_color()+" y "+ mifurgoneta1.dimeDatosFurgoneta());
	}

}
