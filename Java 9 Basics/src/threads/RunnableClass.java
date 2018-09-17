package threads;

public class RunnableClass implements Runnable
{
	String thread;
	
	public RunnableClass(String thread)
	{
		this.thread = thread;
	}

	@Override
	public void run()
	{
		System.out.println(thread+" starting...");
		
		for(int i=0; i<10; i++)
		{
			try
			{
				Thread.sleep(400);
				System.out.println("In "+thread+" count is "+i+".");
			} 
			catch (InterruptedException e)
			{
				System.out.println("Thread interrupted at count "+i+".");
				e.printStackTrace();
			}
		}
		System.out.println(thread+" finished.");
	}

}
