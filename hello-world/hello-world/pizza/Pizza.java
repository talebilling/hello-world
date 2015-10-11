package pizza;

import java.util.Scanner;

public class Pizza {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type true or false!");
		String mainInput = input.next();

		if("true".equals(mainInput)) {
			String chooseOptionText = "Choose from the options: A=I will give you the square of a number B=I will give you the root of a number,"
					+" C=I will give you the absolut value of a number!";
			String chooseOptionText2 = "Type A or B or C, and a number!";
			System.out.println(chooseOptionText);
			System.out.println(chooseOptionText2);

			Scanner input2 = new Scanner(System.in);
			String chosenOperation = input.next();
			int number = input.nextInt();

			if("A".equals(chosenOperation)) {
				System.out.print("The square of the integer: ");
				System.out.println(Math.pow(number, number));
			}

			else if ("B".equals(chosenOperation)){
				System.out.print("The root of the integer: ");
				System.out.println(Math.sqrt(number));
			}

			else if ("C".equals(chosenOperation)){
				System.out.print("The absolute value of the integer: ");
				System.out.println(Math.abs(number));
			}

			else {
				System.out.print("There was something wrong, use CAPITAL letter for A/B/C, then enter button, the number and enter again!");
			}
		}

		else if("false".equals(mainInput)) {
			System.out.println("You have chosen false, good bye!"); 
		}

		else{
			System.out.println("Wrong input, please start again and be sure, you don't use capital letters!");
		}

	}
}