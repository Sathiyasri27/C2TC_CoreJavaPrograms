package day1.two;

public class OperatorsDemo {

	public static void main(String[] args) {
		int a = 15; 
		int b = 25;
		int x = 15;
		System.out.println("a and b value before the operations: " + a + " " + b);
		++a; 
		int c = ++a + b + a--;
		System.out.println("c value after the operations: " + c); 
		int d = c++ + a + b--; 
		System.out.println("d value after the operations: " + d);
		System.out.println("a , b, c, d values after the operations: " + a + " " + b + " " + c + " " + d);
		x = (15 == x) ? 1 : 0;
		System.out.println(x); 
	}

}
