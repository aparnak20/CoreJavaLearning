package src.basics_04_17Dec;

public class Lab063 {
    public static void main(String[] args) {
        int itemCode = 005;
        switch (itemCode) {
            case 001 -> System.out.println("It is a Laptop!");
            case 002 -> System.out.println("It is a Desktop!");
            case 003, 004 -> System.out.println("It is a mobile phone!");
            default -> System.out.println("Hello!");


        }


    }
}
