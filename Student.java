public abstract class Student implements Comparable<Student>
{
	private String name;
	private int age;
	private int numberOfCredit;

	public Student(String name, int age, int numberOfCredit)
	{
			this.name = name;
			this.age = age;
			this.numberOfCredit = numberOfCredit;
	}

	protected String getName()
	{
			return name;
	}

	protected int getNumberOfCredit()
	{
			return numberOfCredit;
	}

	public abstract double calculateTuition();

	public int compareTo(Student st)
	{
		return name.compareTo(st.getName());
	}
}