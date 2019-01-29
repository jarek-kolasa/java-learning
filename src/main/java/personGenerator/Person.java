package personGenerator;

public class Person {

	private String name;
	private String surname;
	private SexType sexType;

	public Person(PersonGenerator personGenerator) {
		personGenerator = new PersonGenerator();
		
		this.sexType = personGenerator.sexGenerator();
		this.name = personGenerator.nameGenerator(sexType);
		this.surname = personGenerator.surnameGenerator(sexType);
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public SexType getSexType() {
		return sexType;
	}

}
