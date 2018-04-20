public class InternationalStudent extends Student
{
	private String visaID;

	public InternationalStudent(String name, int age, int numberOfCredit,String visaID)
	{
			super(name,age,numberOfCredit);
			this.visaID = visaID;
	}

	public String getVisaID()
	{
		return visaID;
	}

	public void setVisaId(String visaID)
	{
		this.visaID = visaID;
	}

	public double calculateTuition()
	{
		return this.getNumberOfCredit()*1000;
	}
}