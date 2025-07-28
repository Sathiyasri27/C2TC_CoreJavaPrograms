package Abstractionexample;

public abstract class Coder {
	protected static final String wakeup="5 Am";
	
	//abstract method should be declared in the abstract class and define in the derived class
	abstract public void rules();
	
	//Concrete method
	public void show() {
		System.out.println("To become a coder, Early morning practical needed");
	}
	
}
