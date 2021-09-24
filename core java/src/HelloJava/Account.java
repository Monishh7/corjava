package HelloJava;

public class Account {
	private static final char[] setAccounttype = null;
	private static final char[] setNumber = null;
	private static final char[] deposit = null;
	private String number;
	private String accounttype;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number ) {
		this.number = number;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit (double d) {
		d=balance+d;
	}
	public void withdrawl (double w) {
		w=balance-w;
	}
	public static void main(String[] args ) {
		Account a=new Account();
		a.setNumber("123456721");
		a.setBalance(100);
		a.setAccounttype("savings");
		a.deposit(10);
		a.withdrawl(5);
		
		System.out.println(a.accounttype);
		System.out.println(a.number);
		
		

		
		}
	public static char[] getDeposit() {
		return deposit;
	}
	public static char[] getSetnumber() {
		return setNumber;
	}
	public static char[] getSetaccounttype() {
		return setAccounttype;
	}
	


}
