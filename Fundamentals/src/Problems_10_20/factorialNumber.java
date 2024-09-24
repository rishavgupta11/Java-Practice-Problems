package Problems_10_20;

public class factorialNumber {
    public static void main(String[] args) {

        //Using For Loop
        int fact = 1;
        int n = 7;
        for (int i = 1; i < n; i++) {
            fact = fact*i;
        }
        System.out.println("factorial of "+n+" is: "+fact);
    }
}
