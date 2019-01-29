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
	public String[] femaleNames = { "A", "B", "C", "D" };
	public String[] maleNames = { "E", "F", "G", "H" };
	public String[] femaleSurnames = { "I", "J", "K", "L" };
	public String[] maleSurnames = { "M", "N", "O", "P" };

	Random random = new Random();

	/*
	public Person introduceYourself() {
		sex = sexGenerator();
		return new Person(nameGenerator(sex), surnameGenerator(sex), sex);
	}
	*/

	public SexType sexGenerator() {
		return random.nextBoolean() == true ? SexType.W : SexType.M;
	}

	public String nameGenerator(SexType sex) {

		return sex == SexType.W ? getFemaleName() : getMaleName();
	}

	public String surnameGenerator(SexType sex) {
		return sex == SexType.W ? getFemaleSurname() : getMaleSurname();
	}

	private String getFemaleName() {
		return femaleNames[random.nextInt(femaleNames.length)];
	}

	private String getMaleName() {
		return maleNames[random.nextInt(maleNames.length)];
	}

	private String getFemaleSurname() {
		return femaleSurnames[random.nextInt(femaleSurnames.length)];
	}

	private String getMaleSurname() {
		return maleSurnames[random.nextInt(maleSurnames.length)];
	}

	
}
