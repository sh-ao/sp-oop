
public class Demo2 {

    public static void main(String[] args) {
        

        printArrayItems(10, 20, 30, 40, 50, 60);


    }
    
    public static void printArrayItems(int ... items) {
        //int[] items = {10, 20, 30, 40, 50, 60};
        
        System.out.println("Here is the list of items:");
        for(int i = 0; i < items.length; i++) {
            System.out.print(items[i] + ", ");
        }
        System.out.println("");
    }

}
