package todo;

import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Torresdehanoi extends JFrame {
	JTextField texto;
	JLabel letras;
	JButton juego;
	JButton simulador;
	JButton instrucciones;
	
	public Torresdehanoi(){
		super("MENU");
		setLayout(new GridBagLayout());
		texto=new JTextField(10);
		letras=new JLabel("Bienvenido escoja una opción:   ");
		juego=new JButton("Juego");
		simulador=new JButton("Simulador");
		instrucciones=new JButton("Instrucciones");
		add(letras);
		add(juego);
		add(simulador);
		add(instrucciones);
		ButtonHandler act = new ButtonHandler();
		juego.addActionListener(act);
	}
	private class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(java.awt.event.ActionEvent arg0) {
			
		}
	}
	
	public static void main(String[] args) {
	Torresdehanoi ventanap = new Torresdehanoi();
	ventanap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ventanap.setBounds(450, 250, 500, 200);
	ventanap.setVisible(true);
	}

}
