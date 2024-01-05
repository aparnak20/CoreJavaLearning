package src.basics_06_24Dec;

public class Lab111 {
 public static void main(String[] args) {
//
//        int arr[][] = new int[3][3];
//
//        int arr2[][] = new int[2][3];
//
//        int arr3[][] = new int[3][2];
//
//        int arr4[][] = new int[5][2];
//
//        int arr5[][] = new int[10][1];
//
//        int arr6[][] = new int[10][11];

       // int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// declaring and initializing 2D array
        int arr[][]
                = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
// printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();


        }
    }
}
