package com.projectjava.JavaInternshipCode;

public class CompleteTask3 {
    public static void main(String[] args){
        BankAccount userAccount = new BankAccount("User", 5000.0);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
