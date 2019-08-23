//VIDEO 86 y 87

package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {
		
		MarcoTexto mimarco = new MarcoTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setBounds(150, 150, 600, 300);
		LaminaTexto milamina = new LaminaTexto();
		
		add(milamina);
		
		setVisible(true);
		
	}
		
}


class LaminaTexto extends JPanel {
	
	private JTextField campo1 = new JTextField(20);
	private JButton miboton = new JButton("Dale");
	private JLabel texto1 = new JLabel("Email: ");
	private JLabel resultado = new JLabel("", JLabel.CENTER);
		
	public LaminaTexto() {
		
		setLayout(new BorderLayout());
		
		JPanel milamina2 = new JPanel();
		
		milamina2.setLayout(new FlowLayout());
		
		add(texto1);
		milamina2.add(campo1);	
		add(resultado, BorderLayout.CENTER);
		//INSTANCIA PARA COMPROBAR CUANDO SE PULSA EL BOTON
		DameTexto mievento = new DameTexto();
		//AÑADIMOS LA INSTANCIA CON ADDACTIONLISTENER AL BOTON PARA PONERLO A LA ESCUCHA
		miboton.addActionListener(mievento);
		//AÑADIMOS EL BOTON A LA LÁMINA
		milamina2.add(miboton);
		
		add(milamina2, BorderLayout.NORTH);
		
		
	}
	
	//CLASE INTERNA QUE IMPEMENTA LA INTERFAZ ACTION LISTENER
	private class DameTexto implements ActionListener{	

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int correcto = 0;
			String email = campo1.getText().trim();
			
			for(int i=0; i<email.length(); i++) {
				
				if (email.charAt(i) == '@') {
					correcto++;
				}
			}
			
			if(correcto == 1) {
				resultado.setText("Correcto");
			}else {
				resultado.setText("Incorrecto");
			}

		}		
	}	
}



