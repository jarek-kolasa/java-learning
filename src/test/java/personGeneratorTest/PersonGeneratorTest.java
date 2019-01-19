package personGeneratorTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import personGenerator.PersonGenerator;
import personGenerator.SexType;

public class PersonGeneratorTest {

	/**
	 * stworz klase osoba ktora bedzie miala nastapujuce pola a) imie - string b)
	 * nazwisko - string c) plec - enum (M lub K) d) metode"przedstawSie" Stworz
	 * list� 10 losowo generowanych osob Podziel ta liste wedlug: - plci -
	 * dlugosci nazwiska (dluzsze/krotsze niz 6 znakow) - pierwszej litery imienia
	 * (zaczynajace sie na samogloske/spogloske)
	 */

	private String[] name = { "A", "B", "C" };
	private String[] surname = { "D", "E", "F" };

	private SexType sex;

	public SexType sexGenerator() {
		return Math.random() > 0.5 ? sex.W : sex.M;
	}

	PersonGenerator person = new PersonGenerator(name[(int) Math.random() * 3], surname[(int) Math.random() * 3],
			sexGenerator());

	@Test
	public void personCreatorNotNullTest() {
		assertNotNull(person);
	}

	@Test
	public void showPerson() {

	}

}
