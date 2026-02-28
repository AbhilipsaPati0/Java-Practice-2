
    import java.util.Scanner;
    public class Exceptioncase{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();
    
            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();
    
            if (denominator == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println("Result: " + numerator / denominator);
            }
        }
    }