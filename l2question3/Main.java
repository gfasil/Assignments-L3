/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.l2question3;

import mum.l2question2.*;

/**
 *
 * @author HP
 */
public class Main {
    Employee emps[]=new Employee[3];
    public static void main(String[] args){
        new Main();}
        Main(){
        Employee fasil=new Employee("Fasil",2019,10,12);
       
        Employee robi=new Employee("Robel",2019,10,12);
       
        Employee heli=new Employee("Helen",2019,10,12);
       
        emps[0]=fasil;
        emps[1]=robi;
        emps[2]=heli;
        
            emps[0].createNewChecking(10500);
            emps[0].createNewSavings(1000);
            emps[0].createNewRetirement(9300);
            emps[1].createNewChecking(34000);
            emps[1].createNewSavings(27000);
            emps[2].createNewChecking(10038);
            emps[2].createNewSavings(12600);
            emps[2].createNewRetirement(9000);
            emps[0].deposit(AccountType.CHECKING, 100);
            emps[1].deposit(AccountType.SAVING, 200);
             emps[2].withdraw(AccountType.SAVING,9000);
          

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("See a report of all account balances? (y/n) ");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("y")) {
            String info = getFormattedAccountInfo();
            System.out.println(info);
//display info to console
        } else {
//do nothing..the application ends here
        }

       

    }

    String getFormattedAccountInfo() {
//implement
    String output = "";
		for(int i = 0; i < emps.length; ++i){
			output += (emps[i].getFormattedAcctInfo()+"\n\n");
                        
		}
                return output;
    }
}
