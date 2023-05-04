// Toy class is connected to the OrderSystem package.
package OrderSystem;

/* This class manages information about a single toy. The system stores the following information: Toy ID, Toy name, Toy quantity (the quantity of this toy that
child owns), and Toy price */
public class Toy {
	private int toyID, toyQuantity;
	private String toyName;
	private double toyPrice;
	
	public Toy(int toyID, String toyName, int toyQuantity, double toyPrice) {
		this.toyID = toyID;
		this.toyName = toyName;
		this.toyQuantity = toyQuantity;
		this.toyPrice = toyPrice;
	}
	
	public Toy(Toy other) {
		this(other.toyID, other.toyName, other.toyQuantity, other.toyPrice);
	}

	public int getToyID() {
		return toyID;
	}

	public void setToyID(int toyID) {
		this.toyID = toyID;
	}

	public int getToyQuantity() {
		return toyQuantity;
	}

	public void setToyQuantity(int toyQuantity) {
		this.toyQuantity = toyQuantity;
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public double getToyPrice() {
		return toyPrice;
	}

	public void setToyPrice(double toyPrice) {
		this.toyPrice = toyPrice;
	}
	
	public String getToyInformation() {
		return String.format("Toy(%d,%s), quantity(%d) with $(%6.2f)/toy", toyID, toyName, toyQuantity, toyPrice);
	}
}
