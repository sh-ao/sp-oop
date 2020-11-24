import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        withTryCatchFinallyExceptionHandling(sc);
    }
    
//    public static void withoutExceptionHandling(Scanner sc) {
//        System.out.print("Please enter a number: ");
//        int value = sc.nextInt();
//        System.out.println("The value you enter is " + value);
//        System.out.println("End of program!");
//    }

    
    
    public static void withTryCatchExceptionHandling(Scanner sc) {
        try {
            System.out.print("Please enter a number: ");
            int value = sc.nextInt();
            System.out.println("The value you enter is " + value);
            System.out.println("End of program!");
        } catch(InputMismatchException ex) {
            System.out.println("Please enter only integer!");
        } catch(Exception ex) {
            System.out.println("Exception");
        }
    }
    
    public static void withTryCatchFinallyExceptionHandling(Scanner sc) {
        try {
            System.out.print("Please enter a number: ");
            int value = sc.nextInt();
            System.out.println("The value you enter is " + value);
        } catch(InputMismatchException ex) {
            System.out.println("Please enter only integer!");
        } finally {
            System.out.println("End of program!");
        }
    }
}
