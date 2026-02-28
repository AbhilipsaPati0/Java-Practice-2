public class FactorialRecursive{
    public static int factorial(int n){
        if (n<=1)
            return 1; //base case
        else 
            return n * factorial(n-1); //recursive case
    }
    public static void main(String[] args) {
        int number= 6;
        System.out.println("The Factorial of " + number + " is " + factorial(number));
    }
}