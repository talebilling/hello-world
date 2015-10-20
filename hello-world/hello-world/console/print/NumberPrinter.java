package console.print;

public class NumberPrinter {
	public static void main(String[] arg) {
		for (int i = 0; i < arg.length; i++) {
			System.out.println(Integer.parseInt(arg[i]));
		}

		// ennek a mintájára adja össze a beadott paramétereket, kiirja az összeget!
		System.out.println("The sum of arguments:");
		int sum = 0;
		for (int i = 0; i < arg.length; i++) {
			sum = sum + Integer.parseInt(arg[i]);
		}
		System.out.println(sum);
		//számolja meg hány paramétert kapott, használj ciklust mindig
		System.out.println("The number of arguments:");
		int counter = 0;
		for (int i = 0; i < arg.length; i++) {
			counter++;
		}
		System.out.println(counter);
		
		//állapítsa meg, hogy a beadott paraméterek között volt-e kettes
		System.out.println("Is there any two");
		boolean isThereAnyTwo = false;
		for (int i = 0; i < arg.length; i++) {
			if (Integer.parseInt(arg[i]) == 2) {
				isThereAnyTwo = true;
			}
		}
		System.out.println(isThereAnyTwo);

		//írja ki az ellenkezõjét a beadott paramétereknek

		//íraja ki minden ciklusban az indexet, a paraméterek számának megfelelõen
		System.out.println("The loop indicies:");
		for (int i = 0; i < arg.length; i++) {
			System.out.println("indexszám: " +i);
			//System.out.println(arg[i]);
		}
	}
}
