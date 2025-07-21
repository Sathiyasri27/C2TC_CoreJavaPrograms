package day1.entity;

public class CustomerDemo {

	public static void main(String[] args) {
		int m,n;
		m=100;
		
		Customer c1= new Customer();
		c1.cid=101;
		c1.cname="Charm";
		c1.city="Puducherry";
		System.out.println("Customer id:"+c1.cid);
		System.out.println("Customer name:"+c1.cname);
		System.out.println("Customer city:"+c1.city);
		
		Customer c2= new Customer();
		c2.cid=102;
		c2.cname="Sanjuu";
		c2.city="Chennai";
		System.out.println("Customer id:"+c2.cid);
		System.out.println("Customer name:"+c2.cname);
		System.out.println("Customer city:"+c2.city);

	}

}
