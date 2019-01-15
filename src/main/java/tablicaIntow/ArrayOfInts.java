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

	public void everySecondElement() {
		for (int i = 0; i < tab.length; i++) {
			if (i % 2 == 1) {
				System.out.println(tab[i]);
			}
		}
	}
	

	public void evenNumbers() {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 0) {
				System.out.println(tab[i]);
			}
		}
	}

	public void numbersDivisibleBy2And3() {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 6 == 0) {
				System.out.println(tab[i]);
			}
		}
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
