package org.oop.bank_system;

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(long accountNumber, String accountHolder, double interestRate, double annualFee) {
        super(accountNumber, accountHolder, annualFee);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }


    @Override
    public void accountSummary() {
        System.out.println("Account Type: Savings\nAccount Number: " + getAccountNumber() +
                "\nAccount Holder: " + getAccountHolder() +
                "\nBalance: " + getBalance() + "\nInterest Rate: " + interestRate + "%");
    }

    @Override
    public void notifyAccountActivity(String message) {
        System.out.println("Email Notification: " + message);
    }

    @Override
    public double calculateAnnualFees() {
        return annualFees; // Flat annual fee
    }

    @Override
    public double minimumBalanceRequired() {
        return 500; // Minimum balance requirement for savings account
    }

}
