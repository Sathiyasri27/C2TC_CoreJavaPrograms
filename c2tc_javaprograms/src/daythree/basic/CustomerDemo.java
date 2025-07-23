package daythree.basic;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		System.out.println(c1);
		
		Customer c2=new Customer("sathiya",102,"py");
		System.out.println(c2);
		
		Customer c3=new Customer(103,"chennai");
		System.out.println(c3);

	}

}
