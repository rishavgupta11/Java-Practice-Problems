package Ducat_JavaPracticeProblem;

import java.util.*;

public class SDA_size_15 {
    public static void main(String[] args) {

        int size = 5;
        Scanner sc = new Scanner(System.in);

        String[] array = new String[size];
        System.out.println("Enter " + size + " elements: ");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i+1) + ": ");
            array[i] = sc.nextLine();
        }
        System.out.println("\nThe elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }
    }
}
