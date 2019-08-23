//VIDEO 93
package graficos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Sintaxis_radio {

	public static void main(String[] args) {
		
		MarcoRadioSintaxis mimarco = new MarcoRadioSintaxis();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}


class MarcoRadioSintaxis extends JFrame{
	
	public MarcoRadioSintaxis() {
		
		setVisible(true);
		setBounds(300, 300, 500, 400);	
			
		LaminaRadioSintaxis milamina = new LaminaRadioSintaxis();
		add(milamina);
			
	}
}

class LaminaRadioSintaxis extends JPanel{
	
	public LaminaRadioSintaxis() {
		
		ButtonGroup migrupo1 = new ButtonGroup();
		ButtonGroup migrupo2 = new ButtonGroup();
		
		JRadioButton boton1 = new JRadioButton("Azul",false);
		JRadioButton boton2 = new JRadioButton("Rojo",true);
		JRadioButton boton3 = new JRadioButton("Verde",false);
		JRadioButton boton4 = new JRadioButton("Masculino",false);
		JRadioButton boton5 = new JRadioButton("Femenino",false);
		
		migrupo1.add(boton1);
		migrupo1.add(boton2);
		migrupo1.add(boton3);
		
		migrupo2.add(boton4);
		migrupo2.add(boton5);
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
				
	}
}