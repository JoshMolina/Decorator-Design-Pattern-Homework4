//Joshua Molina
public class Sprinkles extends ToppingsDecorator{
	//Private IceCream object that holds the sent-in instance of the ice cream that is being ordered
	private IceCream iceCream;
	
	//Constructor that requires an IceCream object
	public Sprinkles(IceCream iC)
	{
		//Sets iceCream to the sent-in object
		iceCream = iC;
		//Changes the current descriptor to string for sprinkles
		iceCream.description = iceCream.toString() + " + sprinkles";
	}
	
	//Method used to return the information about the ice cream and the new descriptor for sprinkles
	public String toString()
	{
		return iceCream.description;
	}
	
	//Method used to return the cost of the ice cream currently in addition to the cost of the sprinkles topping
	public double getCost()
	{
		return iceCream.getCost() + 0.2;
	}
}
