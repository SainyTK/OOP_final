public class ThreadB implements Runnable
{
	public void run()
	{
		int i =0;
		while(i<10)
		{
			try{
				System.out.println("Hello B");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{

			}
			i++;
		}
		
	}
}