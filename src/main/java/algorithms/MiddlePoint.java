package algorithms;

/**
 * Znajdz tzw punkt srodkowy tablicy Punkt srodkowy to indeks w tablicy dla
 * ktorego suma elementow po lewej stronie jest taka sama jak suma elementow po
 * prawej stronie
 * <p>
 * np TAB = [1,2,3,6] - punkt srodkowy to 2 bo TAB[0] + TAB[1] + TAB[2] = TAB[3]
 * -> 1+2+3 = 6
 * <p>
 * Jesli punkt srodkowy nie istnieje wynikiem powinno byc -1 Napisz kilka
 * przypadkow testowych swojej metody
 */

public class MiddlePoint {

	public int checkMiddlePoint(int[] tab) {

		if (tab == null || tab.length == 0) {
			throw new NullPointerException("Array cannot be empty");
		}

		int sumFromBeginning = 0;
		int sumFromEnding = 0;
		boolean doesExist = false;

		for (int i = 0; i < tab.length; i++) {
			sumFromEnding += tab[i];
		}

		int i = 0;
		
		while (i < tab.length && doesExist == false) {
			
			sumFromBeginning += tab[i];
			sumFromEnding -= tab[i];
			
			if (sumFromBeginning == sumFromEnding) {
				return i;
			}
			i++;
		}

		return -1;
	}

}
