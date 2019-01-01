package solitaire.ui;

import java.awt.Color;

import javax.swing.JPanel;

public class CardField extends JPanel {

	public CardField() {
		
		Color color = new Color(41, 124, 42);
		setOpaque(true);
		setBackground(color);
	}
	
	public void addFoundation(Foundation foundation, int x, int y) {
		
	}
}
