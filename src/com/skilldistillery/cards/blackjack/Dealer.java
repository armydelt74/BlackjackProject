package com.skilldistillery.cards.blackjack;

public class Dealer extends Person {

	public Dealer() {
		super();
		name = "The dealer";
	}

	public boolean wantToHit() {
		if (getTotal() < 16)
			return true;
		if (getTotal() > 16)
			return false;
		return false;
	}
}
