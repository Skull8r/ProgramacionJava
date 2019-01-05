package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		
		MarcoBotones mimarco = new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotones extends JFrame {
	
	public MarcoBotones() {
		
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones milamina = new LaminaBotones();
		add(milamina);	
	}
}

//DEBEMOS IMPLEMENTAR ACTIONLISTENER PARA QUE EL BOTON TENGA ACCIONES
class LaminaBotones extends JPanel {
	
	JButton boton = new JButton("Azul");
	JButton boton2 = new JButton("Rojo");
	JButton boton3 = new JButton("Verde");
		
	public LaminaBotones() {

		add(boton);
		add(boton2);
		add(boton3);
		
		ColorFondo verde = new ColorFondo(Color.green);
		ColorFondo azul = new ColorFondo(Color.blue);
		ColorFondo rojo = new ColorFondo(Color.red);
		
		//LA PROPIA LAMINA RECIBE EL ACTION LISTENER, POR ESO USAMOS THIS, EL METODO ES COMO TRADUCIR QUE SUCEDE AL HACER CLICK.
		boton.addActionListener(azul);
		boton2.addActionListener(rojo);
		boton3.addActionListener(verde);
	}
	
	private class ColorFondo implements ActionListener{

		private Color colorFondo;
		
		public ColorFondo(Color c) {
			
			colorFondo = c;		
		}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			setBackground(colorFondo);
		}
	}
}
