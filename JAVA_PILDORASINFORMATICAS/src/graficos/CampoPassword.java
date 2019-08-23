//VIDEO 89

package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {

	public static void main(String[] args) {
		
		MarcoPassword mimarco = new MarcoPassword();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoPassword extends JFrame{
	
	private LaminaPassword milamina;
	
	public MarcoPassword() {
		
		milamina = new LaminaPassword();
		setBounds(150, 150, 400, 350);
		
		add(milamina);
		setVisible(true);
	}
}

class LaminaPassword extends JPanel{
	
	private JLabel etiqueta1, etiqueta2;
	private JTextField usuario;
	private JPasswordField pass;
	private JButton enviar;
	
	private CompruebaPass comprobador;
	
	public LaminaPassword() {
		
		setLayout(new BorderLayout());
		
		JPanel lamina_superior = new JPanel();
		
		lamina_superior.setLayout(new GridLayout(2, 2));
		
		add(lamina_superior, BorderLayout.NORTH);
		comprobador = new CompruebaPass();
		
		etiqueta1 = new JLabel("Usuario");
		etiqueta2 = new JLabel("Contraseña");
		
		usuario = new JTextField();
		
		pass = new JPasswordField();
		pass.getDocument().addDocumentListener(comprobador);
		
		enviar = new JButton("Enviar");
		
		lamina_superior.add(etiqueta1);
		lamina_superior.add(usuario);
		
		lamina_superior.add(etiqueta2);
		lamina_superior.add(pass);
		
		add(enviar,BorderLayout.SOUTH);
				
	}
	
	//CLASE QUE COMPRUEBA LO QUE SUCEDA EN LOS CAMPOS DE TEXTO
	private class CompruebaPass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		//AQUI COMPROBAMOS QUE EL PASSWORD TIENE MENOS DE 8 O MAS DE 12 CARACTERES
		@Override
		public void insertUpdate(DocumentEvent e) {
			char [] password;
			
			password = pass.getPassword();
			
			if (password.length < 8 || password.length > 12) {
				pass.setBackground(Color.red);
			}else {
				pass.setBackground(Color.green);
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}