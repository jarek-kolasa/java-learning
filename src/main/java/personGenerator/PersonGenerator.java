package personGenerator;

/**
 * stworz klase osoba ktora bedzie miala nastapujuce pola
 * a) imie - string
 * b) nazwisko - string
 * c) plec - enum (M lub K)
 * d) metode"przedstawSie"
 * Stworz liste 10 losowo generowanych osob
 * Podziel ta liste wedlug:
 * - plci
 * - dlugosci nazwiska (dluzsze/krotsze niz 6 znakow)
 * - pierwszej litery imienia (zaczynajace sie na samogloske/spogloske)
 */

public class PersonGenerator {
private String name;
private String surname;
private SexType sex;


public PersonGenerator(String name, String surname, SexType sex) {
	super();
	this.name  = nameGenerator();
	surname = surnameGenerator();
	this.sex = sexGenerator();
}


private SexType sexGenerator() {
	return Math.random() > 0.5 ? sex.W : sex.M;
}

private String nameGenerator() {
		// TODO Auto-generated method stub
		return null;
}

private String surnameGenerator() {
	// TODO Auto-generated method stub
	return null;
}


}
