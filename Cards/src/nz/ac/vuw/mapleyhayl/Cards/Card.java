package nz.ac.vuw.mapleyhayl.Cards;

public class Card {
	
	private int suit; //1=Clubs 2=Spades 3=Diamonds 4=Hearts
	private String suitString;
	private int rank;
	private String symbol;
	
	public Card() {
		//randomly setting suit
		this.suit = (int) Math.ceil(Math.random()*4);
		this.setSuitString(this.returnSuit(this.suit));
		//randomly setting rank
		this.rank = (int) Math.ceil(Math.random()*13);
		this.setSymbol(this.returnSymbol(this.rank));
	}
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
		this.suitString = this.returnSuit(suit);
		this.symbol = this.returnSymbol(rank);
	}
	
	public String returnSymbol(int rank) {
		if (rank == 1) {
			return "A";
		} else if (rank >= 2 && rank <= 10) {
			String strSymbol = Integer.toString(rank);
			return strSymbol;
		} else if (rank == 11) {
			return "J";
		} else if (rank == 12) {
			return "Q";
		} else if (rank == 13) {
			return "K";
		}
		return null;
	}
	
	public String returnSuit(int suit) {
		switch (suit) {
		case 1 :
			return suitString = "Clubs";
		case 2 :
			return suitString = "Spades";
		case 3 :
			return suitString = "Diamonds";
		case 4 :
			return suitString = "Hearts";
		}
		return null;
	}

	public String toString() {
		return symbol + " of " + suitString;
	}
	
 	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}

	public String getSuitString() {
		return suitString;
	}
	public void setSuitString(String suitString) {
		this.suitString = suitString;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
