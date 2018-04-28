public class HourlyEmployee extends Employee
{
	private int wages;

	public HourlyEmployee(String name,int wages)
	{
		super(name);
		this.wages = wages;
	}

	public String toString()
	{
		return super.toString() + " wages = " + this.wages; 
	}
}