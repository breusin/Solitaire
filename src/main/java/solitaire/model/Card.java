package solitaire.model;

import solitaire.CardSuit;

public class Card {
	String value;
	CardSuit suit;

	public Card(CardSuit suit, String value) {
		this.suit = suit;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public CardSuit getSuit() {
		return suit;
	}
	
	public String toString() {
		return value + " of "+suit;
	}
}
