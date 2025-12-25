package org.example.abstract2;

public class SavingsAccount extends BankAccount{

    public double currLimit;
    
    public SavingsAccount(String no, String cusId, double balance, double currLimit){
        super(no, cusId, balance);
        this.currLimit = currLimit;
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        if(withdrawalAmount <=0){
            System.out.println("WithdrawalAmount " + withdrawalAmount + " can't be less than or equal to zero" );
            return;
        }
        if(withdrawalAmount > bankBalance){
            System.out.println("WithdrawalAmount " + withdrawalAmount + " is greater than current balance : " + bankBalance);
            return;
        }
        if(withdrawalAmount >currLimit){
            System.out.println("WithdrawalAmount " + withdrawalAmount + " is greater than current limit : " + currLimit);
            return;
        }
        bankBalance -=withdrawalAmount;
        System.out.println("Remaining balance is : " + bankBalance);
    }
}
