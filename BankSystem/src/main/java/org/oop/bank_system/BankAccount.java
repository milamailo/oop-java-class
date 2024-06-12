package org.oop.bank_system;

public abstract class BankAccount {
    private long accountNumber;
    private String accountHolder;
    protected double balance;
    protected double annualFees;

    public BankAccount(long accountNumber, String accountHolder, double annualFees) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.annualFees = annualFees;
    }


    public abstract void accountSummary();  // Abstract method for account summary

    public abstract void notifyAccountActivity(String message);

    public abstract double calculateAnnualFees();

    public abstract double minimumBalanceRequired();

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) throws Exception {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAnnualFees() {
        return annualFees;
    }
}
