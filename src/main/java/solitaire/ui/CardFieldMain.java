package solitaire.ui;

import javax.swing.JFrame;

public class CardFieldMain {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		jframe.setSize(1024,768);
		
		CardField cardField = new CardField();
		
		jframe.setContentPane(cardField);
		jframe.setVisible(true);
		
	}

}
