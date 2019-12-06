## Blackjack Project
Week 5 Homework for Skill Distillery


### Overview
Blackjack
Application Overview
Use classes to create a functional command line blackjack game. Leave the game's functionality until the end, first get the class structure figured out. From here you can implement methods and fields to store data you think you would need during a blackjack game. If you are unfamiliar with the rules take a look here.

Included is a Blackjack UML Diagram. The UML provided is a starting point - you aren't required to use this exact class structure. You will need to expand upon it to not only get a working game, but also to meet our expectations in the grading requirements.

We have also provided you with a Getting started with Blackjack document for a little additional guidance on the classes and methods you will need to create in this project. Give it a try just using the user stories below and if you hit a wall use this document as a resource to help your progression. Trying this on your own regardless of if it blows up will be beneficial to you.

Learning Objectives
Below are a list of objectives that we see the blackjack programing reinforcing.

Getting comfortable building classes in an Object-Oriented manner.
Building classes whose fields are Objects.
Practice writing methods.
Use collection types to organize and manage data.
Use conditionals to create game logic.
Project Requirement #0
You'll push your project to a Github repo named BlackjackProject. Be sure to include a README.md.

User Story #1
Create a class structure that mimics a deck of cards. Remember decks as well as hands are made up of cards. Feel free to create the structure in any way you see fit.

Your card and deck implementations should NOT be coupled to Blackjack; you should be able to reuse them to implement a poker or bridge game application.

User Story #2
Add methods and fields to your classes that mimic the functionality of shuffling and dealing a deck of cards. Remember that when a card is dealt you have to remove it from the current deck. You should be able to print out a shuffled deck to the terminal.

User Story #3
Deal two hands of cards - one to a Dealer and another to a Player. Allow the players to Hit (add cards to their hand) or Stay (not add cards to their hand) in accordance to the rules of blackjack shown in the wiki.

Do not worry about the multiple values for Ace until your basic game logic is working. Assume they are either 1 or 11 to start.

User Story #4
The Dealer's decisions are based on game logic in the program.

The Dealer must decide to Hit or Stay based on the rules of Blackjack: if the Dealer's hand total is below 17, the Dealer must Hit; if the hand total is 17 or above, the Dealer must Stay.

User Story #5
Determine the winner of each round by implementing the remaining rules of Blackjack (such as going over 21) and comparing hand values.

Stretch Goals
Try as many of these as you like, but ONLY after you've completed, tested, and COMMITTED your working game that meets the requirements.

"Soft" Ace - Ace has the value 1 or 11.

A dealer must Hit on a hand with the value "soft 17" (where an Ace is present with value 11 and other cards total 6) and Stay on "hard 17" (where an Ace is present, but hitting could cause the Dealer to go over 21)
"Blackjack" hand - if the user is initially dealt an Ace and a card with the value 10, this is a blackjack. The user immediately wins unless the dealer also has a blackjack (two-card hand with an Ace and a 10-value card).

Allow multiple players in the game.

Implement a monetary system so players can place bets on their hands.

Allow players to split hands.

Allow players to double down.

Deal from a multi-deck shoe.

Keep going. How about implementing in-game suggestions based on the player's current hand? Maybe a card-counting player?

Grading
This is a graded project. You are expected to have your project completed by the start of class on Monday morning.

You will be given either a pass or fail based on whether your code works given all of the following test conditions:

Your program must NOT be contained in one procedural main(). You MUST design a OO class structure.

When the game begins both the player and dealer are dealt two cards.

If a player or dealer is dealt 21 the game is over. Otherwise the player can choose to hit as many times as they wish until they choose to stay.

Once the player has completed their turn the dealer will begin their turn, automatically hitting or staying according to the Blackjack rules.

The game is immediately over if either player gets above 21.

The winner is displayed.


### Topics Covered
Array instantiation, passing methods, calling methods.
List Array/String Array; Super/sub Class & inheritance; UML project creation.

### Concepts

List Array/String Array; Super/sub Class & inheritance; UML project creation.

### Technology Used

Oracle Java SDK 1.8,
Eclipse IDE for Enterprise Java Developers;
Version: 2019-09 R (4.13.0)
Build id: 20190917-1200
Github

#### Lessons Learned
Do more ahead of time and don't try to do two projects during holidays - finish one or the other.
system.out.println((Topics Cover) + "and also" (Concepts) + "hopefully better time management.""
