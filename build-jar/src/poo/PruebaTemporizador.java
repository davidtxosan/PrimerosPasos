package poo;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;


public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente= new DameLaHora();
		
		//ActionListener oyente= new DameLaHora();
		
		Timer mitemporizador= new Timer(5000, oyente );//constructor de la clase Timer.Oyente es una instancia de la clase DameLaHora.
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0);

	}

}

class DameLaHora implements ActionListener{//creacion de clase DameLaHora que implementa la interfaz ActionListener
	
	public void actionPerformed(ActionEvent e){
		
		Date ahora=new Date();
		
		System.out.println("te pongo la hora cada 5 seg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();;
	}

}