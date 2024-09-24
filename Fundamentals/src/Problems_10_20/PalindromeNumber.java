package Problems_10_20;

public class PalindromeNumber {
    public static void main(String[] args) {

        // check this number ---> 34543
        int p, sum = 0, temp;
        int n = 34543;

        temp = n;
        while (n > 0) {
            p = n % 10; //check remainder
            sum = (sum * 10) + p;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not Palindrome Number");
        }
    }
}
