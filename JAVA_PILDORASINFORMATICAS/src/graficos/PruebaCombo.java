//VIDEO 95
package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaCombo {

	public static void main(String[] args) {
		
		MarcoCombo mimarco = new MarcoCombo();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}


class MarcoCombo extends JFrame{
	
	public MarcoCombo() {
	
		setBounds(300, 300, 500, 500);
		
		LaminaCombo milamina = new LaminaCombo();
		add(milamina);
		setVisible(true);
	}
}

class LaminaCombo extends JPanel{
	
	private JLabel texto;
	private JComboBox micombo;
	
	
	public LaminaCombo() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		
		texto.setFont(new Font("Serif",Font.PLAIN,14));
		
		add(texto, BorderLayout.CENTER);
		
		JPanel laminanorte = new JPanel();
		
		EventoCombo mievento = new EventoCombo();
		
		micombo = new JComboBox();
		
		micombo.setEditable(true);
		
		micombo.addItem("Serif");
		
		micombo.addItem("SansSerif");
		
		micombo.addItem("Monospaced");
		
		micombo.addItem("Dialog");
		
		laminanorte.add(micombo);
		
		micombo.addActionListener(mievento);
			
		add(laminanorte,BorderLayout.NORTH);
	}
	
	
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN, 18));
		}
		
	}
}





