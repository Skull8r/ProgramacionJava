//VIDEO 100 Y 107(PARA AÑADIR IMÁGENES A LOS MENUS)
package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MarcoMenu {

	public static void main(String[] args) {
		
		MenuFrame miframe = new MenuFrame();
		
		miframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}


class MenuFrame extends JFrame{
	
	public MenuFrame() {
		
		setBounds(300, 300, 500, 450);
		
		MenuPanel mipanel = new MenuPanel();
		
		add(mipanel);
		
		setVisible(true);
	}
}

class MenuPanel extends JPanel{
	
	private JMenuBar mibarra;
	private JMenu archivo,editar,herramientas,opciones;
	
	private JMenuItem submenuopcion1;
	private JMenuItem submenuopcion2;
		
	public MenuPanel() {
		
		mibarra = new JMenuBar();
		
		archivo = new JMenu("Archivo");
		editar = new JMenu("Editar");
		herramientas = new JMenu("Herramientas");
		
		opciones = new JMenu("Opciones");
		
		submenuopcion1 = new JMenuItem("Opcion1");
		submenuopcion2 = new JMenuItem("Opcion2");
		
		MenuConstructor(archivo,"Guardar","");
		MenuConstructor(archivo,"Guardar como...","");
		
		MenuConstructor(editar, "Copiar","bin/graficos/copiar.gif");
		MenuConstructor(editar, "Pegar", "bin/graficos/pegar.gif");
		MenuConstructor(editar, "Cortar", "bin/graficos/cortar.gif");
		
		MenuConstructor(herramientas, "Especial","");
		MenuConstructor(herramientas, "Configuración", "");
		
		SubMenuConstructor(submenuopcion1, "Opcion1");
		SubMenuConstructor(submenuopcion2, "Opcion2");
		
		submenuopcion1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Opcion 1 pulsada..");
				
			}
		});
		
		
		opciones.add(submenuopcion1);
		opciones.add(submenuopcion2);
		
		editar.add(opciones);
		
		add(mibarra);
		
	}
	
	
	
	private void MenuConstructor(JMenu menu,String name,String file_icon) {
				
		JMenuItem subitem = new JMenuItem(name, new ImageIcon(file_icon));
		
		subitem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
						
				System.out.println("Has pulsado... " + subitem.getText());
				
			}
		});
		
		
		menu.add(subitem);		
		
		mibarra.add(menu);
		
	}
	
	public void SubMenuConstructor(JMenuItem menuitem, String name) {
		
		JMenuItem subitem = new JMenuItem(name);
		
		subitem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Has pulsado... " + subitem.getText());
				
			}
		});
				
	}
	
}

