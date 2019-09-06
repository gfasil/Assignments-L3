/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.l2question2;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        
        Employee fasil=new Employee("Fasil","faya",80000.00,2019,10,12);
        Account checking=new Account(fasil,AccountType.CHECKING,300.00);
        Account saving=new Account(fasil,AccountType.SAVING,300.00);
        Account retirement=new Account(fasil,AccountType.RETIRMENT,300.00);
        
        checking.makeDeposit(200);
        saving.makeDeposit(200);
        retirement.makeDeposit(200);
        
        checking.makeWithdrawal(50);
        saving.makeWithdrawal(20);
        retirement.makeWithdrawal(50);
        
        System.out.println(checking.toString());
        System.out.println (saving.toString());
        System.out.println (retirement.toString());
         
         
    }
    
}
