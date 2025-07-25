package dayfive;

public class Trainer extends Person {
	private String session;
	private String designation;
	private int batchNo;
	
	public Trainer(int pid, String name, String city,String session, String designation, int batchNo) {
		super(pid,name,city);
		this.session = session;
		this.designation = designation;
		this.batchNo = batchNo;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}
	@Override
	public String toString() {
		return "Trainer [Trainer id:"+super.getPid()+
				", Trainer Name:"+super.getName()+
				", Trainer City:"+super.getCity()+
				", session=" + session + ", designation=" + designation + ", batchNo=" + batchNo + "]";
	}

}
