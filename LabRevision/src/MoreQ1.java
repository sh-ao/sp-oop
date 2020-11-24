import java.util.Scanner;

public class MoreQ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number : ");
        int firstValue = sc.nextInt();
        
        System.out.println("Input the second number : ");
        int secondValue = sc.nextInt();
        
        System.out.println("Input the third number : ");
        int thirdValue = sc.nextInt();
        
        if(thirdValue == (firstValue + secondValue)) {
            System.out.println("The result is: true");
        } else {
            System.out.println("The result is: false");
        }

    }

}
