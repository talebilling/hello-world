package pizza;

import java.util.Scanner;

public class Pizza {
	//beolvassa a system in-r�l, hogy true v false
	//ha se nem F se nem T, akkor azt �rja ki hogy rossz input, �s ha T, akkor ki�rja, hogy v�lassz a lehet�s�gek k�z�l
	//A=kisz�molom egy sz�m n�gyzet�t, B=kisz�molom egy sz�m gy�k�t, C=kisz�molom az abszol�t �rt�t�t
	//�s itt megint v�rja az A/b/c-t, ut�na azt mondja, hogy adja meg a sz�mot.
	
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