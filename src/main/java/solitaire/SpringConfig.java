package solitaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.google.common.collect.Lists;

import solitaire.model.Card;

@Configuration
public class SpringConfig {

	@Bean
	public Deck getDeck() {
		Deck d = new Deck();
		d.setCards(getCards());
		return d;
	}

	@Bean
	public Set<CardSuit> getCardSuits() {
		// @formatter:off
		return Stream.of(
				CardSuit.HEARTS, 
				CardSuit.SPADES, 
				CardSuit.CLUBS, 
				CardSuit.DIAMONDS)
			.collect(Collectors.toSet());
		// @formatter:on
	}

	@Bean
	public Set<String> getCardValues() {
		// @formatter:off
		return Stream.of(
				"A",
				"2",
				"3",
				"4",
				"5",
				"6",
				"7",
				"8",
				"9",
				"10",
				"J",
				"Q",
				"K"
			).collect(Collectors.toSet());
		// @formatter:on
	}

	@Bean
	public List<Card> getCards() {
		ArrayList<Card> cards = Lists.newArrayList();
		for (CardSuit suit : getCardSuits()) {
			getCardValues().forEach(value -> {
				cards.add(getCard(suit, value));
			});
		}
		return cards;
	}

	@Bean
	@Scope("prototype")
	public Card getCard(CardSuit suit, String value) {
		return new Card(suit, value);
	}
}
