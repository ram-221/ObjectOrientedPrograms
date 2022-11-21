package com.bridgelabzuc3;

import java.util.Random;

public class DeckOfCards {

	static String[] Clubs = { "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJack", "CQueen", "CKing",
	"CAce" };

	static String[] Diamonds = { "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJack", "DQueen", "DKing",
	"DAce" };

	static String[] Hearts = { "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJack", "HQueen", "HKing",
	"HAce" };

	static String[] Spades = { "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJack", "SQueen", "SKing",
	"SAce" };

	static String[][] deck = { Clubs, Diamonds, Hearts, Spades };
	static String[][] newDeck;

	public  void distribute() {

		newDeck = deck;
		for (int i = 0; i < 4; i++) {
			System.out.println("For Player :" + i+1);
			for (int j = 0; j < 13; j++) {

				shuffleCards();
			}

			System.out.println("*********");
		}
	}

	public static  void shuffleCards() {

		Random c = new Random();
		int suit = c.nextInt(4);
		int rank = c.nextInt(13);
		if (newDeck[suit][rank] == null) {
			shuffleCards();
		} else {
			System.out.println(newDeck[suit][rank]);
			newDeck[suit][rank] = null;
		}
	}

	public static void main(String[] args) {
		DeckOfCards card = new DeckOfCards();
		card.distribute();

	}
}
