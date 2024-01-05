package src.basics_03_16Dec;

public class Lab033 {
    public static void main(String[] args) {
        String name = "the Testing Academy";
        String name1 = "the Testing Academy";
       // String name2 = new String("the Testing Academy"); // Heap Area
        String name2 = new String("the Testing academy");

        // System.out.println(name == name1);
        // System.out.println(name.equals(name1));

       //  System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

    }
}
