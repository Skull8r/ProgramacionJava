//VIDEO 81

package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts {

	public static void main(String[] args) {
		
		MarcoLayout mimarco = new MarcoLayout();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}


class MarcoLayout extends JFrame{
	
	public MarcoLayout(){
		
		
		setTitle("Prueba Acciones");
		setBounds(300, 250, 350, 350);
		
		//HEOS CREADO DOS LÁMINAS, UNA IRÁ UBICADA EN EL NORTE DEL PANEL, Y LA OTRA EN EL SUR
		PanelLayout lamina = new PanelLayout();
		PanelLayout2 lamina2 = new PanelLayout2();
		
		
		add(lamina, BorderLayout.NORTH);
				
		add(lamina2, BorderLayout.SOUTH);
		
	}
	
}


//CLASE PARA CREAR UNA LÁMINA A LA QUE SE LE AÑADIRÁN DOS BOTONES
class PanelLayout extends JPanel{
	
	public PanelLayout() {
		
		//setLayout(new FlowLayout(FlowLayout.CENTER, 40, 30));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
		
	}
}


//CLASE PARA CREAR LA SEGUNDA LÁMINA CON UN TIPO DE LAYOUT DIFERENTE
class PanelLayout2 extends JPanel{
	
	public PanelLayout2() {
		
		setLayout(new BorderLayout());
		
		add(new JButton("Azul"),BorderLayout.WEST);
		add(new JButton("Verde"),BorderLayout.EAST);
		add(new JButton("Morado"),BorderLayout.CENTER);
		
	}
	
	
	
}