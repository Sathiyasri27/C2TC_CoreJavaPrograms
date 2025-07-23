package daythree.basic;

public class Customer {
	private String cname;
	 private int cid;
	 private String city;

	public Customer() {
		System.out.println("Default Constructor");
	}
	
	public Customer(String cname, int cid, String city) {
		
		this(102,"puducherry");
		System.out.println("Parameterized Constructor");
		this.cname = cname;
		this.cid = cid;
		this.city = city;
	}
     public Customer(int cid, String city) {
		System.out.println("Parameterized Constructor");
		this.cid = cid;
		this.city = city;
	}

	 @Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", city=" + city + "]";
	}

	 public String getCname() {
		 return cname;
	 }

	 public void setCname(String cname) {
		 this.cname = cname;
	 }

	 public int getCid() {
		 return cid;
	 }

	 public void setCid(int cid) {
		 this.cid = cid;
	 }

	 public String getCity() {
		 return city;
	 }

	 public void setCity(String city) {
		 this.city = city;
	 }



	

}
