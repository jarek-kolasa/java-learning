package tablicaIntowTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	
	@Test
	public void everySecondElementTest() {
		int input = 4;
		ArrayOfInts tab = new ArrayOfInts(input);
		int[] tabTest = tab.everySecondElement();
		assertEquals(1, tabTest[0]);
		assertEquals(3, tabTest[1]);
	}
	
	@Test
	public void evenNumbersTest() {
		int input = 4;
		ArrayOfInts tab = new ArrayOfInts(input);
		int[] tabTest = tab.evenNumbers();
		assertEquals(0, tabTest[0]);
		assertEquals(2, tabTest[1]);
	}
	
	@Test
	public void numbersDivisibleBy2And3Test() {
		int input = 13;
		ArrayOfInts tab = new ArrayOfInts(input);
		int[] tabTest = tab.numbersDivisibleBy2And3();
		assertEquals(0, tabTest[0]);
		assertEquals(6, tabTest[1]);
		assertEquals(12, tabTest[2]);
	}
	
	@Test
	public void checkPrimeNumberFalseTest() {
		int input = 6;
		ArrayOfInts tab = new ArrayOfInts(input);
		assertFalse(tab.checkIsItPrime(input));
	}
	
	@Test
	public void checkPrimeNumberTrueTest() {
		int input = 3;
		ArrayOfInts tab = new ArrayOfInts(input);
		assertTrue(tab.checkIsItPrime(input));
	}
	
	@Test
	public void isPrimeTest() {
		int input = 13;
		ArrayOfInts tab = new ArrayOfInts(input);
		int[] tabTest = tab.primeNumbers();
		assertEquals(2, tabTest[0]);
		assertEquals(3, tabTest[1]);
		assertEquals(5, tabTest[2]);
		assertEquals(7, tabTest[3]);
		assertEquals(11, tabTest[4]);
	}
	
	@Test
	public void isPrime1thorws0Test() {
		int input = 1;
		ArrayOfInts tab = new ArrayOfInts(input);
		int[] tabTest = tab.primeNumbers();
		assertEquals(0, tabTest.length);
	}
	
}
