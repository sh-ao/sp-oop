
public class SwitchExample2 {

	public static void main(String[] args) {
		String grade = "E";

		// Example of Switch "Fall Through"
		switch (grade) {
		case "A":
			System.out.println("Excellent!");
			break;
		case "B":
			System.out.println("Well done");
			break;
		case "C":
			System.out.println("Well done");
			break;
		case "D":
			System.out.println("You passed");
		case "F":
			System.out.println("Better try again");
			break;
		default:
			System.out.println("Invalid grade");
		}

		System.out.println("Your grade is " + grade);

	}

}
