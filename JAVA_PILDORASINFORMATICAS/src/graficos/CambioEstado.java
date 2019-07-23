//VIDEO 70

package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

import java.awt.Event;


public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado miMarco = new MarcoEstado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		setVisible(true);
		setBounds(300,300,500,350);
		CambiaEstado nuevo_Estado = new CambiaEstado();
		
		addWindowStateListener(nuevo_Estado);
		
		
		
	}
}


class CambiaEstado implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent arg0) {
		System.out.println("La ventana ha cambiado de estado");
		
	}
	
}