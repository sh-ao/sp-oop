import java.util.Scanner;

public class LectureDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();

		if (userInput % 2 == 0) {
			System.out.println("The value is even");
		} else {
			System.out.println("The value is odd");
		}

		System.out.println((userInput % 2 == 0) ? "The value is even" : "The value is odd");

		System.out.println("The value is " + ((userInput % 2 == 0) ? "is even" : "is odd"));
	}

}
