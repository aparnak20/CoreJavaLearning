package src.basics_06_24Dec;

public class Lab106 {
    public static void main(String[] args) {
        int[] marks = new int[4];
        marks[0] = 98;
        marks[1] = 99;
        marks[2] = 100;
        marks[3] = 101;

        //1D -> array -->
        //2D-> Rows and colum
        int i = 0;
        while (i < marks.length){
            System.out.println(marks[i]);
            i++;
        }
        System.out.println("End of the program");
    }
}
