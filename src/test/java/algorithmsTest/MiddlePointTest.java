package algorithmsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import algorithms.MiddlePiont;

/**
 * Znajdz tzw punkt srodkowy tablicy
 * Punkt srodkowy to indeks w tablicy dla ktorego suma elementow po lewej stronie
 * jest taka sama jak suma elementow po prawej stronie
 * <p>
 * np
 * TAB = [1,2,3,6] - punkt srodkowy to 2 bo
 * TAB[0] + TAB[1] + TAB[2] = TAB[3] -> 1+2+3 = 6
 * <p>
 * Jesli punkt srodkowy nie istnieje wynikiem powinno byc -1
 * Napisz kilka przypadkow testowych swojej metody
 */

public class MiddlePointTest {

	@Test
	public void checkTabFromExample() {
		int [] tab = new int [] {1, 2, 3, 6};
		assertEquals(2,MiddlePiont.checkMiddlePoint(tab));
	}
	
}
