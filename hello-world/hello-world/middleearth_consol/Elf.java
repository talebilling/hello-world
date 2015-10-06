package middleearth_consol;

public class Elf {
	String name;

	//static String name: static minden objektumra EGY közös változót hoz létre
	static int countTotalNumberOfElves = 0;

	public Elf (String nameInput) {
		name = nameInput;
		//public Elf sor a konstruktor
		//System.out.println("I am an elf, " + nameInput);
		countTotalNumberOfElves = countTotalNumberOfElves + 1;
		//                        countTotalNumberOfElves++;
	}

	public static void printTotalNumberOfElves() {
		System.out.println(countTotalNumberOfElves);
	}

	public String getName() {
		return name;
	}

	public void sayNumber() {
		String number = "Eins";
		System.out.println(name + " says: " + number);
	}

	public String getClassName() {
		return "Elf";
	}
}
