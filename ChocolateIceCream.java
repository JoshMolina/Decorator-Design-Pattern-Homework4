//Joshua Molina
public class ChocolateIceCream extends IceCream{
	
	//Default constructor that initially sets the description of the ice cream
	public ChocolateIceCream()
	{
		//Sets the instance of description to "Chocolate Ice Cream"
		this.description = "Chocolate Ice Cream";
	}
	
	//Inherited method used to return a string of whatever the description is
	public String toString()
	{
		return description;
	}
	
	//Inherited method used to return a double value for the cost
	public double getCost()
	{
		return .9;
	}
}
