package entityclassassignment2;

public class ProductDemo {
		private int pid;
		private String pname;
		private String price;
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "ProductDemo [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
		}

	}
