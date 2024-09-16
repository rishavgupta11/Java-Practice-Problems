package Problems_1_10;

import java.util.*;

public class CheckPositiveNegativeOrZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("is positive");
        } else if (num < 0) {
            System.out.println("is Negative: ");
        } else {
            System.out.println("is Zero");
        }
    }
}
