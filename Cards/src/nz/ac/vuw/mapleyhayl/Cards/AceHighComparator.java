package nz.ac.vuw.mapleyhayl.Cards;

import java.util.Comparator;

public class AceHighComparator implements Comparator<Card> {

	@Override
	public int compare(Card a, Card b) {
//		SET A & B CARDS TO RANK 14 IF THEY ARE ACE
		if (a.getRank()==1) {
			a.setRank(14);
		}
		if (b.getRank()==1) {
			b.setRank(14);
		}
		if (a.getRank() > b.getRank()) {
			return 1;
		} else if (a.getRank() < b.getRank()) {
			return -1;
		}
		return 0;
	}

}
