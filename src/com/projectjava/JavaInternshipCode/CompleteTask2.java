package com.projectjava.JavaInternshipCode;
import java.util.*;
public class CompleteTask2 {

    public static int[] getMarks(int numSubjects,Scanner sc){
        int[] marks = new int[numSubjects];
        for(int i = 0; i<numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + "(out of 100):");
            marks[i] = sc.nextInt();
        }
        return marks;
    }

    public static int calculateTotal(int[] marks){
        int total = 0;
        for(int mark : marks){
            total += mark;
        }
        return total;
    }

    public static double calculatePercentage(int totalMarks, int numSubjects){
        return (double) totalMarks/numSubjects;
    }

    public static String calculateGrade(double percentage){
        if(percentage >= 90){
            return "A+";
        }else if(percentage >=80){
            return "A";
        }else if(percentage >=70){
            return "B+";
        }else if(percentage >=60){
            return "B";
        }else if(percentage >=50){
            return "C+";
        }else if(percentage >=40){
            return "C";
        }else if(percentage >=30){
            return "PASS";
        }else{
            return "FAIL";
        }
    }
    public static void displayResults(int total, double percentage, String grade) {
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of Subjects :");
        int numSubjects = sc.nextInt();
        int [] marks = getMarks(numSubjects, sc);
        int total = calculateTotal(marks);
        double percentage = calculatePercentage(total, numSubjects);
        String grade = calculateGrade(percentage);
        displayResults(total,percentage, grade);
        sc.close();
    }


}
