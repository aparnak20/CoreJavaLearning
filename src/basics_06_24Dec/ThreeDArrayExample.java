package src.basics_06_24Dec;

    public class ThreeDArrayExample {
        public static void main(String[] args) {
            // Declare and initialize a 3D array
            int[][][] threeDArray = new int[3][4][5];

            // Fill the 3D array with values
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 5; k++) {
                        threeDArray[i][j][k] = i + j + k;
                    }
                }
            }

            // Access and print elements of the 3D array
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 5; k++) {
                        System.out.print(threeDArray[i][j][k] + " ");
                    }
                    System.out.println();  // Move to the next line after each row
                }
                System.out.println();  // Add an empty line between 2D arrays
            }
        }
    }


