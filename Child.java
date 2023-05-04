// Child class is connected to the OrderSystem package.
package OrderSystem;

/* The class manages information about a single child. The system stores the following information: Child name, Child age, Child list of toys, and Child number
of toys. */
public class Child {
	private String childName;
	private int childAge; 
	private int numberOfToys = 0;
	private Toy[] childToy;
	
	public Child(String childName, int childAge, Toy[] childToy) {
		this.childName = childName;
		this.childAge = childAge;
		
		if (childToy == null) {
			this.childToy = null;
			numberOfToys = 0;
		}
		
		else {
			this.childToy = new Toy[childToy.length];
			for (int i = 0; i < childToy.length; i++)
				this.childToy[i] = new Toy(childToy[i]);
			numberOfToys = childToy.length;
		}
	}
	
	public Child(Child other) {
		this(other.childName, other.childAge, other.childToy);
	}

	public String getChildName() {
		return childName;
	}
	
	public void setChildName(String name) {
		childName = name;
	}

	public int getChildAge() {
		return childAge;
	}
	
	public void setChildAge(int age) {
		childAge = age;
	}

	public int getNumberofToys() {
		return numberOfToys;
	}
	
	public Toy[] getChildToy() {
		return childToy;
	}
	
	public void setChildToy(Toy[] t) {
		childToy = t;
		numberOfToys = t.length;
	}
	
	public void disposeToys() {
		childToy = null;
		numberOfToys = 0;
	}
	
	public void donate(Child c) {
		Toy[] newArray = new Toy[numberOfToys + c.numberOfToys];
		
		for (int i = 0; i < c.numberOfToys; i++) {
			newArray[i] = c.getChildToy()[i];
		}
		
		for (int i = 0; i < numberOfToys; i++) {
			newArray[i + c.numberOfToys] = childToy[i];
		}
		
		childToy = null;
		numberOfToys = 0;
		
		c.setChildToy(newArray);
	}
	
	public String toString() {
		return String.format("Child [%s] of age <%d> has (%d) toys", childName, childAge, numberOfToys);
	}
}
