package Sample;

public class CThread extends Thread{
	private int n;
	private String msg;
	
	public CThread(int n,String msg) {
		this.n=n;
		this.msg=msg;
	}
	public void run() {
		for(int i=0;i<n;i++) {
			try {
				Thread.sleep(300);
			}
			catch(InterruptedException e) {
				System.err.println("the interrupted thread "+e.getMessage());
			}System.out.println(msg+i+""+Thread.currentThread().getName());
		}
	}

}
