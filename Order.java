// Order class is connected to the OrderSystem package.
package OrderSystem;

/* This class manages information about a single order. The system stores the following information: list of children in this order [the maximum number of children
in any given order is 5] and the number of children in the order at any given moment. */
public class Order {
	private Child[] Children;
	private int NumofChildren = 0;
	
	public void addChildtoOrder(Child c) {
		if (NumofChildren > 0 && NumofChildren < 5) {
			Child[] tempArray = Children;
			Children = new Child[++NumofChildren];
			
			for (int i = 0; i < NumofChildren; i++) {
				
				if (i == NumofChildren - 1) {
					Children[i] = c;
				}
				
				else {
					Children[i] = tempArray[i];
				}
			}
		}
		
		else if (NumofChildren == 0) {
			Children = new Child[++NumofChildren];
			Children[0] = c;
		}
	}
	
	public Child[] getChilds() {
		return Children;
	}
	
	public void removeChildfromOrder(Child c) {
		boolean inArray = false;
		
		for (int i = 0; i < NumofChildren; i++) {
			if (c == Children[i])
				inArray = true;
		}
		
		if (inArray) {
			int j = 0;
			Child[] tempArray = Children;
			Children = new Child[--NumofChildren];
			
			for (int i = 0; i <= NumofChildren; i++) {
				
				if (tempArray[i] == c) {
					continue;
				}
				
				else {
					Children[j] = tempArray[i];
					j++;
				}
			}
		}
	}
	
	public int getNumofChilds() {
		return NumofChildren;
	}
	
	public String toString() {
		return String.format("The order contains %d Childs", NumofChildren);
	}
}
