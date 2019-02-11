package algorithmsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import algorithms.MiddlePoint;

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

	MiddlePoint middlePoint;
	
	@Before
	public void setUp() throws Exception {
		middlePoint = new MiddlePoint();
	}
	
	@Test
	public void checkTabFromExample() {
		int [] tab = new int [] {1, 2, 3, 6};
		assertEquals(2, middlePoint.checkMiddlePoint(tab));
	}
	
	@Test(expected = NullPointerException.class)
	public void tabIsNullTest() {
		int [] tab = null;
		assertNull(middlePoint.checkMiddlePoint(tab));
	}
	
	@Test
	public void arrayShouldReturn3Test() {
		int [] tab = new int [] {1, 2, 3, 6, 7, 5};
		assertEquals(3, middlePoint.checkMiddlePoint(tab));
	}
	
	@Test
	public void arrayContainingMinusValuesShouldReturn3Test() {
		int [] tab = new int [] {1, -2, -3, 6, 7, -5};
		assertEquals(3, middlePoint.checkMiddlePoint(tab));
	}
	
	@Test
	public void arrayShouldReturnMinus1Test() {
		int [] tab = new int [] {1, 2, -3, 6, 7, -5};
		assertEquals(-1, middlePoint.checkMiddlePoint(tab));
	}
}
