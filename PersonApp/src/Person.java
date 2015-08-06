import java.util.ArrayList;


public class Person {
	private String name;
	private ArrayList<Person> children;
	
	public Person(){
		this.children = new ArrayList<Person>();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Person> children) {
		this.children = children;
	}
	public void addChild(Person child)
	{
		this.children.add(child);
	}
}
