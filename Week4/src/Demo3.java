
public class Demo3 {
    public static void main(String[] args) {
        int[] arrA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int[] arrB = arrA;
        
        int[] arrC = arrA.clone();
        
        int[] arrD = new int[arrA.length];
        System.arraycopy(arrA, 0, arrD, 0, arrA.length);
        
        int[] arrE = new int[arrA.length];
        for(int i = 0; i < arrA.length; i++) {
            arrE[i] = arrA[i];
        }
        
        for(int item: arrA) {
            System.out.print(item + ", ");
        }
        
        add2000(arrA);
        
        System.out.println("");
        for(int item: arrA) {
            System.out.print(item + ", ");
        }
        
        System.out.println("");
        for(int item: arrB) {
            System.out.print(item + ", ");
        }
    }
    

    
    public static void add2000(int[] values) {
        for(int i = 0; i < values.length; i++) {
            values[i] += 2000;
        }
    }
    
    
}
