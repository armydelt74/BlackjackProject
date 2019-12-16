package com.skilldistillery.cards.common;

public enum Suit {
	HEARTS("\u2665" + "Hearts" + "\u2665"), SPADES("\u2660" + "Spades" + "\u2660" ), CLUBS("\u2663" + "Clubs" + "\u2663" ), DIAMONDS("\u2666" + "Diamonds" + "\u2666" );

	private String name;

	Suit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

//  
//  char uSpade = new Character(u/2660);
//spade Character.toChars(0x2660);
//  
//  U+2660	U+2665	U+2666	U+2663
////Character.UnicodeBlock.
//Spades = Character.toChars(Ux2660);
//
//
//♠	♥	♦	♣
//if (suit == 0) {
//    playersuit[ct] = "\u2660";
//}
//if (suit == 1) {
//    playersuit[ct] = "\u2661"; //change to red heart
//}
//if (suit == 2) {
//    playersuit[ct] = "\u2662"; //change to red diamond
//}
//if (suit == 3) {
//    playersuit[ct