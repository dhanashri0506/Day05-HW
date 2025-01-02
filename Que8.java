package Homework;

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		  // Create a scanner object to get input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the base and index
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        
        System.out.print("Enter the index : ");
        int index = sc.nextInt();

        // Calculate the power using Math.pow() function
        double result = Math.pow(base, index);

        // Print the result
        System.out.println(base + "^" + index + " = " + result);

	}

}
