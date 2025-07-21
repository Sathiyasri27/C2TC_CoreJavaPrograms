package day1.entity;

public class CustomerDemo {

	public static void main(String[] args) {
		
		Customer c1= new Customer();
		c1.setCid(101);
		c1.setCname("Charm");
		c1.setCity("Puducherry");
		System.out.println(c1); //obj printing
//		System.out.println("Customer id:"+c1.getCid());
//		System.out.println("Customer name:"+c1.getCname());
//		System.out.println("Customer city:"+c1.getCity());
		
		Customer c2= new Customer();
		c2.setCid(102);
		c2.setCname("Sanjuu");
		c2.setCity("Chennai");
		System.out.println(c2);
		
		Customer c3= new Customer();
		c3.setCid(103);
		c3.setCname("Sri");
		c3.setCity("Cuddalore");
		System.out.println(c3); 
		
		Customer c4= new Customer();
		c4.setCid(104);
		c4.setCname("Sathiya");
		c4.setCity("Puducherry");
		System.out.println(c4); 

	}

}
