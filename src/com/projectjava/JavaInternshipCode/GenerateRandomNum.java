package com.projectjava.JavaInternshipCode;

import java.util.*;
public class GenerateRandomNum {
    public static void main(String[] args){

        //Task 1 : Generate a Random Number ~
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int rand_num = rand.nextInt(100)+1;

        // Task 2: Prompt the user to enter their guessed number ~
        System.out.println("Enter the Guessed num: ");
        int guessed_num = sc.nextInt();

        // Task 3: compare the user guessed number and random number.And providing feedback ~

            if (guessed_num == rand_num) {
                System.out.println("You guessed the correct number.");
            } else {
                System.out.println("You did not guess the correct number. The correct guessed number was :" + rand_num);
            }
    }
}
