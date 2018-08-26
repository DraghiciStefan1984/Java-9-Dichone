package generics;

public class App
{
	public static void main(String[] args)
	{
		Login<String> login1=new Login<String>("name", "pass");
		
		Login<Integer> login2=new Login<Integer>(2, 54513);
	}
}