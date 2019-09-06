package mum.l2question3;

import java.time.LocalDate;


public class Employee {

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
  private Account savingsAcct;
private Account checkingAcct;
private Account retirementAcct;
private String name;
private LocalDate hireDate;
public Employee(String name, int yearOfHire,
int monthOfHire, int dayOfHire){
this.name = name;
//Replace these lines with LocalDate references
hireDate = LocalDate.of(yearOfHire,monthOfHire,dayOfHire);
}
public void createNewChecking(double startAmount) {
  checkingAcct=new Account(this,AccountType.CHECKING,startAmount);
    // implement
}
public void createNewSavings(double startAmount) {
       savingsAcct=new Account(this,AccountType.SAVING,startAmount);
 

// implement
}
public void createNewRetirement(double startAmount) {
   retirementAcct =new Account(this,AccountType.RETIRMENT,startAmount);
// implement
}
public void deposit(AccountType acctType, double amt){
    if(acctType==AccountType.CHECKING){
    this.checkingAcct.makeDeposit(amt);
    }
    else if(acctType==AccountType.SAVING){
    this.savingsAcct.makeDeposit(amt);
    }
    else{
    this.retirementAcct.makeDeposit(amt);
    }
    
// implement
}
public boolean withdraw(AccountType acctType, double amt){
switch(acctType){
		case CHECKING:
			return checkingAcct.makeWithdrawal(amt);
			
		case SAVING:
			return savingsAcct.makeWithdrawal(amt);
			
		case RETIRMENT:
			return retirementAcct.makeWithdrawal(amt);
			
		default:
			return false;
		
			
		}

}
public String getFormattedAcctInfo() {
    
// implement
String name="ACCOUNT INFO FOR "+this.getName()+": \n\n";
if(checkingAcct!=null) 
    name+= checkingAcct.toString()+"\n";
if(savingsAcct!=null)
    name+= savingsAcct.toString()+"\n";
if(retirementAcct!=null)
    name+= retirementAcct.toString();
return name;
}}
