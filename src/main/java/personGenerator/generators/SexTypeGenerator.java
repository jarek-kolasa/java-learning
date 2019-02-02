package personGenerator.generators;

import java.util.Random;

import personGenerator.SexType;

public class SexTypeGenerator {
	
	public SexType sexGenerator() {
		return new Random().nextBoolean() == true ? SexType.W : SexType.M;
	}

}
