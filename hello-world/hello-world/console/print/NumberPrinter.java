package console.print;

public class NumberPrinter {
	public static void main(String[] arg) {
		for (int i = 0; i < arg.length; i++) {
			System.out.println(Integer.parseInt(arg[i]));
		}
	}
	// ennek a mintájára adja össze a beadott paramétereket, kiirja az összeget!
	//számolja meg hány paramétert kapott, használj ciklust mindig
	//állapítsa meg, hogy a beadott paraméterek között volt-e kettes
	//írja ki az ellenkezõjét a beadott paramétereknek
	//íraja ki minden ciklusban az indexet, a paraméterek számának megfelelõen
}
