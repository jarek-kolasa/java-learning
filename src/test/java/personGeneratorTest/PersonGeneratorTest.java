package personGeneratorTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import personGenerator.Person;
import personGenerator.PersonGenerator;
import personGenerator.SexType;

@RunWith(MockitoJUnitRunner.class)
public class PersonGeneratorTest {

	/**
	 * stworz klase osoba ktora bedzie miala nastapujuce pola a) imie - string b)
	 * nazwisko - string c) plec - enum (M lub K) d) metode"przedstawSie" Stworz
	 * list� 10 losowo generowanych osob Podziel ta liste wedlug: - plci -
	 * dlugosci nazwiska (dluzsze/krotsze niz 6 znakow) - pierwszej litery imienia
	 * (zaczynajace sie na samogloske/spogloske)
	 */

	private String[] FemaleNames = { "A", "B", "C" };
	private String[] MaleNames = { "D", "E", "F" };
	private String[] FemaleSurnames = { "G", "H", "I" };
	private String[] MaleSurnames = { "J", "K", "L" };

	private SexType sex;

	@Mock
	Person person;

	@Test
	public void personCreatorNotNullTest() {
		assertNotNull(person);
	}


}
