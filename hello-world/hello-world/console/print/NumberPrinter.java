package console.print;

public class NumberPrinter {
	public static void main(String[] arg) {
		for (int i = 0; i < arg.length; i++) {
			System.out.println(Integer.parseInt(arg[i]));
		}

		// ennek a mint�j�ra adja �ssze a beadott param�tereket, kiirja az �sszeget!

		//sz�molja meg h�ny param�tert kapott, haszn�lj ciklust mindig

		//�llap�tsa meg, hogy a beadott param�terek k�z�tt volt-e kettes
		System.out.println(" ");
		for (int i = 0; i < arg.length; i++) {

		}

		//�rja ki az ellenkez�j�t a beadott param�tereknek

		//�raja ki minden ciklusban az indexet, a param�terek sz�m�nak megfelel�en
		System.out.println(" ");
		for (int i = 0; i < arg.length; i++) {
			System.out.println("indexsz�m: " +i);
			System.out.println(arg[i]);
		}
	}
}
