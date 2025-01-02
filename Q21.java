package Loops;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
//		 int count;
	     System.out.println("Enter count of numbers:");
		Scanner Sc = new Scanner (System.in);
		int b = Sc.nextInt();
		int a,sum;
		for(int sum=0;a>0;a=a/10 )
		{
			b =a % 10;
		    sum= sum+b;
//		     a=count/10;
		}
		System.out.println("The sum of digits :" + sum); 
		
    }
}
