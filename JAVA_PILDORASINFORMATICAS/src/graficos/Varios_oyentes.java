//VIDEO 80
package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Varios_oyentes {

	public static void main(String[] args) {
		
		MarcoPrincipal mimarco = new MarcoPrincipal();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);	

	}
}


class MarcoPrincipal extends JFrame{	
	
	public MarcoPrincipal() {
		
		setTitle("Prueba Varios");
		setBounds(150, 200, 350, 400);
		
		LaminaPrincipal milamina = new LaminaPrincipal();
		
		add(milamina);
				
	}	
}


class LaminaPrincipal extends JPanel{
	
	JButton botonCerrar;
	
	public LaminaPrincipal() {
		
		JButton botonNuevo = new JButton("Nuevo");
		add(botonNuevo);
				
		botonCerrar = new JButton("Cerrar todo");
		add(botonCerrar);
		
		OyenteNuevo mioyente = new OyenteNuevo();
		botonNuevo.addActionListener(mioyente);
				
	}
	
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			MarcoEmergente marco = new MarcoEmergente(botonCerrar);
			marco.setVisible(true);
			
		}
		
	}
	
} 

//CLASE PARA CREAR MARCOS EMERGENTES CON UN CONTADOR PARA CADA UNA
class MarcoEmergente extends JFrame{
	
	private static int num_ventana = 0;
	
	//ESTA CLASE RECIBE EL JBUTTON CERRAR POR PARAMETRO
	public MarcoEmergente(JButton boton_de_principal) {
		
		num_ventana++;
		setTitle("Ventana " + num_ventana);
		setBounds(40*num_ventana, 40*num_ventana, 300, 250); //Multiplicamos 40 x num_ventana para que aparezcan en posiciones distintas
		
		CierraTodos oyenteCerrar = new CierraTodos();
		boton_de_principal.addActionListener(oyenteCerrar);
		
	}
	
	//CLASE OYENTE PARA CERRAR TODAS LAS VENTANAS CREADAS
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			
		}
				
	}
	
}






