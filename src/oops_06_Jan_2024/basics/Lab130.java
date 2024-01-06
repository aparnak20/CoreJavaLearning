package src.oops_06_Jan_2024.basics;

public class Lab130 {
    public static void main(String[] args) {

        String name = "Aparna"; // String constant Pool
        String name2 = new String("Aparna"); // Heap area

        name = "Kumbhar";

        String str1 = "Hello";
        str1 = str1.concat("Aparna");
        System.out.println(str1);

    }
}