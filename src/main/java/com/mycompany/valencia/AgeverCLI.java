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
public class AgeverCLI {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter your Age");
       int age = input.nextInt();
       
       if (age >= 18 && age <= 100)
       {
           System.out.println("ABLE TO VOTE");
       }
       else if (age <= 17 && age >= 5)
       {
           System.out.println("UNABLE TO VOTE");
       }
       else
       {
           System.out.println("PLEASE INPUT YOUR AGE");
       }    
    }
}
