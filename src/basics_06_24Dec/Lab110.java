package src.basics_06_24Dec;

public class Lab110 {
    public static void main(String[] args) {
        //1D array
        int a[] = {1, 2, 3}; // Hori ->

        //2D array
        int arr[][] = new int[3][3];
        int arr2[][] = new int[3][3];

        // |1,2,3|
        // |4,5,6|
        // |7,8,9|

        // row 0 to 2
        arr[0][0] = 12;
        arr[0][1] = 34;
        arr[0][2] = 34;

        //Initialyzing 2nd array/ 2nd row
        arr[1][0] = 21;
        arr[1][1] = 22;
        arr[1][2] = 23;

        //Initialyzing 3rd array/ 3rd row
        arr[2][0] = 31;
        arr[2][1] = 32;
        arr[2][2] = 33;

        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }


    }
}
