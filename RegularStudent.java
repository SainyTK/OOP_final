public class RegularStudent extends Student
{
	public RegularStudent(String name, int age,int numberOfCredit)
	{
		super(name,age,numberOfCredit);
	}

	public double calculateTuition()
	{
		return this.getNumberOfCredit()*1000;
	}
}