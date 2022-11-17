package org.example.bankaccount;

public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;
    private String customerEmail;

    public BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }

    public BankAccount(int balance, int previousTransaction, String customerName, String customerId, String customerEmail) {
        this.balance = balance;
        this.previousTransaction = previousTransaction;
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPreviousTransaction() {
        return previousTransaction;
    }

    public void setPreviousTransaction(int previousTransaction) {
        this.previousTransaction = previousTransaction;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", previousTransaction=" + previousTransaction +
                ", customerName='" + customerName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }
}
