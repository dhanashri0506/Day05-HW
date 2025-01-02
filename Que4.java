package Homework;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//for enter base
		System.out.println("Enter the base: ");
		int base =sc.nextInt();
		//for enter index
		System.out.println("Enter the index: ");
		int index =sc.nextInt();
		long result=1;
		//result is initilized 1 (as multiple by 1 does not change the value)
		for(int i=1; i<= index;i++) {
			result *=base;//multiply result by base each iteration
		}
		System.out.println(base + "^" + index + "=" + result);
	}

}
