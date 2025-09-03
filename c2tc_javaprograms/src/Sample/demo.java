package Sample;

public class demo {
	public static void main(String[] args) {
		CThread obj=new CThread(7,"a");
		obj.setName("Mainthread");
		obj.start();
	}

}
