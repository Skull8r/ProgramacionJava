//VIDEO 109

package graficos;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class MarcoMEmergente {

	public static void main(String[] args) {
		
		MarcoEmergenteM mimarcoemergente = new MarcoEmergenteM();
		
		mimarcoemergente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}	
	class MarcoEmergenteM extends JFrame{
		
		public MarcoEmergenteM() {
			
			setBounds(500,150,400,400);
			
			LaminaEmergente milamina = new LaminaEmergente();
			
			add(milamina);
			
			setVisible(true);
			
		}
		
	}
	
	
	class LaminaEmergente extends JPanel{
		
		public LaminaEmergente() {
			
			setLayout(new BorderLayout());
			
			JPanel laminamenu = new JPanel();
			JMenuBar mibarra = new JMenuBar();
			
			JMenu fuente = new JMenu("Fuente");
			JMenu estilo = new JMenu("Estilo");
			JMenu tamagno = new JMenu("Tamaño");
			
			mibarra.add(fuente);
			mibarra.add(estilo);
			mibarra.add(tamagno);
			
			laminamenu.add(mibarra);
			
			add(laminamenu, BorderLayout.NORTH);
			
			JTextPane miarea = new JTextPane();
			add(miarea, BorderLayout.CENTER);
			
			
			JPopupMenu emergente = new JPopupMenu();
			
			JMenuItem opcion1 = new JMenuItem("Opcion 1");
			JMenuItem opcion2 = new JMenuItem("Opcion 2");
			JMenuItem opcion3 = new JMenuItem("Opcion 3");
			JMenuItem opcion4 = new JMenuItem("Opcion 4");
						
			emergente.add(opcion1);
			emergente.add(opcion2);
			emergente.add(opcion3);
			emergente.add(opcion4);
			
			miarea.setComponentPopupMenu(emergente);
			
		}
	}


