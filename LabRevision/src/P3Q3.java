import java.util.Scanner;

public class P3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first value: ");
        int firstValue = sc.nextInt();
        
        System.out.println("Please enter second value: ");
        int secondValue = sc.nextInt();

        System.out.println("Please enter third value: ");
        int thirdValue = sc.nextInt();
        
        
        int[] inputArr = {firstValue, secondValue, thirdValue};
        
        int smallest = firstValue;
        for(int i = 0; i < inputArr.length; i++) {
            if(smallest < inputArr[i]) {
                smallest = inputArr[i];
            }
        }
        
        int biggest = firstValue;
        for(int i = 0; i < inputArr.length; i++) {
            if(biggest > inputArr[i]) {
                biggest = inputArr[i];
            }
        }
        
        
      int middle = (firstValue + secondValue + thirdValue) - (smallest + biggest);
      
      System.out.println(smallest + " " + middle + " " + biggest);

//        int smallest = 0;
//        
//        if(firstValue < secondValue && firstValue < thirdValue) {
//            smallest = firstValue;
//        } else if (secondValue < firstValue && secondValue < thirdValue) {
//            smallest = secondValue;
//        } else if (thirdValue < firstValue && thirdValue < secondValue) {
//            smallest = thirdValue;
//        }
//        
//        int biggest = 0;
//        if(firstValue > secondValue && firstValue > thirdValue) {
//            biggest = firstValue;
//        } else if (secondValue > firstValue && secondValue > thirdValue) {
//            biggest = secondValue;
//        } else if (thirdValue > firstValue && thirdValue > secondValue) {
//            biggest = thirdValue;
//        }
//        
//        int middle = (firstValue + secondValue + thirdValue) - (smallest + biggest);
//        
//        System.out.println(smallest + " " + middle + " " + biggest);
    }
}
