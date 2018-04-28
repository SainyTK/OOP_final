public class TestThread
{
	public static void main(String[] args)
	{
		ThreadA ta = new ThreadA();
		Thread tb = new Thread(new ThreadB());
		try
		{
			ta.start();
			ta.join();
			tb.start();
			tb.join();
		}catch(InterruptedException e)
		{}
		
	}
}