package src.basics_04_17Dec;

public class Lab067 {
    public static void main(String[] args) {
        int code = 34;
        int val = switch (code){
            case 12:
                yield 1;
            case 34:
                yield 2;
            default:
                throw  new IllegalStateException("Unexpected value" + code);

        };
        System.out.println(val);
    }
}
