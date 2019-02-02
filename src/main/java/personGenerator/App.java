package personGenerator;

import java.util.ArrayList;
import java.util.List;

import personGenerator.generators.PersonGenerator;

public class App {
	
		
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		PersonGenerator personGenerator = new PersonGenerator();
		
		
		people.add(personGenerator.generatePerson());
		people.add(personGenerator.generatePerson());
		people.add(personGenerator.generatePerson());

System.out.println(people.size());
System.out.println(people.get(0).toString());
System.out.println(people.get(1).toString());
System.out.println(people.get(2).toString());
		
	}

}
