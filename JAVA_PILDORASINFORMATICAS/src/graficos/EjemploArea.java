//VIDEO 90
package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EjemploArea {

	public static void main(String[] args) {
		
		MarcoArea mimarco = new MarcoArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoArea extends JFrame{
	
	public MarcoArea() {
		
		LaminaArea milamina = new LaminaArea();
		
		setBounds(200, 200, 400, 300);
		setVisible(true);
		
		add(milamina);
		
		
	}
}


class LaminaArea extends JPanel{
		
	private JTextArea miarea;
	
	public LaminaArea() {
		
		miarea = new JTextArea(8,20);
		JButton miboton = new JButton("Pulsar");
		
		miboton.addActionListener(new GestionaArea());
		
		//SCROLLPANE NOS PERMITE QUE LA LAMINA TENGA BARRA DE DESPLAZAMIENTO
		JScrollPane laminascroll = new  JScrollPane(miarea);
		
		miarea.setLineWrap(true);
		
		//AGREGAMOS AL ADD LA LÁMINA JSCROLLPANE
		add(laminascroll);
		add(miboton);
		
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(miarea.getText());
		}
		
	}

}