//VIDEO 94
package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ejemplo_radio {

	public static void main(String[] args) {
		
		MarcoRadio mimarco = new MarcoRadio();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoRadio extends JFrame{
	
	public MarcoRadio() {
		
		
		setBounds(300, 300, 500, 400);
		
		LaminaRadio milamina = new LaminaRadio();
		add(milamina);
		
		setVisible(true);
		
	}	
}

class LaminaRadio extends JPanel{
	
	private JLabel texto;
	private JRadioButton boton1,boton2,boton3,boton4;
	private ButtonGroup migrupo;
	 JPanel laminabotones;
	
	public LaminaRadio() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de La Mancha de cuyo nombre...");
		
		texto.setFont(new Font("Serif",Font.PLAIN, 12));
		
		add(texto, BorderLayout.CENTER);
		
		laminabotones = new JPanel();
		migrupo = new ButtonGroup();
			
		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 12);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy grande", false, 24);
		
		add(laminabotones, BorderLayout.SOUTH);
		
		
		
	}
	
	/*ESTE MÉTODO COLOCA LOS BOTONES EN LA LÁMINA*/
	public void colocarBotones(String nombre, boolean seleccionado, final int tamagno) {
		
		JRadioButton boton = new JRadioButton(nombre,seleccionado);
		
		migrupo.add(boton);
		
		laminabotones.add(boton);
		
		ActionListener mievento = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
			}
		};
		
		boton.addActionListener(mievento);
	}
	
	private class EventoRadio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == boton1) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 10));
				
			} else if(e.getSource() == boton2) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 12));
				
			} else if(e.getSource() == boton3) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 18));
				
			} else if(e.getSource() == boton4) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 24));
				
			}
		}		
	}
}



