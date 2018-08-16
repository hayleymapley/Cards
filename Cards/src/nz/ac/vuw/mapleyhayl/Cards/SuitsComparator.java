package nz.ac.vuw.mapleyhayl.Cards;

import java.util.Comparator;

public class SuitsComparator implements Comparator<Card> {

	@Override
	public int compare(Card a, Card b) {
		if (a.getSuit() > b.getSuit()) {
			return 1;
		} else if (a.getSuit() < b.getSuit()) {
			return -1;
		}
		return 0;
	}

	
}
