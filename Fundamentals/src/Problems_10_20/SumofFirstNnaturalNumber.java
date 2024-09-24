package Problems_10_20;

public class SumofFirstNnaturalNumber {
    public static void main(String[] args) {

        //Using For Loop
        int num = 10, sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first 10 Natural Number is = " + sum);
    }
}
