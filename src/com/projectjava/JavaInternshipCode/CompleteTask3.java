package com.projectjava.JavaInternshipCode;



import java.util.Scanner;

class ATM {
    private final BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome, " + account.getAccountHolder() + "!");
        do {
            System.out.println("\n==== ATM MENU ====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Enter a number between 1-4: ");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + account.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1-4.");
            }

        } while (choice != 4);

        sc.close();
    }
}


class BankAccount {
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    public double checkBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}




public class CompleteTask3 {
    public static void main(String[] args){
        BankAccount userAccount = new BankAccount("User", 5000.0);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
