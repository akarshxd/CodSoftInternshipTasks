package com.projectjava.JavaInternshipCode;

public class BankAccount {
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
            return true;
        }
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return false;
        } else {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
            return true;
        }
    }

    public double checkBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

