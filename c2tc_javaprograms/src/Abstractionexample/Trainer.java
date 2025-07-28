package Abstractionexample;

public class Trainer extends Coder{
	@Override
	public void rules() //abstract method definition
	{
		System.out.println("Morning wakeup at "+wakeup);
		System.out.println("And check the student uploaded programs..");
	}

}
