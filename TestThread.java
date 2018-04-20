import java.util.*;

public class TestThread
{
	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<Integer>();

		for(int i=0;i<5;i++)
		{
			Thread t = new Thread(new QueueProducer(q,i));
			t.start();
			try
			{
				t.join();
				Thread t2 = new Thread(new QueueConsumer(q));
				t2.start();
				// t2.join();
			}
			catch(InterruptedException ie)
			{
				System.out.println("Interrupted");
			}
			
		}

		System.out.println("Terminated");
	}
		
}