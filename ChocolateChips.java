//Joshua Molina
public class ChocolateChips extends ToppingsDecorator{
	//Private IceCream object that holds the sent-in instance of the ice cream that is being ordered
	private IceCream iceCream;
	
	//Constructor that requires an IceCream object
	public ChocolateChips(IceCream iC)
	{
		//Sets iceCream to the sent-in object
		iceCream = iC;
		//Changes the current descriptor to string for chocolate chips
		iceCream.description = iceCream.toString() + " + chocolate chips";
	}
	
	//Method used to return the information about the ice cream and the new descriptor for chocolate chips
	public String toString()
	{
		return iceCream.description;
	}
	
	//Method used to return the cost of the ice cream currently in addition to the cost of the chocolate chip topping
	public double getCost()
	{
		return iceCream.getCost() + 0.3;
	}
}
