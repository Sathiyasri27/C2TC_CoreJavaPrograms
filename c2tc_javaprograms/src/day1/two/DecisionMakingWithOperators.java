package day1.two;

public class DecisionMakingWithOperators {

	public static void main(String[] args) {
		int x = 5, y = 9;
		int a = 12, b = 12;
		if (x >= y) {
		    System.out.println("true");
		} else {
		    System.out.println("false");
		}
		if (!(a < b) || (a == b)) {
		    System.out.println("Condition is TRUE");
		} else {
		    System.out.println("Condition is FALSE");
		}

	}
}
