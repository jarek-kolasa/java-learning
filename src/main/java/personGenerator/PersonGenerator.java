package personGenerator;

import java.util.Random;

/**
 * stworz klase osoba ktora bedzie miala nastapujuce pola a) imie - string b)
 * nazwisko - string c) plec - enum (M lub K) d) metode"przedstawSie" Stworz
 * liste 10 losowo generowanych osob Podziel ta liste wedlug: - plci - dlugosci
 * nazwiska (dluzsze/krotsze niz 6 znakow) - pierwszej litery imienia
 * (zaczynajace sie na samogloske/spogloske)
 */

public class PersonGenerator {
	private String[] femaleNames = { "A", "B", "C", "D" };
	private String[] maleNames = { "E", "F", "G", "H" };
	private String[] femaleSurnames = { "I", "J", "K", "L" };
	private String[] maleSurnames = { "M", "N", "O", "P" };
	private SexType sex;
	private Person person;

	Random random = new Random();

	public Person introduceYourself() {
		sex = sexGenerator();
		return new Person(nameGenerator(sex), surnameGenerator(sex), sex);
	}

	private SexType sexGenerator() {
		return random.nextBoolean() == true ? sex.W : sex.M;
	}

	private String nameGenerator(SexType sex) {

		return sex == SexType.W ? getFemaleName() : getMaleName();
	}

	private String surnameGenerator(SexType sex) {
		return sex == SexType.W ? getFemaleSurname() : getMaleSurname();
	}

	public String getFemaleName() {
		return femaleNames[random.nextInt(femaleNames.length)];
	}

	public String getMaleName() {
		return maleNames[random.nextInt(maleNames.length)];
	}

	public String getFemaleSurname() {
		return femaleSurnames[random.nextInt(femaleSurnames.length)];
	}

	public String getMaleSurname() {
		return maleSurnames[random.nextInt(maleSurnames.length)];
	}

	
}
