package org.example.abstract2;

public abstract class BankAccount {
    protected String bankAccountNo;
    protected String customerId;
    protected double bankBalance;

    public BankAccount(String no, String cusId, double balance){
        this.bankAccountNo = no;
        this.customerId = cusId;
        this.bankBalance = balance;
    }

    public String getBankAccountNo(){
        return bankAccountNo;
    }

    public String getCustomerId(){
        return customerId;
    }

    public void deposit(double amount){
        if(amount <0){
            throw new IllegalArgumentException("Amount should not be less than zero");
        }
        bankBalance +=amount;
        System.out.println("Updated balance is: " + bankBalance);
    }

    public abstract void withdraw(double amount);

    public void showBalance(){
        System.out.println("Current balance is : " + bankBalance);
    }
}
