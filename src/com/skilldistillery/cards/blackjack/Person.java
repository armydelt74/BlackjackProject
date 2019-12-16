package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;

public abstract class Person {
	private List<Card> cards;
	protected String name;
	private int total;

	public Person() {
		cards = new ArrayList<Card>();
		total = 0;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Card dealInitialCards(Card card) {
		for (int i = 0; i < 2; i++)
			this.cards.add(card);
		return card;

	}

	public Card receiveCard(Card card) {
		this.cards.add(card);
		total += card.getValue();
		return card;
	}

	public int getTotal() {
		return total;
	}

	public String getName() {
		return name;
	}

	public abstract boolean wantToHit();

	public void printCards(boolean showAll) {
		System.out.print("\n" + name + (name == "You" ? " have a" : " has a")
				+ (cards.get(0).getValue() == 8 || cards.get(0).getValue() == 11 ? "n " : " ")
				+ cards.get(0).toString());
		for (int i = 1; i < cards.size(); i++) {
			if (showAll) {
				System.out.print(" and a" + (cards.get(i).getValue() == 8 || cards.get(i).getValue() == 11 ? "n " : " ")
						+ cards.get(i).toString());
			} else {
				System.out.println(" and a hidden card.");
			}
		}
		if (showAll) {
			System.out.println(".\n" + name + (name == "You" ? "r" : "'s") + " total is " + total + ".");
		}
	}
}