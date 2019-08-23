//VIDEO 88

package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Prueba {

	public static void main(String[] args) {
		
		MarcoPrueba mimarco = new MarcoPrueba();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPrueba extends JFrame{
	
	LaminaPrueba milamina = new LaminaPrueba();
	
	public MarcoPrueba() {
		
		setBounds(200,200,400,300);
		
		add(milamina);
		
		setVisible(true);
		
	}
}

class LaminaPrueba extends JPanel{
	
	private JTextField micampo;
	
	public LaminaPrueba() {
		
		micampo = new JTextField(20);
		add(micampo);
		EscuchaTexto el_evento = new EscuchaTexto();
		
		Document midoc = micampo.getDocument();
		
		midoc.addDocumentListener(el_evento);
		
		
		
	}
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Has insertado texto");
			
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Has borrado texto");
		}
				
	}
	
}