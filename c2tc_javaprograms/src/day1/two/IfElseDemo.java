package day1.two;

public class IfElseDemo {

	public static void main(String[] args) {
		 int age = 17;
	        System.out.println("Voting Eligibility Check");
	        if (age >= 18) {
	            System.out.println("You are eligible to vote.");
	            System.out.println("Please ensure you have a valid Voter ID card with you.");
	            System.out.println("Participating in elections is your right and responsibility.");
	        } else if (age >= 13 && age < 18) {
	            System.out.println("You are a teenager and will be eligible to vote in a few years.");
	            System.out.println("Meanwhile, learn about your country's election system and citizen rights.");
	        } else {
	            System.out.println("You are not eligible to vote currently.");
	            System.out.println("But stay curious and keep learning about civic duties.");
	        }

	        System.out.println("\nProgram ended: Demonstration of if-else-if statement in Java.");
	}

}
