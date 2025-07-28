package Abstractionexample;

public class Student extends Coder{
	
	@Override
	public void rules() //abstract method definition
	{
		System.out.println("Morning wakeup at "+wakeup);
		System.out.println("And do the programs..");
	}

}
