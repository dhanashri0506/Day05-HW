package Homework;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		while(num != 0 ) {
			sum += num % 10;//add the last digits of the num to sum
			num/=10;//remove the last digits from num
			
		}
		System.out.println("The sum of the digits is: "+sum);
	}

}
