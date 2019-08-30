//VIDEOS DEL 101 AL 106 || 110(ATAJOS DE TECLADO)
package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
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
		
		laminamenu.setBackground(Color.GRAY);
		
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
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem negritaE = new JMenuItem("Negrita", new ImageIcon("bin/graficos/copiar.gif"));
		JMenuItem cursivaE = new JMenuItem("Cursiva", new ImageIcon("bin/graficos/copiar.gif"));
		
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		
		
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
	
		emergente.add(negritaE);
		emergente.add(cursivaE);
		
		miarea.setComponentPopupMenu(emergente);
		
		JToolBar barra = new JToolBar();
		
		ImageIcon imagen1 = new ImageIcon();
		
		
		JButton negritabarra = new JButton(new ImageIcon("src/graficos/text_bold.png"));
		
		
		barra.add(negritabarra);
		
		add(barra, BorderLayout.WEST);
		
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
				
				//ATAJO DE TECLADO PARA PONER EN NEGRITA
				elemmenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				
			}else if(estilos == Font.ITALIC) {
			
				elemmenu.addActionListener(new StyledEditorKit.ItalicAction());
				//ATAJO DE TECLADO PARA PONER EN CURSIVA
				elemmenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
			}
			
		} else if(menu == "Tamaño"){
			
			size.add(elemmenu);
			
			elemmenu.addActionListener(new StyledEditorKit.FontSizeAction("Cambia tamaño", tam));
						
		}		
	}			
}
