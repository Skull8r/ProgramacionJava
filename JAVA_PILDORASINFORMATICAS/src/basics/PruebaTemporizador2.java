package basics;

import javax.swing.*;
import java.awt.Event;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PruebaTemporizador2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj = new Reloj(3000, true);
		
		mireloj.enMarcha();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		System.exit(0);
		
	}

}

class Reloj {
	
	private int intervalo;
	private boolean sonido;
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		this.sonido=sonido;
			
	}
	
	public void enMarcha() {
		
		ActionListener oyente = new DameLaHora2();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}
	
	
	//CLASE INTERNA, PUEDE USAR EL CAMPO SONIDO A PESAR DE NO ESTAR DECLARADA EN ELLA MISMA
	private class DameLaHora2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 segundos. " + ahora);
			
			if(sonido) {
				Toolkit.getDefaultToolkit().beep();
			}		
		}		
	}
}
