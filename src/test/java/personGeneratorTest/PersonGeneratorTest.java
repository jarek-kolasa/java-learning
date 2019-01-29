package personGeneratorTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Matchers.any;

import personGenerator.Person;
import personGenerator.PersonGenerator;
import personGenerator.SexType;

@RunWith(MockitoJUnitRunner.class)
public class PersonGeneratorTest {

	/**
	 * stworz klase osoba ktora bedzie miala nastapujuce pola a) imie - string b)
	 * nazwisko - string c) plec - enum (M lub K) d) metode"przedstawSie" Stworz
	 * liste 10 losowo generowanych osob Podziel ta liste wedlug: - plci -
	 * dlugosci nazwiska (dluzsze/krotsze niz 6 znakow) - pierwszej litery imienia
	 * (zaczynajace sie na samogloske/spogloske)
	 */

	Person person;

	SexType sex;

	@Mock
	private PersonGenerator personGenerator;
	
	@Before
	public void setUp() {
	person = new Person(personGenerator);
	}

	@Test
	public void check_if_the_person_name_is_string() {
		when(personGenerator.nameGenerator(sex)).thenReturn(person.getName());
	}
	
	@Test
	public void check_if_the_person_surname_is_string() {
		when(personGenerator.surnameGenerator(sex)).thenReturn(person.getSurname());
	}

	@Test
	public void check_sex_type_of_person() {
		when(personGenerator.sexGenerator()).thenReturn(sex);
	}

}
