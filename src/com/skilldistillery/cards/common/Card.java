package com.skilldistillery.cards.common;

public class Card {

  private Rank rank;
  private Suit suit;
  
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }
  
  public Card(int value) {
	// TODO Auto-generated constructor stub
}

public int getValue() {
    return rank.getValue();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Card other = (Card) obj;
    if (rank != other.rank)
      return false;
    if (suit != other.suit)
      return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(rank);
    builder.append(" of ");
    builder.append(suit);
    return builder.toString();
  }
  
}
