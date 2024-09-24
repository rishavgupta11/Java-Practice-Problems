package Problems_10_20;

public class powerOfNumber {
    public static void main(String[] args) {

//        int base = 2;
//        int exponent = 3;
//        int result = 1;
//
//        for (int i = 0; i < exponent; i++) {
//            result *= base;
//        }
//        System.out.println(base + " raised to the power of " +exponent+ " is " +result);

        //using Math.pow method
        double base = 2.0;
        double exponent = 3.0;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}
