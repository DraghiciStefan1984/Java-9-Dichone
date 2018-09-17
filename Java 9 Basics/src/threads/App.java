package threads;

public class App
{
	public static void main(String[] args)
	{
		RunnableClass runnableClass1=new RunnableClass("Secondary thread");
		RunnableClass runnableClass2=new RunnableClass("Ternary thread");
		runnableClass1.run();
		runnableClass2.run();
	}
}