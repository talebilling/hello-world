package mathematics;

public class Mathematics {

	public static void main(String... args) {
		printHello();
		System.out.println(sayHello());
		System.out.println(getTwoNumberSum(10, 20));
		printTwoNumberSum(10, 20);
		System.out.println(getTwoNumberSubtraction(10, 7));
		printTwoNumberSubtraction(10, 7);
		System.out.println(getNumbersMultiplication(4, 3, 2));
		printNumbersMultiplication(4, 3, 2);
		System.out.println(getNumbersDivision(15, 3));
		printNumbersDivision(15, 3);
	}

	public static void printHello() {
		System.out.println("Hello");
		//void-ost nem voidosra, és fordítva -> megcsinálva 
	}

	public static String sayHello() {
		String sayHello = "Hello";
		return sayHello;
	}
	
	public static int getTwoNumberSum(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		return sum;
		//tovább: kivonás szorzás és osztás, 3-4 számot összead stb
		//megcsinálva!
	}

	public static void printTwoNumberSum(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		System.out.println(sum);
	}

	public static int getTwoNumberSubtraction(int firstNumber, int secondNumber) {
		int sub = firstNumber - secondNumber;
		return sub;
	}

	public static void printTwoNumberSubtraction (int firstNumber, int secondNumber) {
		int sub = firstNumber - secondNumber;
		System.out.println(sub);
	}
	
	public static int getNumbersMultiplication (int firstNumber, int secondNumber, int thirdNumber) {
		int multi = firstNumber * secondNumber * thirdNumber;
		return multi;
	}

	public static void printNumbersMultiplication (int firstNumber, int secondNumber, int thirdNumber) {
		int multi = firstNumber * secondNumber * thirdNumber;
		System.out.println(multi);
	}
	
	public static int getNumbersDivision (int firstNumber, int secondNumber) {
		int division = firstNumber / secondNumber;
		return division;
	}

	public static void printNumbersDivision (int firstNumber, int secondNumber) {
		int division = firstNumber / secondNumber;
		System.out.println(division);
	}
}
