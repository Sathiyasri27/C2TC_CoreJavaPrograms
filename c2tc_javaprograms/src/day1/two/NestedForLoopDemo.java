package day1.two;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		        int beg = 2;  
		        int end = 5;  
		        System.out.println("MULTIPLICATION TABLE GENERATOR");
		        System.out.println("Generating tables from " + beg + " to " + end + "\n");
		        for (int i = beg; i <= end; i++) {
		            System.out.println("Multiplication Table of " + i);
		            System.out.println("--------------------------------");

		            for (int j = 1; j <= 10; j++) {
		                int result = i * j;
		                System.out.printf("%2d × %2d = %3d%n", i, j, result);
		            }

		            System.out.println("--------------------------------\n");
		        }

		        System.out.println("All multiplication tables from " + beg + " to " + end + " have been successfully generated.");


	}

}
