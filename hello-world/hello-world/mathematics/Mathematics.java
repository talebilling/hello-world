package mathematics;

public class Mathematics {

	public static void main(String... args) {
		printHello();
		System.out.println(getTwoNumberSum(10, 20));
		printTwoNumberSum(10, 20);
	}
	
	public static void printHello() {
		System.out.println("Hello");
	//void-ost nem voidosra, és fordítva
	}
	
	public static int getTwoNumberSum(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		return sum;
		//kivonás szorzás és osztás
		//3-4 számot összead stb
	}
	
	public static void printTwoNumberSum(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		System.out.println(sum);
	}
}
