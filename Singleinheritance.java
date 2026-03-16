/*Program name-Program using Single inheritance
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 19.08.2024
 */
// in  this program we are using single inheritance where class DA is the parent class and Singleinheritance is the child class which inherits the properties of the parent class and we are performing addition of three numbers where two numbers are from the parent class and one number is from the child class.   
import java.util.Scanner;
class DA{
    static int a=10;
    static int b=5;
}
class Singleinheritance extends DA{
    public static void main(String[] args) {
        int c=4;
        int d=a+b+c;
        System.out.println("The addition is :"+d);
    }
}
// by abhilipsa pati