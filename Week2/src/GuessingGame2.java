
import java.util.Scanner;

public class GuessingGame2 {
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50};
		
		for(int i = 0; i < 5; i++) {
			int number = numbers[i];
			System.out.println(number);
		}
		
		for(int number: numbers) {
			System.out.println(number);
		}
		
		
		
		

	}
}
