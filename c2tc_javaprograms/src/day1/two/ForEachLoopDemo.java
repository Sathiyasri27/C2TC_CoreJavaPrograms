package day1.two;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		int a[] = {5, 15, 25, 35, 45};
		for(int i : a) {
		    System.out.println(i);	
		}
		char ch[] = {'c', 'o', 'd', 'e'};
		for(char c : ch) {
		    System.out.print(c);		
		}
		System.out.println(" ");
		String s1[] = {"Learning", "Java", "Everyday"};
		for(String s : s1) {
		    System.out.print(s + " ");		
		}
		
		}

	}

}
