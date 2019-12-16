package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class Player extends Person {
	private Scanner sc;
	BlackjackHand pHand;

	public Player() {
		super();
		name = "You";
		sc = new Scanner(System.in);
	}

	public boolean wantToHit() {
		System.out.print("\nWould you like to \"hit\" or \"stay\": ");
		while (true) {
			String input = sc.next();
			if (input.equals("hit")) {
				return true;
			} else if (input.equals("stay")) {
				return false;
			} else {
				System.out.print("Type \"hit\" or \"stay\": ");
			}
		}
	}

	public static Person get(int topPlayer) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}