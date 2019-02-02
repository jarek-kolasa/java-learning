package personGenerator.generators;

import java.util.Random;

import personGenerator.SexType;

public class NameGenerator {

	String[] femaleNames;
	String[] maleNames;
	SexType sex;

	public NameGenerator(SexType sexType, String[] femaleNames, String[] maleNames) {
		super();
		this.femaleNames = femaleNames;
		this.maleNames = maleNames;
		this.sex = sexType;
	}

	public String nameGenerator() {

		return sex == SexType.W ? getFemaleName() : getMaleName();
	}

	private String getFemaleName() {
		return femaleNames[new Random().nextInt(maleNames.length)];
	}

	private String getMaleName() {
		return maleNames[new Random().nextInt(maleNames.length)];
	}

}
