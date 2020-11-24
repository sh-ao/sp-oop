import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

//		System.out.print("Please enter a value between 0 - 5: ");
//		Scanner sc = new Scanner(System.in);
//		int userInput = sc.nextInt();

		int userInput = 2;
		switch (userInput) {
		case 1:
			System.out.println("You entered 1");
			break;
		case 2:
			System.out.println("You entered 2");
			break;
		case 3:
			System.out.println("You entered 3");
			break;
		case 4:
			System.out.println("You entered 4");
			break;
		case 5:
			System.out.println("You entered 5");
			break;
		default:
			System.out.println("Please enter a valid value");
			break;
		}

	}
}
