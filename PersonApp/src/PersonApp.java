import java.util.ArrayList;

public class PersonApp {

	public static void main(String[] args) {
		Person homer = new Person();
		homer.setName("Homer"); 

		//add a collection of children as once
		ArrayList<Person> kids = new ArrayList<Person>();
		Person lisa = new Person();
		lisa.setName("Lisa");
		Person bart = new Person();
		bart.setName("Bart");
		
		homer.setChildren(kids);
		
		//list homer's children
		ArrayList<Person> children = homer.getChildren();
		for (Person p: children)
		{
			System.out.println(p.getName());
		}
		
		//bart now has a kid....
		Person jr = new Person();
		jr.setName("Bart Jr.");
		bart.addChild(jr);
		
		//list Bart's child
		ArrayList<Person> morekids = new ArrayList<Person>();
		morekids = bart.getChildren();
		for (Person p: morekids)
		{
			System.out.println(p.getName());
		}
	}

}
