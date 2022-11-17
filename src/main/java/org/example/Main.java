package org.example;

import org.example.bankaccount.BankAccount;
import org.example.bankaccount.BankAccountService;
import org.example.bankaccount.BankAccountServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        BankAccount newAccount = new BankAccount(10000, 0, "Chris", "1", "c.bryantcf@gmail.com");


        BankAccountServiceImpl bankAccountService = new BankAccountServiceImpl();
        bankAccountService.showMenu();

    }

}