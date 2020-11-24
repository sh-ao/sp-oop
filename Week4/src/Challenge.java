import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = new String[32];
        
        for(int i = 0; i < inputs.length; i++) {
            System.out.print("Please enter an integer, add, subtract or type e to end: ");
            String input = sc.nextLine();
            
            if(input.equalsIgnoreCase("e")) {
                break;
            } else {
                inputs[i] = input;
            }
        }

        System.out.print("Here is the eqn: ");
        String eqn = "";
        int result = 0;
        boolean add = true;
        boolean subtract = false;
        for(String input: inputs) {
            if(input != null) {
                eqn += input;
                
                switch(input) {
                    case "+": add = true; break;
                    case "-": subtract = true; break;
                    default: result = compute(add, subtract, result, input);
                                add = false;
                                subtract = false;
                                break;
                }
            }
                
        }
        System.out.println(eqn);
        System.out.println("The final result is " + result);

    }
    
    public static int compute(boolean add, boolean subtract, int result, String input) {
        int intInput = Integer.parseInt(input);
        if (add == true) {
            return result += intInput;
        } else if (subtract == true) {
            return result -= intInput;
        }
        return result;
    }

}
