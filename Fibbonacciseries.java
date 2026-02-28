public class Fibbonacciseries {
    public static void main(String[] args) {
        int n = 10; // number of terms to generate
        System.out.println("Fibonacci series:");
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }
}