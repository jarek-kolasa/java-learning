package personGenerator.generators;

import personGenerator.Person;
import personGenerator.PersonSet;
import personGenerator.SexType;

/**
 * stworz klase osoba ktora bedzie miala nastapujuce pola a) imie - string b)
 * nazwisko - string c) plec - enum (M lub K) d) metode"przedstawSie" Stworz
 * liste 10 losowo generowanych osob Podziel ta liste wedlug: - plci - dlugosci
 * nazwiska (dluzsze/krotsze niz 6 znakow) - pierwszej litery imienia
 * (zaczynajace sie na samogloske/spogloske)
 */

public class PersonGenerator implements PersonSet{
	public String[] femaleNames = { "A", "B", "C", "D" };
	public String[] maleNames = { "E", "F", "G", "H" };
	public String[] femaleSurnames = { "I", "J", "K", "L" };
	public String[] maleSurnames = { "M", "N", "O", "P" };
	public SexType sexType;

	public Person generatePerson() {
		Person person = new Person();

		SexTypeGenerator sexTypeGenerator = new SexTypeGenerator();
		sexType = sexTypeGenerator.sexGenerator();

		NameGenerator nameGenerator = new NameGenerator(sexType, femaleNames, maleNames);
		SurnameGenerator surnameGenerator = new SurnameGenerator(sexType, femaleSurnames, maleNames);

		person.setSexType(sexType);
		person.setName(nameGenerator.nameGenerator());
		person.setSurname(surnameGenerator.surnameGenerator());
		return person;
	}

}
