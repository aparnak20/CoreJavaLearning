package src.oops_07_30Dec;
import java.util.Scanner;
public class Lab127 {
    public static void main(String[] args) {
        // Prime number Condition- any no divisiable by itself - num%i (i --> 2 to num)== 0 --> x
        // 0 - no
        // 1 - no


        int i = 0;
        int flag = 0;
        int m = 0;

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();

        //17-> 2 to 17/2-> num%i == 0 -> not a prime number

        m = n/2;
        if( n == 0 || n == 1) {
            System.out.println("Not a prime -> " + n);
        }else{
            for ( i = 2; i < m; i++){
                if(n % i==0){
                    System.out.println("Not a prime number");
                    flag = 1;
                    break;

                }
            }
        }
        if(flag == 0){
            System.out.println("Prime Number" + n);
        }
    }
}
