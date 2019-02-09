package personGeneratorTest;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import personGenerator.Person;
import personGenerator.PersonDataList;
import personGenerator.PersonSet;
import personGenerator.SexType;
import personGenerator.generators.NameGenerator;
import personGenerator.generators.PersonGenerator;
import personGenerator.generators.SexTypeGenerator;
import personGenerator.generators.SurnameGenerator;

@RunWith(MockitoJUnitRunner.class)
public class PersonGeneratorTest {

	/**
	 * stworz klase osoba ktora bedzie miala nastapujuce pola a) imie - string b)
	 * nazwisko - string c) plec - enum (M lub K) d) metode"przedstawSie" Stworz
	 * liste 10 losowo generowanych osob Podziel ta liste wedlug: - plci - dlugosci
	 * nazwiska (dluzsze/krotsze niz 6 znakow) - pierwszej litery imienia
	 * (zaczynajace sie na samogloske/spogloske)
	 */

	private PersonGenerator personGenerator;

	@Mock
	private Person person;

	@Mock
	PersonDataList personData;

	@Mock
	PersonSet personSet;

	@Mock
	SexTypeGenerator sexType;

	@Mock
	NameGenerator name;

	@Mock
	SurnameGenerator surname;

	@Before
	public void setPersonGenerator() {
		personGenerator = new PersonGenerator();
	}

	@Test
	public void check_if_the_personGenerator_generates_person() {

		when(personSet.generatePerson()).thenReturn(personGenerator.generatePerson());
	}

	@Test
	public void check_sex_type_of_person() {
		when(sexType.sexGenerator()).thenReturn(SexType.W);
		when(sexType.sexGenerator()).thenReturn(SexType.M);
	}

	@Test
	public void check_personData() {
		// given
		List<Person> listOfPerson = new ArrayList<Person>();
		listOfPerson.add(personGenerator.generatePerson());
		listOfPerson.add(personGenerator.generatePerson());

		when(personData.personList()).thenReturn(listOfPerson);
	}

}
