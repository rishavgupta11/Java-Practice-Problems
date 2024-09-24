package Problems_10_20;

import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNumber(int number) {
        if(number < 10) {
            System.out.println(number);
            return;
        }else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The reverse of the given number is: ");
        reverseNumber(num);
    }
}
