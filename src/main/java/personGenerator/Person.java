package personGenerator;

public class Person {

	private String name;
	private String surname;
	private SexType sexType;

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public SexType getSexType() {
		return sexType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setSexType(SexType sexType) {
		this.sexType = sexType;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", sexType=" + sexType + "]";
	}

}
