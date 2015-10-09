package pizza;

import java.util.Scanner;

public class Pizza {
	//beolvassa a system in-rõl, hogy true v false
	//ha se nem F se nem T, akkor azt írja ki hogy rossz input, és ha T, akkor kiírja, hogy válassz a lehetõségek közül
	//A=kiszámolom egy szám négyzetét, B=kiszámolom egy szám gyökét, C=kiszámolom az abszolút értétét
	//és itt megint várja az A/b/c-t, utána azt mondja, hogy adja meg a számot.
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Type: true or false!");
		
		String operation = input.next();
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		if("sum".equals(operation)) {
			System.out.println(number1+number2);
		}
	else{
			System.out.println("It was false, good bye!");
		}
}
}