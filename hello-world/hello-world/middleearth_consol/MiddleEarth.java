package middleearth_consol;

public class MiddleEarth {

	public static void main(String[] args) {
		Elf elf1 = new Elf("Legolas");
		Elf elf2 = new Elf("Arwen");
		Elf elf3 = new Elf("Elrond");
		Elf elf4 = new Elf("Galadriel");

		elf1.sayNumber(); 
		elf2.sayNumber();
		elf3.sayNumber();
		elf4.sayNumber();

		Elf.printTotalNumberOfElves();

		System.out.println(elf1.getName());

		
		// betettem egy sort. Emese
	}

}
