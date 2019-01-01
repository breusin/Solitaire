package solitaire.ui;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import com.google.common.collect.Lists;

import solitaire.CardSuit;
import solitaire.model.Card;

public class CardImageMap {
	private Toolkit toolkit = null;
	
	private int cardWidth = 73;
	
	private int cardHeight = 98;
	
	private List<CardSuit> cardSuitOrder = Lists.newArrayList(
		CardSuit.CLUBS, 
		CardSuit.SPADES, 
		CardSuit.HEARTS, 
		CardSuit.DIAMONDS);
	
	private List<String> cardValueOrder = Lists.newArrayList("A","2","3","4","5","6","7","8","9","10","J","Q","K");

	private BufferedImage imageStrip;
	
	private String filename;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) throws IOException {
		this.filename = filename;
		imageStrip = ImageIO.read(new File(filename));
	}

	public CardImageMap(String filename) throws IOException {
		this.setFilename(filename);
		
		toolkit = Toolkit.getDefaultToolkit();
	}
	
	public Image getCardImage(Card card) {
		CardSuit suit = card.getSuit();
		String value = card.getValue();
	
		int suitIndex = cardSuitOrder.indexOf(suit);
		int valueIndex = cardValueOrder.indexOf(value);
		
		int x = (valueIndex * cardWidth)+ 1;
		int y = (suitIndex * cardHeight) + 1;
		
		CropImageFilter cropFilter = new CropImageFilter(x, y, cardWidth-2, cardHeight-2);
		Image cardImage = toolkit.createImage(new FilteredImageSource
	            (imageStrip.getSource(), cropFilter));
		return cardImage;
	}
	
}
