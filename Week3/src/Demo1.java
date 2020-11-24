import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intInputA, intInputB;
		
		System.out.print("Please enter the first value: ");
		intInputA = sc.nextInt();
		System.out.print("Please enter the second value: ");
		intInputB = sc.nextInt();

		if (intInputA > intInputB) {
			System.out.println("First value is higher than second value.");
		} else if (intInputA < intInputB) {
			System.out.println("Second value is higher than first value.");
		} else {
			System.out.println("Both values are equal.");
		}
	}

}
