package solitaire.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import solitaire.model.Card;

public class CardFace extends JPanel {

	private Image image;
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters
        super.repaint();
    }
	
	public CardFace() {
		setBackground(Color.RED);
		//setOpaque(true);
	}
	
	public Card getCardModel() {
		return cardModel;
	}

	public void setCardModel(Card cardModel) {
		this.cardModel = cardModel;
	}

	private Card cardModel;
}
