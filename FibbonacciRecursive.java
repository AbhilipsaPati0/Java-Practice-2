public class FibbonacciRecursive{
    public static int fibbonacci(int n ){
        if (n<=1)
            return 1;
        else 
            return fibbonacci(n-1) + fibbonacci(n-2);
    }

    public static void main(String[] args) {
        int number= 7;
         System.out.println("The fibbonacci series of  " + number + " is " + fibbonacci(number));
    }
}