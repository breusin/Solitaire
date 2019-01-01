package solitaire.ui;

import java.awt.Image;
import java.io.IOException;

import javax.swing.JFrame;

import solitaire.CardSuit;
import solitaire.model.Card;

public class UIMain {

	public static void main(String[] args) throws IOException {
		
		JFrame jframe = new JFrame();
		jframe.setSize(200,300);
		
		CardFace cardFace = new CardFace();
		jframe.setContentPane(cardFace);
		jframe.setVisible(true);
		
		String imageFilename = "src/main/resources/cards.png";
		
		CardImageMap cardImageMap = new CardImageMap(imageFilename);
		
		Card card = new Card(CardSuit.DIAMONDS, "J");
		Image cardImage = cardImageMap.getCardImage(card);

		cardFace.setImage(cardImage);
	    jframe.setSize(cardFace.getWidth(),cardFace.getHeight());
	}
}
