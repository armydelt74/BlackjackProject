package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List<Card> cardlist = new ArrayList<>();

	public List<Card> getCardlist() {
		return this.cardlist;
	}
	public void setCardlist(List<Card> cardlist) {
		return;
	}


	public void addCard(Card card) {
		cardlist.add(card);
	}
	
	public void clearHand() {
		cardlist.removeAll(cardlist);

	}

	public Card getOne(int number) {
		return cardlist.get(number);

	}

	public String toString() {
		String cardShow = "";
		for (Card card : cardlist) {
			cardShow += card.toString() + "\n";
			System.err.println(card);
		}
		return cardShow;
	}

}


// "]";
// }

//	
//
//	Rank[] ranks = Rank.values();
//	{
//
//		for (int i = 0; i < ranks.length; i++) {
//			System.out.println(ranks[i] + " " + ranks[i].getValue());
//		}
//
//		for (Suit s : Suit.values()) {
//			System.out.println(s);
//		}
//	}
//	
//}
