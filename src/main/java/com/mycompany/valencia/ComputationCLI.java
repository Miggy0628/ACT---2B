/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.valencia;
import java.util.Scanner;

/**
 *
 * @author CL1-PC18
 */
public class ComputationCLI {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 System.out.println("Choose an operation:");
        System.out.println("[1] - Addition");
        System.out.println("[2] - Subtraction");
        System.out.println("[3] - Multiplication");
        System.out.println("[4] - Division");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        if (choice == 1) {
            System.out.println("Result: " + (num1 + num2));
        } else if (choice == 2) {
            System.out.println("Result: " + (num1 - num2));
        } else if (choice == 3) {
            System.out.println("Result: " + (num1 * num2));
        } else if (choice == 4) {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid choice, please select a valid operation.");
        }

        input.close();
    
}
    
}
