//VIDEO 98 y 99
package graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class MarcoSpinner {

	public static void main(String[] args) {
		
		FrameSpinner miframe = new FrameSpinner();
		miframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class FrameSpinner extends JFrame{
	
	public FrameSpinner() {
		
		setBounds(300, 300, 500, 400);
		
		PanelSpinner panel = new PanelSpinner();
		
		setVisible(true);
		
		add(panel);
		
		
	}
}

class PanelSpinner extends JPanel{
	
	public PanelSpinner() {
		
		//String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1) {
						
			public Object getNextValue() {
				
				return super.getPreviousValue();
			}
			
			public Object getPreviousValue() {
				
				return super.getNextValue();
			}
			
		});
		
		Dimension dimension = new Dimension(200, 20);
		
		control.setPreferredSize(dimension);
		
		add(control);
		
	}
	
	/*
	//CREAMOS UNA CLASE INTERNA QUE HEREDA DE SPINNERNUMBERMODEL
	private class MiModeloJSpinner extends SpinnerNumberModel{
		
		//EN EL CONSTRUCTOR DE NUESTRA CLASE LLAMAMOS AL CONSTRUCTOR DE LA CLASE PADRE (SPINNERNUMBERMODEL)
		public MiModeloJSpinner() {
			
			super(5,0,10,1);
			
		}
		//USAMOS UN METODO DE TIPO OBJECT PARA SOBREESCRIBIR EL METODO Y HACER QUE HAGA LO CONTRARIO
		public Object getNextValue() {
			
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			
			return super.getNextValue();
		}
		
		
	}*/
}




