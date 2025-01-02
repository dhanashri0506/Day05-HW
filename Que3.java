package Homework;

import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		//print factor of the number
		System.out.println("Factors of " + num + "are: ");
		//loop for print factors
		for(int i=1;i<=num;i++) {
			if(num % i==0) {
				System.out.println(i + "  ");
			}
		}
	}

}
