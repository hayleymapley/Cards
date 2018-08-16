package nz.ac.vuw.mapleyhayl.Cards;

import java.util.*;

public class Hand {
	
	private ArrayList<Card> cards;
	
	public Hand(ArrayList<Card> cards) {
		this.setCards(cards);
	}

	public ArrayList<Card> getCards() {
		return cards;
	}
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
}
