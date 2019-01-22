package personGenerator;

public class Person {

	private String name;
	private String surname;
	private SexType sexType;
	
	

	public Person(String name, String surname, SexType sexType) {
		this.name = name;
		this.surname = surname;
		this.sexType = sexType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public SexType getSexType() {
		return sexType;
	}

	public void setSexType(SexType sexType) {
		this.sexType = sexType;
	}

}
