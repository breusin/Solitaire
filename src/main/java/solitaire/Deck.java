package solitaire;

import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;

import solitaire.model.Card;

/**
 * Deck is a container for the list off all cards
 * 
 * @author brentreusing
 *
 */
public class Deck {

	List<Card> cards;
	
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void shuffle() {
		System.out.println("shuffle()");
		Collections.shuffle(cards);
	}
}
