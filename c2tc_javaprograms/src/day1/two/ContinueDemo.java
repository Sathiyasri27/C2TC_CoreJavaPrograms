package day1.two;

public class ContinueDemo {

	public static void main(String[] args) {
		for (int k = 4; k < 13; k++) {
		    if (k % 3 != 0)
		        continue;
		    System.out.print(k + " ");
		}
	}

}
