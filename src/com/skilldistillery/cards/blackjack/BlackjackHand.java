package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
	}
		public int HandValue() {
		return 0;
				//"Hand [cardlist=" + cardlist + ", ranks=" + Array.getInt(cardlist, this.cardlist)]
	}
	public int getHandValue() {
		int bhv = 0;
		for (Card card : cardlist) {
			bhv = bhv + card.getValue();
		}
		return bhv;
	}

	public boolean isBj() {
		if (this.getHandValue() == 21) {
			System.out.println("Blackjack!");
			return true;
		} else {
			return false;
		}

	}

	public boolean isBust() {
	if (this.getHandValue() > 21) {
		System.out.println("Bust!");
		return true;
	}else {
		return false;
	}
}

//	public int getTotal() {
//        List<Integer> totals = new ArrayList<Integer>();
//        totals.add(new Integer(0));
//        for(Card card : cards) {
//            for (int i = 0; i < totals.size(); i++) {
//                totals.add(i, new Integer(totals.get(i).intValue() + card.getValue()));
//                totals.remove(i+1);
//            }
//            if (card.getValue() == 1) totals.add(new Integer(totals.get(totals.size() - 1) - 10));
//        }
//        for (Integer total : totals) {
//            if (total.intValue() <= 21) {return total;
//
//        return totals.get(totals.size()-1).intValue();
//    }
//        }
//	}
}