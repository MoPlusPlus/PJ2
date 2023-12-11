import java.util.*;
public class EX02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Number 1  : " );
        int a = sc.nextInt();
        System.out.print("Input Number 2  : " );
        int b = sc.nextInt();

        int plus = a+b;
        int minus = a-b;
        int multi = a*b;
        double div = a/b;

        System.out.println("Plus : " + plus);
        System.out.println("Minus : " + minus);
        System.out.println("Multiply : " + multi);
        System.out.println("Divide : " + div);
    }
}
