package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.skilldistillery.cards.blackjack.Person;

public class Deck {
	public List<Card> cards;

	public List<Card> createDeck() {
		List<Card> deck = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
//				for (Card card : deck) {
				deck.add(new Card(r, s));
				// shuffle();
				Collections.shuffle(deck);
			}
		}
		System.out.println("deck=" + deck);
		return cards;

	}

	public void dealCard(Person person) {
		person.receiveCard(drawNextCard());
	}

	public void dealInitialCards(Person person) {
		dealCard(person);
		dealCard(person);

	}

	public Card drawNextCard() {
		int value = nextInt(2, 12);
		return new Card(value);
	}

	private int nextInt(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public int checkDeckSize() {
		return cards.size();
	}

	public void fillDeck() {
		for (int i = 0; i < 4; i++) {
			createDeck();
			shuffle();
		}
	}
}