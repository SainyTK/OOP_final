public class SumThread implements Runnable
{
	private int start;
	private int finish;
	private int sum;

	public SumThread(int start,int finish)
	{
		this.start = start;
		this.finish = finish;
		sum = 0;
	}

	public void run()
	{
		for(int i=start;i<=finish;i++)
		{
			sum+=i;
		}
	}

	public int getSum()
	{
		return sum;
	}
}