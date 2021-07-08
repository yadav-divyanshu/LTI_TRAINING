
public class Day1Assignment5 {
	public static void main(String[] args) {
		Account ac = new Account(101,5000,123);
		ac.displayAccount();
		
	}

}
class Account{
	int accountNo;
	double accountBalance;
	int accountPassword;
	public Account(int accountNo, double accountBalance, int accountPass){
		this.accountNo=accountNo;
		this.accountBalance=accountBalance;
		this.accountPassword=accountPass;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(int accountPassword) {
		this.accountPassword = accountPassword;
	}
	void displayAccount()
	{
		System.out.println("Account number is "+accountNo);
		System.out.println("Balance amount is the account is "+accountBalance);
		System.out.println("Account password is "+accountPassword);
	}
	
	
}


