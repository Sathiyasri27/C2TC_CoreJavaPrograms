package dayeight.interfaces.implementinginterfaces;

public class Account {
	private int accNo;
	 private String name;
	 private double balance;
	 private String bank;

	 public Account(int accNo, String name, double balance, String  bank) {
	     this.accNo = accNo;
	     this.name = name;
	     this.balance = balance;
	     this.bank = bank;
	 }

	 public int getAccNo() {
	     return accNo;
	 }

	 public String getName() {
	     return name;
	 }

	 public double getBalance() {
	     return balance;
	 }

	 public Bank getBank() {
	     return bank;
	 }

	 public void deposit(double amount) {
	     bank.deposit(this, amount);
	 }

	 public void withdraw(double amount) {
	     bank.withdraw(this, amount);
	 }

	 
	 public void setAccNo(int accNo) {
		this.accNo = accNo;

}
