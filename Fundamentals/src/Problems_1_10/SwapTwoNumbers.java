package Problems_1_10;

import java.util.*;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a, b, temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first numbers: ");
        a = sc.nextInt();
        System.out.println("Enter the second numbers: ");
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;
        System.out.println("first number = " + a);
        System.out.print("second number = " + b);
    }
}
