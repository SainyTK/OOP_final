import java.util.*;
import java.lang.Comparable;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Student> stdList = new ArrayList<Student>();
		stdList.add(new InternationalStudent("AA",20,20,"A01"));
		stdList.add(new InternationalStudent("AA",20,20,"A01"));
		stdList.add(new InternationalStudent("X",20,20,"A01"));
		stdList.add(new InternationalStudent("C",20,20,"A01"));

		stdList.add(new RegularStudent("DD",15,18));
		stdList.add(new RegularStudent("qD",15,18));
		stdList.add(new RegularStudent("rD",15,18));
		stdList.add(new RegularStudent("eD",15,18));
		stdList.add(new RegularStudent("zD",15,18));

		for(Student s:stdList)
			System.out.println(s.getName());

		System.out.println("After Sort");

		Collections.sort(stdList);

		for(Student s:stdList)
			System.out.println(s.getName());

	}


}