package org.example.bankaccount;

public interface BankAccountService {

    void deposit(int amount);
    void withdraw(int amount);
    void getPreviousTransaction();
    void showMenu();

}
