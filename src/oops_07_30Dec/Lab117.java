package src.oops_07_30Dec;

public class Lab117 {
    public static void main(String[] args) { // args value it can be anything

        System.out.println("Run fine!!");
        int d = main(10);
        System.out.println(d);
        main("Pramod");
    }

    static void main(String a){
        System.out.println("I am a main function but JVM doesnt recognize me");
    }

    static int main(int a){
        return a+101;
    }


}
