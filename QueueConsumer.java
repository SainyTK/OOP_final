import java.util.*;

public class QueueConsumer implements Runnable
{
	Integer value;
	Queue<Integer> queue;

	public QueueConsumer(Queue<Integer> q)
	{
		value = q.peek();
		queue = q;
	}

	public void run()
	{
		System.out.println("Got : " + value);
		queue.remove();
	}
}