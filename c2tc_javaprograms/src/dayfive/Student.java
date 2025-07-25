package dayfive;

public class Student extends Person{
	private int uid;
	private String courseName;
	
	public Student(int pid, String name,String city,int uid, String courseName) {
		super(pid,name,city);
		this.uid = uid;
		this.courseName = courseName;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Student [Student id:"+super.getPid()+", Student city:"+super.getCity()+", uid=" + uid +", courseName=" + courseName + "]";
	}
	

}
