package day4.thridpackage;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
		MyClass m=MyClass.getObject();
		m.setId(50);
		
		MyClass m1=MyClass.getObject();
		
		System.out.println(m);
		System.out.println(m1);

	}

}
