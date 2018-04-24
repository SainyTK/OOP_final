import java.util.*;

public class TestThread
{
	public static void main(String[] args)
	{
		SyncQueue<Integer> sq = new SyncQueue<Integer>();

		Thread p = new Thread(new Producer(sq));
		Thread c = new Thread(new Consumer(sq));

		p.start();
		c.start();
	}

	public static class SyncQueue<DataType>
	{
		public LinkedList<DataType> l;
		private boolean available = false;

		public SyncQueue()
		{
			l = new LinkedList<DataType>();
		}

		public synchronized void add(DataType x)
		{
			while(available==true)
			{
				try
				{
					wait();
				}catch(InterruptedException ie){}
			}
			l.addLast(x);
				available=true;
			System.out.println("Put!");
			System.out.println("current list : " + this); 
			notifyAll();
		}

		public synchronized DataType remove()
		{
			while(available==false)
			{
				try
				{
					wait();
				}catch(InterruptedException ie){}
			}
			DataType first = l.removeFirst();
				available=false;
			System.out.println("Get : " + first);
			notifyAll();

			return first;
		}

		public String toString()
		{
			String s = "";
			for(DataType i:l)
				s = s+i+" ";
			return s;
		}
	}

	public static class Consumer implements Runnable
	{
		private SyncQueue<Integer> sq;

		public Consumer(SyncQueue<Integer> syncQueue)
		{
			sq = syncQueue;
		}

		public void run()
		{
			while(true)
			{
				sq.remove();
			}
			
		}
	}

	public static class Producer implements Runnable
	{
		private SyncQueue<Integer> sq;
		private boolean available;

		public Producer(SyncQueue<Integer> syncQueue)
		{
			sq = syncQueue;
			available = true;
		}

		public void run()
		{
			while(true)
			{
				Integer r = (int)(Math.random()*20+1);
				sq.add(r);
				sleep(2000);
			}
		}
	}
	
	public static void sleep(long t)
	{
		try{
				Thread.sleep(t);
			}catch(InterruptedException e){}
	}
}	