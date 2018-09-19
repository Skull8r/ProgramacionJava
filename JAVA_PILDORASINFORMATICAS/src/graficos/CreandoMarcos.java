package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiMarco marco = new MiMarco();
		
		
		
		
		
	}

}

class MiMarco extends JFrame{
	
	public MiMarco() {
		
		setBounds(400, 200, 550, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Menu");
		//setResizable(false);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		
		
	}
}
