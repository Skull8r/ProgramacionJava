//VIDEO 118 (DISPOSICIONES LIBRES)
package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LibreDisposicion {

	public static void main(String[] args) {
		
		
		MarcoLibre mimarco = new MarcoLibre();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoLibre extends JFrame{
	
	public MarcoLibre() {
		
		setBounds(400, 200, 400, 400);
		
		LaminaLibre milamina = new LaminaLibre();
		
		add(milamina);
		
		setVisible(true);
		
		
	}
	
}

class LaminaLibre extends JPanel{
	
	public LaminaLibre() {
		
		setLayout(null);
		
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");

		JTextField c_nombre = new JTextField(10);
		
		JTextField c_apellido = new JTextField(10);
		
		nombre.setBounds(20, 25, 80, 10);
		c_nombre.setBounds(100, 20, 100, 20);
		
		apellido.setBounds(20, 60, 80, 10);
		c_apellido.setBounds(100, 55, 100, 20);
		
		add(nombre);
		add(apellido);
		add(c_nombre);
		add(c_apellido);
	}
	
}



