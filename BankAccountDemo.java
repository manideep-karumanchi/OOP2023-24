abstract class BankAccount{
	String accNo, branch, ifsc, address;
	double bal;
	BankAccount(String accNo, String branch, String ifsc, String address, double bal){
		this.accNo = accNo;
		this.branch = branch;
		this.ifsc = ifsc;
		this.address = address;
		this.bal = bal;
	}
	void deposit(double amt){
		bal = bal + amt;
	}
	double checkBalance(){
		return bal;
	}
	abstract double withdraw(double withdraw);
}
class SavingsBankAccount extends BankAccount{
	String accHName;
	double ir, minbal;
	SavingsBankAccount(String accNo, String branch, String ifsc, String address, double bal, String accHName, double ir, double minbal){
		super(accNo, branch, ifsc, address, bal);
		this.accHName = accHName;
		this.ir = ir;
		this.minbal = minbal;
	}
	double withdraw(double amt){
		if(bal-amt > minbal){
			bal -= amt;
			return amt;
		}
		else{
			return 0.0;
		}
	}
}
class CurrentBankAccount extends BankAccount{
	String organizationName;
	double odlimit;
	CurrentBankAccount(String accNo, String branch, String ifsc, String address, double bal, String organizationName, double odlimit){
		super(accNo, branch, ifsc, address, bal);
		this.organizationName = organizationName;
		this.odlimit = odlimit;
	}
	double withdraw(double amt){
		if(bal-amt > odlimit){
			bal -= amt;
			return amt;
		}
		else{
			return 0.0;
		}
	}
}
class BankAccountDemo{
	public static void main(String[] args){
		SavingsBankAccount kmdsb = new SavingsBankAccount("1234abcd", "SBIBEC", "SBIN0010357", "Bapatla", 1000.0, "KMD", 2.5, 500.0);
		System.out.println("Account Holder:"+kmdsb.accHName);
		System.out.println("Account Initial Balance:"+kmdsb.checkBalance());
		kmdsb.deposit(5000.0);
		System.out.println("Account Balance after 5000.0 deposit:"+kmdsb.checkBalance());
		double amt = kmdsb.withdraw(1000.0);
		if(amt == 1000.0){
			System.out.println("Account Balance after 1000.0 withdraw:"+kmdsb.checkBalance());
		}
		else{
			System.out.println("Withdraw not possible because of insufficient funds");
		}
		BankAccount cba = new CurrentBankAccount("1234xyz", "SBIBEC", "SBIN0010357", "Bapatla", 100000.0, "BEC", -60000.0);
		System.out.println("Account Number:"+cba.accNo);
		//System.out.println("Organization Name:"+cba.organizationName);
		System.out.println("Account Initial Balance:"+cba.checkBalance());
		cba.deposit(5000.0);
		System.out.println("Account Balance after 5000.0 deposit:"+cba.checkBalance());
		amt = cba.withdraw(1000.0);
		if(amt == 1000.0){
			System.out.println("Account Balance after 1000.0 withdraw:"+cba.checkBalance());
		}
		else{
			System.out.println("Withdraw not possible because of insufficient funds");
		}
	}
}