package mum.l2question2;

class Account {

    public double getBalance() {
        return balance;
    }

    public AccountType getAcctType() {
        return acctType;
    }
	//public final static String CHECKING = "checking";
	//public final static String SAVINGS = "savings";
	//public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
                this.balance+=deposit;
                System.out.println("succesfull deposit from "+ this.acctType +" Current Balance = "
+ balance);    
	}

	public boolean makeWithdrawal(double amount) {
		// implement
                if(this.balance<amount){
                System.out.println("you dont have enough balance " +" Current Balance = "
+ balance);    
		return false;}
                
                balance-=amount;
                System.out.println("succesfull Withdrawal from "+this.acctType + " amount = " + amount + "  Current Balance = "
+ balance);

                return true;
	}
}
