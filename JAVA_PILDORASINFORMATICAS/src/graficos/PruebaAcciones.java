//VIDEO 76 Y 77 || VIDEO 111

package graficos;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import java.awt.*;
import java.awt.event.ActionEvent;

public class PruebaAcciones {

	public static void main(String[] args) {
		
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
	}
}


class MarcoAccion extends JFrame {
	
	public MarcoAccion(){
		setTitle("Prueba Acciones");
		setBounds(150,200,600,400);
		PanelAccion lamina = new PanelAccion();
		add(lamina);
		
	}
}

class PanelAccion extends JPanel{
	
	
	public PanelAccion() {
			
		ImageIcon imagenIcono = new ImageIcon("src/graficos/icono_akita.jpg");
		Image imgEscalada = imagenIcono.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		
		Icon iconoEscalado = new ImageIcon(imgEscalada);
		
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", iconoEscalado, Color.yellow);
		AccionColor accionAzul = new AccionColor("Azul", iconoEscalado, Color.blue);
		AccionColor accionRojo = new AccionColor("Rojo", iconoEscalado, Color.red);
		
		JMenu menu = new JMenu("Color");
		
		menu.add(accionRojo);
		menu.add(accionAmarillo);
		menu.add(accionAzul);
		
		JMenuBar barramenu = new JMenuBar();
		
		barramenu.add(menu);
		
		add(barramenu);
		
		
		//CONSTRUCCION BARRA HERRAMIENTAS
		
		JToolBar barra = new JToolBar();
		
		barra.add(accionRojo);
		barra.add(accionAzul);
		barra.add(accionAmarillo);
		
		add(barra, BorderLayout.NORTH);
		
//		add(new JButton(accionAmarillo));
//		add(new JButton(accionAzul));
//		add(new JButton(accionRojo));
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//Esto es lo mismo abajo pero simplificado en una linea
		//KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		
		//Aquí se construye el objeto en la propia llamada put
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		ActionMap mapaAccion = getActionMap();
		
		
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);

	}
	
	
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color color_boton) {
			
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			putValue("color_de_fondo", color_boton);
						
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Color c = (Color)getValue("color_de_fondo");		
			setBackground(c);
			
			
			System.out.println("Nombre: " + getValue(Action.NAME));
			System.out.println("Descripción: " + getValue(Action.SHORT_DESCRIPTION));
			
		}		
			
	}
}





