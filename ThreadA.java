public class ThreadA extends Thread
{
	public void run()
	{
		int i=0;
		while(i<10)
		{
			try{
				System.out.println("Hello A");
				this.sleep(1000);
			}
			catch(InterruptedException e)
			{

			}
			i++;
		}
		
	}
}