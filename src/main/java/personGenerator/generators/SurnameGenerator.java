package personGenerator.generators;

import java.util.Random;

import personGenerator.SexType;

public class SurnameGenerator {

	String[] femaleSurnames;
	String[] maleSurnames;
	SexType sex;

	public SurnameGenerator(SexType sexType, String[] femaleSurnames, String[] maleSurnames) {
		super();
		this.sex = sexType;
		this.femaleSurnames = femaleSurnames;
		this.maleSurnames = maleSurnames;
	}

	public String surnameGenerator() {

		return sex == SexType.W ? getFemaleSurname() : getMaleSurname();
	}

	private String getFemaleSurname() {
		return femaleSurnames[new Random().nextInt(femaleSurnames.length)];
	}

	private String getMaleSurname() {
		return maleSurnames[new Random().nextInt(maleSurnames.length)];
	}
}
