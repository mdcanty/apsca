public class BankAccount{

	//private data fields (MUST be private)
	private int accNumber;
	private double accBalance;
	private String accOwner;


	//default constructor
	public BankAccount(){
		accNumber = -1;
		accBalance = 0.0;
		accOwner = "none";
	}


	//alternate constructor
	public BankAccount(int a, double b, String c){
		accNumber = a;
		accBalance = b;
		accOwner = c;
	}

	//getters/accessors
	public int getAccNumber(){
		return accNumber;
	}

	public double getAccBalance(){
		return accBalance;
	}

	public String getAccOwner(){
		return accOwner;
	}


	//setters/mutators
	public void setAccNumber(int newNum){
		accNumber = newNum;
	}

	public void setAccBalance(double newBal){
		accBalance = newBal;
	}

	public void setAccOwner(String newOwn){
		accOwner = newOwn;
	}

	//toString method
	public String toString(){
		String ret;
		ret = "Account Number = " + accNumber + "Account Balance = " + accBalance + "Account Owner = " + accOwner;
		return ret;
	}

	//Part 2
	public double deposit(double a){
		accBalance = accBalance + a;
		System.out.println("Deposit Successful!");
		return accBalance;	
	}

	public double withdraw(double a){
		if(a > accBalance){
			System.out.println("Insufficient Funds. Withdraw Cancelled.");
			return -1.0;
		}
		accBalance = accBalance - a;
		System.out.println("Withdraw Successful");
		return accBalance;
	}

	public double cashOut(){
		accBalance = 0.0;
		return accBalance;
	}

	public boolean verifyAccount(String name, int ID){
		if(ID == accNumber && name.equals(accOwner)){
			return true;
		} else {
			return false;
		}

	}

	//Part 3
	public double transferFunds(BankAccount a){

		accBalance = accBalance + a.getAccBalance();
		a.cashOut();
		System.out.println("Transfer Successful");
		return accBalance;

	}

	public BankAccount copyAccount(){

		BankAccount ret = new BankAccount();
		ret.setAccBalance(accBalance);
		ret.setAccOwner(accOwner);
		ret.setAccNumber(accNumber);
		return ret;

	}


}



































































































}
