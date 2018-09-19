package basics;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente = new DameLaHora();
		
		Timer mitemporizador = new Timer(100, oyente);
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		System.exit(0);
		
		

	}

}



class DameLaHora implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Date ahora = new Date();
		
		System.out.println("Te pongo la hora cada 5 seg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
		
	}
	
}
