//Joshua Molina
public class VanillaIceCream extends IceCream{
	
	//Default constructor that initially sets the description of the ice cream
	public VanillaIceCream()
	{
		//Sets the initial description to Vanilla Ice Cream
		this.description = "Vanilla Ice Cream";
	}
	
	//Inherited method used to return a string of whatever the description is
	public String toString()
	{
		return description;
	}
	
	//Inherited method used to return a double value for the cost
	public double getCost()
	{
		return .75;
	}
}
