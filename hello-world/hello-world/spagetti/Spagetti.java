package spagetti;

import java.util.Scanner;

public class Spagetti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type the operation, and two numbers!");
		String operation = input.next();
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		if("sum".equals(operation)) {
			System.out.println(number1+number2);
		}
//		else if("Feltétel"){
//			System.out.println("I dont know this operation!");
//		}
	}
}
