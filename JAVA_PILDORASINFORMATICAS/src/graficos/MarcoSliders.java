//VIDEO 96 y 97
package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSliders {

	public static void main(String[] args) {
		
		FrameSliders mimarco = new FrameSliders();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}


class FrameSliders extends JFrame{
	
	public FrameSliders() {
		
		setBounds(300, 300, 500, 450);
		
		LaminaSliders milamina = new LaminaSliders();
		
		add(milamina);
		
		setVisible(true);
	}
}

class LaminaSliders extends JPanel{
	
	private JLabel rotulo;
	private JSlider control;
	
	public LaminaSliders() {
		
		setLayout(new BorderLayout());
		rotulo = new JLabel("En un lugar de la mancha de cuyo nombre...");
		
		add(rotulo, BorderLayout.CENTER);
		
		control = new JSlider(8,50,12);
		
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		
		control.setFont(new Font("Serif", Font.ITALIC, 10));
		
		JPanel laminaslider = new JPanel();
		
		EventoSlider mievento = new EventoSlider();
		control.addChangeListener(mievento);
		
		laminaslider.add(control);
		
		add(laminaslider, BorderLayout.NORTH);
			
	}
	
	
	class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent arg0) {
			
			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
			
		}
	}
}

