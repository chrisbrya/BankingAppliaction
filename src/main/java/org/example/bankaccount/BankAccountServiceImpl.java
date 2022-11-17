package org.example.bankaccount;

import java.util.Scanner;

public class BankAccountServiceImpl implements BankAccountService{

    public BankAccount newAccount = new BankAccount(10000, 0, "Chris", "1", "c.bryantcf@gmail.com");

    int balance = newAccount.getBalance();
    int previousTransaction = newAccount.getPreviousTransaction();


    @Override
    public void deposit(int amount) {
        if(amount != 0 || amount > 0){
             balance = balance + amount;
            newAccount.setBalance(balance);
        }
    }

    @Override
    public void withdraw(int amount) {

        if(amount != 0 || amount > 0){
            balance = balance - amount;
            newAccount.setBalance(balance);
            previousTransaction = -amount;
            newAccount.setPreviousTransaction(previousTransaction);
        }
    }

    @Override
    public void getPreviousTransaction() {
        if(previousTransaction > 0){
            System.out.println("Deposited: "+previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: "+Math.abs(previousTransaction));
        }
        else {
            System.out.println("No transaction occurred");
        }

    }

    @Override
    public void showMenu() {


        char option='\0';
        Scanner scanner = new Scanner(System.in);
        String customerName = newAccount.getCustomerName();
        String customerId = newAccount.getCustomerId();


        System.out.println("Welcome "+ customerName);
        System.out.println("Your ID is "+customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("====================================================================");
            System.out.println("Enter an option");
            option = scanner.next().charAt(0);
            System.out.println("====================================================================");
            System.out.println("\n");

            switch (option)
            {
                case 'A':
                    System.out.println("-----------------------------");
                    System.out.println("Your Balance is: "+balance);
                    System.out.println("-----------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-----------------------------");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("-----------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-----------------------------");
                    System.out.println("Enter an amount to Withdraw: ");
                    System.out.println("-----------------------------");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("-----------------------------");
                    getPreviousTransaction();
                    System.out.println("-----------------------------");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("You Entered an Invalid Option Please Try Again!");
                    break;
            }
        }while(option != 'E');
        System.out.println("Thank you for Banking with us!");
    }

}
