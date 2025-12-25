package org.example.abstract2;

public class CurrentAccount extends BankAccount {


    public CurrentAccount(String accNo, String custId, double openingBalance){
        super(accNo, custId, openingBalance);
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= 0) {
            System.out.println("WithdrawalAmount " + withdrawalAmount + " can't be less than or equal to zero");
            return;
        }
        if (withdrawalAmount > bankBalance) {
            System.out.println("WithdrawalAmount " + withdrawalAmount + " is greater than current balance : " + bankBalance);
            return;
        }
        bankBalance -= withdrawalAmount;
        System.out.println("Remaining balance is : " + bankBalance);
    }
}