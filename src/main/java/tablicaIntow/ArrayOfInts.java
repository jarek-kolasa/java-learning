package tablicaIntow;

/**
 * stworz nowa tablice ze 100 intow i wypisz: a) co drugi element b) parzyste
 * elementy c) liczby podzielne jednocze�nie przez 2 i 3 d) liczby pierwsze e)
 * sume liczb nieparzystych f) iloczyn wszystkich liczb podzielnych przez 5
 */

public class ArrayOfInts {

	private int arraySize;
	private int[] tab;

	public ArrayOfInts(int arraySize) {
		this.arraySize = arraySize;
		tab = array();
	}

	public int[] everySecondElement() {

		int[] elements = new int[arraySize / 2];

		for (int i = 0; i < tab.length; i++) {
			if (i % 2 == 1) {
				elements[i / 2] = tab[i];
			}
		}
		return elements;
	}

	public int[] evenNumbers() {

		int[] elements = new int[arraySize / 2];

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 0) {
				elements[i / 2] = tab[i];
			}
		}
		return elements;
	}

	public int[] numbersDivisibleBy2And3() {

		int[] elements = new int[arraySize / 6 + 1];

		for (int i = 1; i < tab.length; i++) {
			if (tab[i] % 6 == 0) {
				elements[i / 6] = tab[i];
			}
		}
		return elements;
	}

	public int[] primeNumbers() {

		return null;
	}

	public int[] array() {

		int[] array = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			array[i] = i;
		}

		return array;
	}
}
