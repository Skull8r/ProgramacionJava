//VIDEO 92

package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaCheck {

	public static void main(String[] args) {
		
		MarcoCheck mimarco = new MarcoCheck();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}
}


class MarcoCheck extends JFrame{
	
	public MarcoCheck() {
		
		setBounds(300, 300, 500, 350);
		setVisible(true);
		
		LaminaCheck milamina = new LaminaCheck();
		add(milamina);
	}
	
}


class LaminaCheck extends JPanel{
	
	private JLabel texto;
	private JCheckBox check1, check2;
	
	
	public LaminaCheck() {
		
		setLayout(new BorderLayout());
		
		Font miletra = new Font("Serif",Font.PLAIN,18);
		
		texto = new JLabel("En un lugar de la mancha de cuyo nombre...");
		
		//METODO PARA ESTABLECER TIPO DE LETRA QUE PIDE POR PARÁMETRO UN OBJETO DE TIPO FONT
		texto.setFont(miletra);
		
		//CREAMOS SEGUNDA LAMINA, AÑADIMOS EL JLABEL A LA LÁMINA, Y LA UBICAMOS EN EL CENTRO
		JPanel laminatexto = new JPanel();
		laminatexto.add(texto);
		add(laminatexto, BorderLayout.CENTER);
		
		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		
		JPanel laminachecks = new JPanel();
		laminachecks.add(check1);
		laminachecks.add(check2);
		
		add(laminachecks, BorderLayout.SOUTH);
		
	}
	
	private class ManejaChecks implements ActionListener{

		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int tipo = 0;
			
			if(check1.isSelected()) tipo+= 1;
			
			if(check2.isSelected()) tipo+= 2;
			
			texto.setFont(new Font("Serif",tipo,18));
			
		}
		
		
	}
	
}












