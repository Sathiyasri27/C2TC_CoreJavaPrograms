package entityclassassignment1;

public class MainProgram {
	public static void main(String[] args) {
		StudentDetails s1= new StudentDetails();
		s1.setId(101);
		s1.setName("Charm");
		s1.setDepartment("CSE");
		System.out.println(s1);
		
		StudentDetails s2= new StudentDetails();
		s2.setId(102);
		s2.setName("Samuu");
		s2.setDepartment("IT");
		System.out.println(s2);
		
		StudentDetails s3= new StudentDetails();
		s3.setId(102);
		s3.setName("Sanjuu");
		s3.setDepartment("IT");
		System.out.println(s3);
	}
}
