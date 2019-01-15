package tablicaIntowTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import tablicaIntow.ArrayOfInts;

public class ArrayOfIntsTest {

	@Test
	public void arrayOf5Elements() {
		int size = 5;
		ArrayOfInts tab = new ArrayOfInts(size);
		int[] tabTest = tab.array();
		assertEquals(0, tabTest[0]);
		assertEquals(1, tabTest[1]);
		assertEquals(2, tabTest[2]);
		assertEquals(3, tabTest[3]);
		assertEquals(4, tabTest[4]);
	}

	@Test
	public void arraySizeOf100ElementsTest() {

		int size = 100;
		ArrayOfInts tab = new ArrayOfInts(size);
		int[] tabTest = tab.array();

		assertEquals(size, tabTest.length);
	}
}
