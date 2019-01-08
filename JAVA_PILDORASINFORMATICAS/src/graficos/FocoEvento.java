package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoFoco mimarco = new MarcoFoco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoFoco extends JFrame{
		
	public MarcoFoco() {
		
		setVisible(true);
		setBounds(300, 300, 600, 450);
		add(new LaminaFoco());		
	}	
}

class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);
		
		JTextField cuadro1 = new JTextField();
		JTextField cuadro2 = new JTextField();
		
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		add(cuadro2);
		
		LanzaFoco elFoco = new LanzaFoco();
		cuadro1.addFocusListener(elFoco);
		
		LanzaFoco elFoco2 = new LanzaFoco();
		cuadro2.addFocusListener(elFoco2);
		
	}
	
	private class LanzaFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println("Has perdido el foco");
			
		}		
	}	
}

