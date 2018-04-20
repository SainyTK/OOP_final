import java.util.*;

public class QueueProducer implements Runnable
{
	Integer value;
	Queue<Integer> queue;

	public QueueProducer(Queue<Integer> q,Integer i)
	{
		value = i;
		queue = q;
	}

	public void run()
	{
		System.out.println("Put : " + value);
		queue.add(value);
	}
}