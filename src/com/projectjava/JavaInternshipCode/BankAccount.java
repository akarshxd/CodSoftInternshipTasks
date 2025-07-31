//package com.projectjava.JavaInternshipCode;
//
//public class BankAccount {
//    private final String accountHolder;
//    private double balance;
//
//    public BankAccount(String accountHolder, double initialBalance) {
//        this.accountHolder = accountHolder;
//        this.balance = initialBalance;
//    }
//
//    public void withdraw(double amount) {
//        if (amount <= 0) {
//            System.out.println("Withdrawal amount must be positive.");
//        } else if (amount > balance) {
//            System.out.println("Insufficient balance.");
//        } else {
//            balance -= amount;
//            System.out.println("Withdrawn: ₹" + amount);
//        }
//    }
//
//    public void deposit(double amount) {
//        if (amount <= 0) {
//            System.out.println("Deposit amount must be positive.");
//        } else {
//            balance += amount;
//            System.out.println("Deposited: ₹" + amount);
//        }
//    }
//
//    public double checkBalance() {
//        return balance;
//    }
//
//    public String getAccountHolder() {
//        return accountHolder;
//    }
//}
//
