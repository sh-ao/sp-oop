
public class Demo5 {
    public static void main(String[] args) {
        int[][] mulArrA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        
        int[][] mulArrB = new int[3][3];
        mulArrB[0][0] = 101;
        mulArrB[0][1] = 102;
        mulArrB[0][2] = 103;
        mulArrB[1][0] = 104;
        mulArrB[1][1] = 105;
        mulArrB[1][2] = 106;
        mulArrB[2][0] = 107;
        mulArrB[2][1] = 108;
        mulArrB[2][2] = 109;
        
        int[][] mulArrZ = new int[3][3];
        int val = 1;
        for(int i = 0; i < mulArrZ.length; i++) {
            for(int j = 0; j < mulArrZ[i].length; j++) {
                mulArrZ[i][j] = val;
                val = val + 1;
            }
        }
        
        
        
        int[][] mulArrC = {
                {201, 202},
                {203, 204, 205},
                {206},
                {207, 208, 209, 210}
        };
        
        
        int[][] mulArrD = new int[2][];
        
        int[] row1 = {301};
        mulArrD[0] = row1;
        mulArrD[1] = new int[3];
        mulArrD[1][0] = 302;
        mulArrD[1][1] = 303;
        mulArrD[1][2] = 304;
        
        printMulArr(mulArrD);
    }
    
    public static void printMulArr(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
