package spagetti;

import java.util.Scanner;

public class Spagetti {

	//új osztályt csinálni új package-ben, main-el, beolvassa a system in-rõl, hogy true vagy false, false-nál elköszön, és vége, 
	//ha se nem F se nem T, akkor azt írja ki hogy rossz input, és ha T, akkor kiírja, hogy válassz a lehetõségek közül
	//A=kiszámolom egy szám négyzetét, B=kiszámolom egy szám gyökét, C=kiszámolom az abszolút értétét
	//és itt megint várja az A/b/c-t, utána azt mondja, hogy adja meg a számot.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type the operation, and two numbers!");
		String operation = input.next();
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		if("sum".equals(operation)) {
			System.out.println(number1+number2);
		}

		else if ("diff".equals(operation)){
			System.out.println(number1-number2);
		}

		else if ("multi".equals(operation)){
			System.out.println(number1*number2);
		}

		else if ("ratio".equals(operation)){
			System.out.println(number1/number2);
		}

		//		else if("Feltétel"){
		//			System.out.println("I dont know this operation!");
		//		}

		else {
			System.out.println("Something went wrong, I cannot do the operation!");
			System.out.println("Please type an operation: sum / diff / multi / ratio, and 2 numbers.");
		}
	}
}
