public class TwoThread
{
	public static void main(String[] args)
	{
		SumThread s1 = new SumThread(1,5000);
		SumThread s2 = new SumThread(5001,10000);
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);

		try
		{
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		}
		catch(InterruptedException e){}
		

		System.out.println("Sum = " + (s1.getSum()+s2.getSum()));
	}
}