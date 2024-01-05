package src.basics_05_23Dec;

public class Lab084 {
    public static void main(String[] args) {

//         int a = 10;
//         if (a == 10){
//         break; not a break within in if loop , this is invalid syntax
//         }


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                break;
            }
        }
    }
}
