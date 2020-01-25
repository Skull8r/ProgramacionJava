//VIDEO 115 (Disposiciones avanzadas I Spring)

package graficos;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PruebaDisposiciones {

	public static void main(String[] args) {
		
		MarcoCaja mimarco = new MarcoCaja();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}


class MarcoCaja extends JFrame{
	
	JLabel rotulo1 = new JLabel("Nombre");
	JTextField texto1 = new JTextField(10);
	
	Box cajaH1 = Box.createHorizontalBox();
	Box cajaH2 = Box.createHorizontalBox();
	Box cajaH3 = Box.createHorizontalBox();
	
	Box cajaVertical = Box.createVerticalBox();
	
	JLabel rotulo2 = new JLabel("Contraseña");
	JTextField texto2 = new JTextField(10);
	
	JButton boton1 = new JButton("Ok");
	JButton boton2 = new JButton("Cancelar");
	
	
	public MarcoCaja() {
		
		setTitle("Marco en la caja");
		setBounds(600, 150, 250, 250);
			
		
		texto1.setMaximumSize(texto1.getPreferredSize());
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		cajaH1.add(rotulo1);
		cajaH1.add(Box.createHorizontalStrut(10));
		cajaH1.add(texto1);
		
		cajaH2.add(rotulo2);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(texto2);
		
		cajaH3.add(boton1);
		cajaH3.add(Box.createGlue());
		cajaH3.add(boton2);
		
		cajaVertical.add(cajaH1);
		cajaVertical.add(cajaH2);
		cajaVertical.add(cajaH3);
		
		add(cajaVertical, BorderLayout.CENTER);
		
	}
	
	
}
