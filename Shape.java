public abstract class Shape implements Zoomable
{
	private String name;
	protected double factor;

	public Shape(String name)
	{
		this.name = name;
		factor =1 ;
	}

	public String getName()
	{
		return name;
	}

	abstract double getArea();

	public void zoom(double factor)
	{
		this.factor = factor;
	}

	public void reset()
	{
		factor = 1;
	}
}