package Loops;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner (System.in);
		int i , fact=1; 
		System.out.println("Enter the number");
		int num =Sc.nextInt();
		for (i=1;i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of"+fact);
	}

}
