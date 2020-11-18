
import javax.swing.*;
public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche= new Coche();//INSTANCIAR UNA CLASE.EJEMPLAR DE CLASE
		
		micoche.establece_color(JOptionPane.showInputDialog("introduce color"));
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.establece_asientos(JOptionPane.showInputDialog("¿tiene asientos de cuero?"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.establece_climatizador(JOptionPane.showInputDialog("¿tiene climatizador?"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es " + micoche.dime_precio());
		
	}

}
