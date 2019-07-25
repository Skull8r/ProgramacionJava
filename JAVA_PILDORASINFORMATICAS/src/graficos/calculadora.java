//VIDEO 83,84 y 85 CALCULADORA

package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora mimarco = new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}
}


class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		setBounds(600, 150, 350, 400);
		
		LaminaCalculadora milamina = new LaminaCalculadora();
		
		add(milamina);
				
	}		
}


class LaminaCalculadora extends JPanel{
	
	private JPanel milamina2 = new JPanel();
	private JButton pantalla = new JButton("0");
	private boolean principio;
	private double resultado;
	private String ultimaoperacion;
	
	public LaminaCalculadora() {
			
		setLayout(new BorderLayout());		
		
		principio = true;
		
		pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
		
		InsertaNumero insertar = new InsertaNumero();
		ActionListener orden = new AccionOrden();
				
			
		milamina2.setLayout(new GridLayout(4,4));
		
		String[] teclas = {"7","8","9","*","4","5","6","+","1","2","3","/","-","0","=","CL"};
		
		for(int i=0; i < teclas.length; i++) {
			
			if(teclas[i] == "*" || teclas[i] == "+" || teclas[i] == "-" || teclas[i] == "/" || teclas[i] == "=" || teclas[i] == "CL") {
				ponerBoton(teclas[i], orden);
			}else {
				ponerBoton(teclas[i],insertar);
			}
		}
		
		add(milamina2, BorderLayout.CENTER);
		ultimaoperacion = "=";
			
	}
	
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente);
		milamina2.add(boton);			
	}
		
	
	//CLASE OYENTE 
	private class InsertaNumero implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String entrada = e.getActionCommand();
			
			if(principio) {
				pantalla.setText(" ");
				principio = false;
			}
			
			if(entrada == "+" ||entrada == "-" ||entrada == "*" || entrada == "/" ||entrada == "=" || entrada == "CL") {			
				pantalla.setText(" ");
				
			}else {
				pantalla.setText(pantalla.getText()+entrada);
			}
			
		}
		
	}
	
	
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String operacion = e.getActionCommand();
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaoperacion = operacion;
			
			principio = true;			
		}

		public void calcular(double x) {
			
			if(ultimaoperacion.equals("+")) {
				
				resultado+=x;
								
			}else if(ultimaoperacion.equals("-")) {
				
				resultado-=x;
			
			}else if(ultimaoperacion.equals("*")) {
				
				resultado*=x;
				
			}else if(ultimaoperacion.equals("/")) {
				
				resultado/=x;
				
			}else if(ultimaoperacion.equals("CL")) {
				pantalla.setText(" LIMPIAR");
				
			}else if(ultimaoperacion.equals("=")) {
				
				resultado=x;
			}
			
			pantalla.setText("" + resultado);
			
		}
		
	}
	
}







