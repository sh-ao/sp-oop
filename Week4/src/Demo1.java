
public class Demo1 {
    public static void main(String[] args) {
        
        
        int[] arrayInt = {10,20,30,40,50};
        
        System.out.println("Old values: ");
        for(int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + ", ");
        }
        
        addValue(arrayInt, 500);
        
        System.out.println("\nNew values: ");
        for(int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + ", ");
        }
    }
    
    
    public static void addValue(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] += value;
        }
    }
}
