//VIDEO 91
package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PruebaArea {

	public static void main(String[] args) {
		
		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoPruebaArea extends JFrame{
	
	private JPanel laminabotones;
	private JTextArea areatexto;
	private JButton botoninsertar, botonsaltolinea;
	private JScrollPane laminaconbarra;
	
	public MarcoPruebaArea() {
		
		setTitle("Probando Área de texto");
		setBounds(300, 300, 400, 350);
		
		setLayout(new BorderLayout());
		
		laminabotones = new JPanel();
		botoninsertar = new JButton("Insertar");
		botoninsertar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//APPEND ES METODO DE JTEXTAREA QUE AÑADE TEXTO SIN ELIMINAR EL ANTERIOR
				areatexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme...");
			}
		});
		
		laminabotones.add(botoninsertar);
		
		
		botonsaltolinea = new JButton("Salto línea");
		botonsaltolinea.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				boolean saltar = !areatexto.getLineWrap();
				
				areatexto.setLineWrap(saltar);
				
				//COMPROBACIÓN
				if(saltar) {
					botonsaltolinea.setText("Quitar salto");
				}else {
					botonsaltolinea.setText("Salto línea");
				}
				
				
				//OPERADOR TERNARIO ES LO MISMO QUE LO ANTERIOR
				botonsaltolinea.setText(saltar ? "Quitar salto" : "Salto línea");
				
				
			}
		});
		
		laminabotones.add(botonsaltolinea);
		add(laminabotones,BorderLayout.SOUTH);
		
		areatexto = new JTextArea();
		
		laminaconbarra = new JScrollPane(areatexto);
		add(laminaconbarra, BorderLayout.CENTER);
		
		
	}
	
	
}