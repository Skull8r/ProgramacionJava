package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado miMarco = new MarcoCentrado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		//CREAMOS UN OBJETO DE TIPO TOOLKIT PARA OBTENER LA PANTALLA EN LA QUE TRABAJAMOS
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		//CREAMOS UN OBJETO DE TIPO DIMENSION PARA ALMACENAR EL TAMAÑO  DE LA PANTALLA EN LA QUE TRABAJAMOS
		Dimension tamanopantalla = mipantalla.getScreenSize();
		
		int anchopantalla = tamanopantalla.width;
		int altopantalla = tamanopantalla.height;
		
		setSize(anchopantalla/2, altopantalla/2);
		setLocation(anchopantalla/4, altopantalla/4);
		setVisible(true);
		setTitle("Akita Inu");
		
		Image miicono = mipantalla.getImage("src/graficos/icono_akita.jpg");
		setIconImage(miicono);
	
	}
}
