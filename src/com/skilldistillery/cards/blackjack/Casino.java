package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.cards.common.Deck;

public class Casino {
	public static ArrayList<Person> players;

	public static void main(String[] args) {
		Deck cDeck = new Deck();
		cDeck.createDeck();
		ArrayList<Person> players = new ArrayList<Person>();
		players.add(new Player());
		players.add(new Dealer());
		System.out.println("Welcome to a new Blackjack game!");
		
		dealCards();
		takeTurns();
		declareWinner();
		playAgain();
	}

	//private void initializeGame() {

	public static void dealCards() {
		for (Person player : players) {
			dealInitialCards(player);
			player.printCards(player.getName().equals("You"));
		}
	}

	public static void dealInitialCards(Person player) {
		// TODO Auto-generated method stub
		
	}

	private static void takeTurns() {
		for (Person player : players) {
			boolean endOfTurn = false;
			while (!endOfTurn) {
				player.printCards(true);
				boolean hit = player.wantToHit();
				if (hit) {
					dealCard(player);
					System.out.println(player.getName() + " drew a card.\n");
					if (player.getTotal() > 21) {
						endOfTurn = true;
						System.out.println(player.getName() + " bust!!!.\n");
					}
				} else {
					endOfTurn = true;
					System.out.println(player.getName() + " stayed.\n");
				}
			}
		}
	}

	private static void dealCard(Person player) {
		// TODO Auto-generated method stub
		
	}

	private static void declareWinner() {
		int highest = -1;
		int topPlayer = -1;
		for (int i = 0; i < players.size(); i++) {
			String name = players.get(i).getName();
			int total = players.get(i).getTotal();

			System.out.println(name + (name.equals("You") ? " have " : " has ") + "a total of " + total + ".");

			if (total > highest && total <= 21) {
				highest = total;
				topPlayer = i;
			}
			if (total == highest && name.equals("The dealer")) {
				topPlayer = i;
			}

			if (topPlayer == -1) {
				System.out.println("Double bust!!!.");
			} else {
				System.out.println(players.get(topPlayer).getName() + " wins!");
			}
		}
	}

	private static void playAgain() {
		System.out.print("\nPlay again? \"y\" / \"n\": ");
		Scanner sc = new Scanner(System.in);
		while (true) {
			String input = sc.next();
			if (input.equals("y")) {
				new Casino();
			} else if (input.equals("n")) {
				System.exit(0);
			} else {
				System.out.print("Please type \"y\" or \"n\": ");
			}
			sc.close();
		}
	}
}
