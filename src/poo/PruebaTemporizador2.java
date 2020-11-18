package poo;
import javax.swing.*;

import java.awt.event.*;
import java.util.*;

import javax.swing.Timer;

import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj=new Reloj();
		
		mireloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "pulsa aceptar para terminar");
		
		System.exit(0);

	}

}

class Reloj{
	

	public void enMarcha(int intervalo, final boolean sonido){
		
		class DameLaHora2 implements ActionListener{//clase interna local
			
			
			public void actionPerformed(ActionEvent evento){
				
				Date ahora=new Date();
				System.out.println("te pongo la hora cada 3 seg " + ahora);
				
				if (sonido){
					
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente=new DameLaHora2();
		
		Timer miTemporizador=new Timer(intervalo, oyente);
		
		miTemporizador.start();
	}

}
