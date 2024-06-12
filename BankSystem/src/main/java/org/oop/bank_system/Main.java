package org.oop.bank_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 10000;
        int max = 99999;
        int accountNumber = 0;
        double overDraftLimit = 200;
        double annualFee = 100;
        int userChoice;
        String userInput;
        BankAccount bankAccount = null;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("------------- Bank System -----------");
            System.out.println("1 - Open an Checking Account");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Account Info");
            System.out.println("5 - Exit");
            System.out.print("Please select one of the option above: ");
            userChoice = Integer.parseInt(scanner.nextLine());
            switch (userChoice) {
                case 1:
                    accountNumber = (int) (Math.random() * (max - min + 1) + min);
                    System.out.print("Please type your Full Name: ");
                    userInput = scanner.nextLine();
                    bankAccount = new CheckingAccount(accountNumber, userInput, overDraftLimit, annualFee);
                    bankAccount.notifyAccountActivity(bankAccount.getAccountHolder() + " thanks for opening an account with us. your account number is " + bankAccount.getAccountNumber());
                    break;
                case 2:
                    try {
                        System.out.print("Please enter the amount you want to deposit: ");
                        userInput = scanner.nextLine();
                        bankAccount.deposit(Integer.parseInt(userInput));
                    } catch (Exception e) {
                        System.out.println("Somthing went wrong: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Please enter the amount you want to deposit: ");
                    userInput = scanner.nextLine();
                    try {
                        bankAccount.withdraw(Integer.parseInt(userInput));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    bankAccount.accountSummary();
                    break;
                default:
                    System.out.println("Please select between 1 to 5");
                    break;
            }

        } while (userChoice != 5);


    }
}