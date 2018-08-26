package oop;

public class App
{
	public static void main(String[] args)
	{
		Dog dog=new Dog();
		dog.setName("Fido");
		System.out.println(dog.getName());
		dog.beFriendly();
		dog.play();
		
		Ball ball=new Ball();
		ball.setupBall();
	}
}