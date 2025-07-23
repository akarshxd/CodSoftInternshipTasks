package com.projectjava.JavaInternshipCode;

import java.util.Random;
import java.util.Scanner;

public class RandomNumGuessing {
    public static void main(String[] args) {

        //Task 1 : Generate a Random Number ~
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int rand_num = rand.nextInt(100) + 1;

        System.out.println("Enter the Guessed num: ");
        int guessed_num = sc.nextInt();

        while(true){
            if(guessed_num<rand_num){
                System.out.println("Too Low, Try Again.");
            }else if(guessed_num>rand_num){
                System.out.println("Too High, Try Again.");
            }else{
                System.out.println("You guessed correct Number.");
                break;
            }
        }
    }

}
