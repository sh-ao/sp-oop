
public class Lab1 {

    public static void main(String[] args) {
        char[] arr = {'s', 't', 'r', 'e', 's', 's', 'e', 'd'};
        //printArr(arr);
        printRevArr(arr);
    }

    public static void printArr(char[] arr) {
        //s t r e s s e d
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
    
    public static void printRevArr(char[] arr) {
        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
    
}
