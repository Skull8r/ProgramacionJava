package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		

	}

}


class MarcoAccion extends JFrame{
	
	
	public MarcoAccion(){
		setTitle("Prueba");
		setBounds(300,600,400,400);
		PanelAccion lamina = new PanelAccion();
		add(lamina);
		
	}
}

class PanelAccion extends JPanel{
	
	public PanelAccion() {
		
		
	}
	
	
	
	
}