import java.util.Scanner;

public class P2Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter subtotal: ");
        double subtotal = sc.nextDouble();
        System.out.println("Please enter gratuity: ");
        double gratuityRate = sc.nextDouble();

        double gratuity = subtotal * gratuityRate / 100;
        double total = gratuity + subtotal;
        
        System.out.println("Total is " + total);
        System.out.println("Gratuity rate is " + gratuity);
        
    }

}
