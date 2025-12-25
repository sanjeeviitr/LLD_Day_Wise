package org.example.abstract2;

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount("123", "ram1", 40000, 20000.00);
        BankAccount a2 = new CurrentAccount("124", "shyam1", 40000);
        a1.deposit(40000);
        a2.deposit(100000);
        a1.showBalance();
        a1.withdraw(10000);
        a1.showBalance();
        a1.withdraw(25000);
        a1.showBalance();
        a1.withdraw(80000);
        a1.showBalance();
        a2.withdraw(90000);
        a2.showBalance();
    }
}
