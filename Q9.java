package Loops;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner (System.in);
		 
		int a =Sc.nextInt();
		int reverseNum =0;
		int num =a;
		
		while( num != 0)
		{
			int digit = num % 10;
			reverseNum = reverseNum *10 + digit;
			num =num/10;
			
			if (a == reverseNum)
			{
				 System.out.println("yes,"+a +"is a palindorme number");
			}
			else
			{
				System.out.println("yes,"+a +"is not palindorme number");
			}
		}
	}

}
