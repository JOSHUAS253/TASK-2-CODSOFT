/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;
import java.util.Scanner;

public class Task_2_Student_Grade_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects from the user
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        int totalMarks = 0;
        
        // Loop through the number of subjects to input marks for each
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks; // Add marks to the total
        }

        // Calculate the average percentage
        double averagePercentage = (double) totalMarks / numOfSubjects;

        // Determine the grade based on the average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Print the total marks, average percentage, and grade
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage); // Two decimal precision for percentage
        System.out.println("Grade: " + grade);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
