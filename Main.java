import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args)
	{
		ModulusGUI m = new ModulusGUI();
		

	}

	public static double sumAreaIfZoom(List<Shape> shapes,double factor)
	{
		double sum = 0;
		for(Shape s:shapes)
		{
			s.zoom(factor);
			sum += s.getArea();
		}
		return sum;
	}
}