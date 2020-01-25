package practicas;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Lamina_Botones extends JPanel{
	
	ButtonGroup grupo;
	
	
	private static final long serialVersionUID = 1L;

	//CONSTRUCTOR QUE PIDE TITULO Y OPCIONES AL CONSTRUIR UN OBJETO DE ESTA CLASE 
	public Lamina_Botones(String titulo, String [] opciones) {
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		grupo=new ButtonGroup();
		
		
		//BUCLE QUE CREA LOS BOTONES EN CADA LAMINA
		for(int i=0; i < opciones.length; i++) {
			
			JRadioButton bot = new JRadioButton(opciones[i]);  
			
			//ESTABLECEMOS UN ACTIONCOMMAND A CADA BOTON
			bot.setActionCommand(opciones[i]);
			
			add(bot);
			
			grupo.add(bot);
			
			bot.setSelected(i==0);
		}
			
	}
	
	
	//ESTE METODO DEVUELVE QUE LAMINA SE HA SELECCIONADO AL LLAMARLO
	public String dameSeleccion(){
		
//		//ALMACENAMOS EN VARIABLE TIPO BUTTONMODEL EL BOTON SELECCIONADO EN LA INTERFAZ
//		ButtonModel miboton = grupo.getSelection();
//		
//		//ALMACENAMOS EN VARIABLE S EL STRING DEL BOTÓN SELECCIONADO
//		String s = miboton.getActionCommand();
		
		
		//LO MISMO PERO EN UNA ÚNICA LÍNEA
		return grupo.getSelection().getActionCommand();
		
	}

}
