//Joshua Molina
public class StrawberryIceCream extends IceCream{
	
	//Default constructor that initially sets the description of the ice cream
	public StrawberryIceCream()
	{
		//Sets the instance of description to "Strawberry Ice Cream"
		this.description = "Strawberry Ice Cream";
	}
	
	//Inherited method used to return a string of whatever the description is
	public String toString()
	{
		return "Strawberry Ice Cream";
	}
	
	//Inherited method used to return a double value for the cost
	public double getCost()
	{
		return .8;
	}
}
