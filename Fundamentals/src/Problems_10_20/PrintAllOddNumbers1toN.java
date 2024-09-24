package Problems_10_20;

import java.util.Scanner;

public class PrintAllOddNumbers1toN {

    public static void main(String[] args) {

        int num;
        System.out.println("Enter an Integer Number: ");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(num %2 == 0)
            System.out.println(num+" is an Even Number: ");
        else
            System.out.println(num+" is an Odd Number: ");
    }
}
