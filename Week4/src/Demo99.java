import java.util.Scanner;

public class Demo99 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String[] valueArray = value.split("");
        
        for(int i = value.length() - 1; i >= 0; i--) {
            System.out.print(valueArray[i]);
        }

    }

}
