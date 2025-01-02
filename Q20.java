package Loops;

import java.util.Scanner;

public class Q20 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner (System.in);
		int num=1;
		int even=0;
		int odd=0;
		for (int a=1;a<30*num;a++)
		{
			if((a & 1)==0)
			    {
				even +=a;
				}
			else 
	            {
				odd +=a;
	            }
		}	
		System.out.println("sum of "+num+"Even numbers ="+even);
		System.out.println("sum of "+num+"odd numbers ="+odd);
	}	
}
