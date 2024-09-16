package Problems_1_10;

import java.util.*;

public class simpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle amount: ");
        double principle = sc.nextDouble();
        System.out.println("Enter the rate of interest(in %): ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time(in years): ");
        double time = sc.nextDouble();

        double simpleinterest = (principle*rate*time)/100;
        System.out.println("SimpleInterest: " + simpleinterest);

    }
}
