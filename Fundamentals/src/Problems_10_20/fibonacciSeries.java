package Problems_10_20;

public class fibonacciSeries {
    public static void main(String[] args) {

        int n = 10, a = 0, b = 1, c;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = a;
        }
    }
}
