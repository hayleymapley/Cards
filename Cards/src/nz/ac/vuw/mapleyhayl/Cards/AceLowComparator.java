package nz.ac.vuw.mapleyhayl.Cards;

import java.util.Comparator;

public class AceLowComparator implements Comparator<Card> {

	@Override
	public int compare(Card a, Card b) {
//		SET A & B CARDS TO RANK 1 IF THEY ARE ACE
		if (a.getRank()==14) {
			a.setRank(1);
		}
		if (b.getRank()==14) {
			b.setRank(1);
		}
		//COMPARE
		if (a.getRank() > b.getRank()) {
			return 1;
		} else if (a.getRank() < b.getRank()) {
			return -1;
		}
		return 0;
	}
}
