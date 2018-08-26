package oop;

public class Ball
{
	private String ballName;
	private int ballSize;
	
	public void setupBall()
	{
		new OrangeBall().setupBall();
	}
	
	class OrangeBall
	{
		public void setupBall()
		{
			ballName="ballName inside inner class OrangeBall";
			ballSize=23;
			System.out.println(ballName);
		}
	}
}
