//Joshua Molina
public abstract class IceCream {
	//Protected string variable that will be used to keep track of the descriptors of the ice cream
	protected String description;
	
	//Abstract classes that return a string for the description and a double for the cost of the ice cream respectively
	public abstract String toString();
	public abstract double getCost();
}