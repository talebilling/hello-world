package spagetti;

import java.util.Scanner;

public class Spagetti {

	//�j oszt�lyt csin�lni �j package-ben, main-el, beolvassa a system in-r�l, hogy true vagy false, false-n�l elk�sz�n, �s v�ge, 
	//ha se nem F se nem T, akkor azt �rja ki hogy rossz input, �s ha T, akkor ki�rja, hogy v�lassz a lehet�s�gek k�z�l
	//A=kisz�molom egy sz�m n�gyzet�t, B=kisz�molom egy sz�m gy�k�t, C=kisz�molom az abszol�t �rt�t�t
	//�s itt megint v�rja az A/b/c-t, ut�na azt mondja, hogy adja meg a sz�mot.
	
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

		//		else if("Felt�tel"){
		//			System.out.println("I dont know this operation!");
		//		}

		else {
			System.out.println("Something went wrong, I cannot do the operation!");
			System.out.println("Please type an operation: sum / diff / multi / ratio, and 2 numbers.");
		}
	}
}
