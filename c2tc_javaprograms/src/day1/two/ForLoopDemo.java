package day1.two;

public class ForLoopDemo {

	public static void main(String[] args) {
		System.out.println(" Ascending Order ");
		for (int i = 1; i <= 1000; i += 100) {
		    System.out.println("Current value of i: " + i);
		}

		System.out.println("\n Descending Order ");
		for (int i = 1000; i >= 1; i -= 100) {
		    System.out.println("Current value of i: " + i);
		}
	}

}
