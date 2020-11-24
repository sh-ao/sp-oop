
public class MoreQ2 {

    public static void main(String[] args) {
        int[] arr = {32, 63, 12, 7, 23, 1, 39, 86};
        
        int min = getMin(arr);
        int max = getMax(arr);
        
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
    
    public static int getMin(int[] arr) {
        int min = arr[0];
        for(int i =0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
