/*Program name- Simple Recursion Program
 Name- Abhiipsa Pati
 *Regn n0.- 230301120502
 */

import java.util.Scanner;
class Factorial{
    //recursive method
    int fact (int n) {
        int result;

        if (n==1) return 1;
        result=fact(n-1)*n;
        return result;
    }

}

class Recursion{
    public static void main(String[] args){
        Factorial f= new Factorial();
        Scanner s= new Scanner(System.in);
        System.out.print("Enter 1st number");
        int a= s.nextInt();
        System.out.print("Enter 2nd number");
        int b= s.nextInt();
        System.out.print("Enter 3rd number");
        int c= s.nextInt();

        System.out.println("The factorial of number 1 is :" + f.fact(a));
        System.out.println("The factorial of number 2 is :" + f.fact(b));
        System.out.println("The factorial of number 3 is :" + f.fact(c));
    }


}
// by abhilipsa pati