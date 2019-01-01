package solitaire.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Dimension;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import solitaire.model.Card;

public class Foundation extends JPanel {

	public Foundation() {
		Border border = BorderFactory.createLineBorder(Color.black);
		setBorder(border);
		setPreferredSize(new Dimension(50,100));
		setOpaque(false);
	}
	private Stack<Card> cards;

	public Stack<Card> getCards() {
		return cards;
	}

	public void setCards(Stack<Card> cards) {
		this.cards = cards;
	}
}
