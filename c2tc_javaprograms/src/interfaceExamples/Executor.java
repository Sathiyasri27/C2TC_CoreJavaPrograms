package interfaceExamples;

public class Executor {
	public static void main(String[] args) {
		
		//College reference
		College c1;
		
		//Object create for cse students
		c1=new CseStudents();
		c1.session();
		
		//Object create for it students
		c1=new ItStudents();
		c1.session();
		
	}

}
