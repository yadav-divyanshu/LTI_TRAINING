class Account{
    private double accNo;
    private double accBal;
    private String accPassword;
    public static String bankName="SBI";
	public double getAccNo() {
		return accNo;
	}
	public void setAccNo(double accNo) {
		this.accNo = accNo;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public String getAccPassword() {
		return accPassword;
	}
	public void setAccPassword(String accPassword) {
		this.accPassword = accPassword;
	}
	public static String getBankName() {
		return bankName;
	}
	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}
    
	public Account(double accNo, double accBal, String accPassword) {
		super();
		this.accNo = accNo;
		this.accBal = accBal;
		this.accPassword = accPassword;
	}
	void displayAccount() {
		System.out.println("BANK NAME : "+ bankName);
		System.out.println("ACNO : "+accNo);
		System.out.println("BAL  : "+accBal);
		System.out.println("PASS  : "+accPassword);
	}
    
}
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to bank...");
		Account ac = new Account(12345, 54321, "helloworld");
		ac.displayAccount();
		

	}

}
