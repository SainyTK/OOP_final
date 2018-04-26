public class NewCircle extends Shape implements Zoomable
{
	private double radius;

	public NewCircle(String name, double radius)
	{
		super(name);
		this.radius = radius;
	}

	public double getArea()
	{
		return Math.PI*radius*radius*factor;
	}

}