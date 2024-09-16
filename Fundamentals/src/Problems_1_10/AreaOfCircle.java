package Problems_1_10;

import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the radius: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle is: " + Math.PI * Math.pow(radius, 2));

//        int radius;
//        double pi = 3.142, area;
//        radius = 5;
//        area = pi * radius * radius; // (3.142*5*5)
//        System.out.println("Area of Circle is: " + area);
    }
}
