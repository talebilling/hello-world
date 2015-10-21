package console.print;

public class NumberPrinter {
	public static void main(String[] arg) {
		for (int i = 0; i < arg.length; i++) {
			System.out.println(Integer.parseInt(arg[i]));
		}

		// ennek a mint�j�ra adja �ssze a beadott param�tereket, kiirja az �sszeget!
		System.out.println("The sum of arguments:");
		int sum = 0;
		for (int i = 0; i < arg.length; i++) {
			sum = sum + Integer.parseInt(arg[i]);
		}
		System.out.println(sum);

		//sz�molja meg h�ny param�tert kapott, haszn�lj ciklust mindig
		System.out.println("The number of arguments:");
		int counter = 0;
		for (int i = 0; i < arg.length; i++) {
			counter++;
		}
		System.out.println(counter);

		//�llap�tsa meg, hogy a beadott param�terek k�z�tt volt-e kettes
		System.out.println("Is there any two");
		boolean isThereAnyTwo = false;
		for (int i = 0; i < arg.length; i++) {
			if (Integer.parseInt(arg[i]) == 2) {
				isThereAnyTwo = true;
			}
		}
		System.out.println(isThereAnyTwo);

		//�raja ki minden ciklusban az indexet, a param�terek sz�m�nak megfelel�en
		System.out.println("The loop indicies:");
		for (int i = 0; i < arg.length; i++) {
			System.out.println("indexsz�m: " +i);
			//System.out.println(arg[i]);
		}

		//�rja ki az ellenkez�j�t a beadott param�tereknek
		System.out.println("");
		System.out.println("opposite value of the parameter: ");
		int number = 0;
		for (int i = 0; i < arg.length; i++) {
			number = -1 * Integer.parseInt(arg[i]);
			System.out.println(number);
		}

		
		//�rja ki a maximum�t a t�mbnek
		System.out.println("");
		System.out.println("Maximum of the loop: ");
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arg.length; i++) {
		//	if (i > largest)
			//largest = number1;
		}
		//System.out.println(number1);
	}
}


