package day1.one;

public class TypeCastingDemo {

	public static void main(String[] args) {
		byte b = 25; 
		int i = b;
		System.out.println(i);
		float f = 45.67f;
		double d = f;
		System.out.println(d);
		char ch = 'B';
		int i3 = ch;
		System.out.println(i3);
		char var1 = '\u00AE';
		int i4 = var1;
		System.out.println(i4);
		double f1 = 20.78f;
		long l = (long) f1;
		System.out.println(l);
		long l1 = 823372036854775806l;
		int i2 = (int) l1;
		System.out.println(i2);
		float f2 = 78.99f;
		int i1 = (int) f2;
		System.out.println(i1);
		byte b1 = 65;
		char ch1 = (char) b1;
		System.out.println(ch1);
	}

}
