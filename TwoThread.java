import java.util.*;

public class TwoThread
{
	public static void main(String[] args)
	{
		SumThread s1 = new SumThread(1,1000);
		SumThread s2 = new SumThread(1001,10000);
		try
		{
			s1.start();
			s2.start();
			s1.join();
			s2.join();
			System.out.println("Sum = " + s1.getSum()+s2.getSum());
		}catch(InterruptedException e){}
	}

	public static class SumThread extends Thread
	{
		private int start;
		private int end;
		private int sum;

		public SumThread(int start,int end)
		{
			this.start = start;
			this.end = end;
			this.sum = 0;
		}

		public void run()
		{
			for(int i=start;i<=end;i++)
			{
				sum+=i;
			}
		}

		public int getSum()
		{
			return sum;
		}
	}
}