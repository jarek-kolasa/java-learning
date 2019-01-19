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
		
		int tabSize = 0;
		
		for (int i = 2; i < tab.length; i++) {
				if(checkIsItPrime(i)) {
					tabSize ++;
				}
		}
		
		int[] elements = new int[tabSize];
		
		int arrayPosition = 0;

		for (int i = 2; i < tab.length; i++) {
			if (checkIsItPrime(i)) {
				elements[arrayPosition] = tab[i];
				arrayPosition++;
			}
		}
		
		return elements;
	}
	
	public boolean checkIsItPrime(int i) {
		int divider = 0;
		
		if(i < 2) {
			return false;
		}
		
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				divider ++;
			}
			if(divider > 2) {
				return false;
			}
		}
		
		if (divider < 2) {
			return false;
		}
		
		return true;
	}

	public boolean numberDividedBy5(int i) {
		
		if (i < 5) {
			return false;
		}
		
		for (int j = 0; j < tab.length; j++) {
			if (j % 5 == 0) {
				return true;
			}
		}
		
		return false;
	}
	
	public int[] array() {

		int[] array = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			array[i] = i;
		}

		return array;
	}

	public int sumOddNumbers() {
		
		int counter = 0;
		
		if(tab.length == 0) {
			return 0;
		}
		
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 1) {
				counter = counter + tab[i];
			}
		}
		
		return counter;
	}

	public int multiply5numbers() {

		int multi = 1;
		
		if(tab.length == 0) {
			return 0;
		}
		
		for (int i = 1; i < tab.length; i++) {
			if (i % 5 == 0) {
				multi = multi * i;
			}
		}
		
		return multi;
	}

}
