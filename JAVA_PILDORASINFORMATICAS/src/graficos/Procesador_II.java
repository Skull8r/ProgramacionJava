//VIDEOS DEL 101 AL 106
package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class Procesador_II {

	public static void main(String[] args) {
		
		MenuProcesador mimarco = new MenuProcesador();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MenuProcesador extends JFrame{
	
	public MenuProcesador() {
		
		setBounds(300, 200, 500, 400);
		LaminaProcesador milamina = new LaminaProcesador();
		
		add(milamina);
		
		setVisible(true);
		
	}
}



class LaminaProcesador extends JPanel{
	
	private JMenuBar mibarra;
	
	private JMenu fuente,estilo,size;
	
	private JTextPane miarea;
	
	Font letras;
	
	public LaminaProcesador() {
		
		setLayout(new BorderLayout());
			
		JPanel laminamenu = new JPanel();
		
		mibarra = new JMenuBar();
		
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		size = new JMenu("Tamaño");
		
		configuraMenu("Arial", "Fuente", "Arial", 9, 0,"");
		configuraMenu("Courier", "Fuente", "Courier", 9, 0,"");
		configuraMenu("Verdana", "Fuente", "Verdana", 9, 0,"");
		
		configuraMenu("Negrita", "Estilo", "", Font.BOLD, 1, "bin/graficos/copiar.gif");
		configuraMenu("Cursiva", "Estilo", "", Font.ITALIC, 1, "bin/graficos/pegar.gif");
		
		configuraMenu("12", "Tamaño", "", 9, 12, "");
		configuraMenu("16", "Tamaño", "", 9, 16, "");
		configuraMenu("20", "Tamaño", "", 9, 20, "");
		configuraMenu("24", "Tamaño", "", 9, 24, "");

			
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(size);
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
		miarea = new JTextPane();
		add(miarea,BorderLayout.CENTER);
		
	}
	
	
	public void configuraMenu(String rotulo, String menu, String tipoletra, int estilos, int tam, String file_name) {
		
		JMenuItem elemmenu = new JMenuItem(rotulo, new ImageIcon(file_name));
		
		if(menu == "Fuente") {
			
			fuente.add(elemmenu);
			
			if(tipoletra == "Arial") {
			
				elemmenu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia letra", "Arial"));
			
			} else if (tipoletra == "Courier") {
				
				elemmenu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia letra", "Courier"));
				
			} else if (tipoletra == "Verdana") {
				
				elemmenu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambia letra", "Verdana"));
			}
			
		} else if(menu == "Estilo") {
			
			estilo.add(elemmenu);
			
			if(estilos == Font.BOLD) {
				
				elemmenu.addActionListener(new StyledEditorKit.BoldAction());
				
			}else if(estilos == Font.ITALIC) {
			
				elemmenu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
		} else if(menu == "Tamaño"){
			
			size.add(elemmenu);
			
			elemmenu.addActionListener(new StyledEditorKit.FontSizeAction("Cambia tamaño", tam));
						
		}
		
	}
			
}




