package nz.ac.vuw.mapleyhayl.Cards;

import java.util.*;

public class Main {

	Scanner in = new Scanner(System.in);
	ArrayList<Card> deck = new ArrayList<>();

	public Main() {
		this.menu();
	}

	public void menu() {
		System.out.println("\n------ MENU ------");
		System.out.println("[1] Restore standard deck");
		System.out.println("[2] Play BlackJack");
		int ans = in.nextInt();
		switch (ans) {
		case 1 :
			this.restoreStandardDeck();
			break;
		case 2 :
			this.playBlackJack();
			break;
		}
		this.menu();
	}

	public void restoreStandardDeck() {
		deck.clear();
		int suit;
		int rank;
		for (int i=1; i<=4; i++) {
			suit = i;
			for (int j=1; j<=13; j++) {
				rank = j;
				Card newCard = new Card(suit, rank);
				deck.add(newCard);
			}
		}
	}

	public void showCards(ArrayList<Card> cards) {
		for (Card c : cards) {
			System.out.println(c.toString());
		}
	}

	public BlackJackHand dealBlackJackHand() {
		int num = 0;
		ArrayList<Card> cards = new ArrayList<>();
		for (int i=0; i<2; i++) {
			num = (int) Math.ceil(Math.random()*deck.size()-1);
			cards.add(deck.get(num));
			deck.remove(num);
		}
		BlackJackHand hand = new BlackJackHand(cards);
		return hand;
	}

	public void playBlackJack() {
		this.restoreStandardDeck();
		//sets J, Q, K = 10;
		for (int j=0; j<deck.size(); j++) {
			if (deck.get(j).getRank()>10 && deck.get(j).getRank()<14) {
				deck.get(j).setRank(10);
			}
		}
		BlackJackHand playerHand = this.dealBlackJackHand();
		System.out.println("YOUR HAND");
		this.showCards(playerHand.getCards());
		int playerScore = this.computeBlackJackScore(playerHand.getCards().get(0), playerHand.getCards().get(1));
		System.out.println("YOUR SCORE: " + playerScore);
		BlackJackHand opponentHand = this.dealBlackJackHand();
		System.out.println("OPPONENT HAND");
		this.showCards(opponentHand.getCards());
		int opponentScore = this.computeBlackJackScore(opponentHand.getCards().get(0), opponentHand.getCards().get(1));
		System.out.println("OPPONENT SCORE: " + opponentScore);
		if (playerScore > opponentScore) {
			System.out.println("YOU WIN!");
		} else if (opponentScore > playerScore) {
			System.out.println("YOU LOSE...");
		} else {
			System.out.println("TIE");
		}
	}

	//NEED TO ADD ACE FUNCTIONALITY
	public int computeBlackJackScore(Card a, Card b) {
		int score = 0;
		if ((a.getRank() + b.getRank() <= 21)) {
			score = a.getRank() + b.getRank();
		} else {
			if (a.getRank() > b.getRank()) {
				score = a.getRank();
			} else {
				score = b.getRank();
			}
		}
		return score;
	}

	public static void main(String[] args) {
		new Main();

	}
}
