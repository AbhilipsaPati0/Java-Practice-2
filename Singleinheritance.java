/*Program name-Program using Single inheritance
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 19.08.2024
 */
import java.util.Scanner;
class DA{
    static int a=10;
    static int b=5;
}
class Singleinheritance extends A{
    public static void main(String[] args) {
        int c=4;
        int d=a+b+c;
        System.out.println("The addition is :"+d);
    }
}