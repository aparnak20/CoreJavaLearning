package src.basics_05_23Dec;

public class Lab083 {
    public static void main(String[] args) {
        // for(A; B; C)
        // A- Initialization - JVM what variable, where are you are starting point
        // B- Condition - when you want this to stop. --> true, false
        // C - Increment / Decrement

        int num = 4;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
        }
     }
}
