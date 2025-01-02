package Homework;

public class Que2 {

	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd = 0;
		int i = 1;
		while(i<=30) {
			if(i % 2 == 0) {
				sumEven +=i;
			}
			else {
				sumOdd +=i;
			}
			i++;
		}
		System.out.println("The sum of even number between 1 and 30 is: "+sumEven);
		System.out.println("The sum of odd number between 1 and 30 is: "+sumOdd);
	}

}
