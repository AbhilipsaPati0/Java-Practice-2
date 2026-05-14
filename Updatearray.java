// Write a Java program to update specific array elements by referring to the index of the array.
/*Program name-Program to update specific array elements by referring to the index of the array
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 19.08.2024
 */
import java.util.Scanner;
public class Updatearray{
    public static void main(String[] args) {
        int a[]={12, 13, 9, 17, 23, 15};

        a[1]= 23;
        a[3]= 27;
        a[5]= 5;

        for (int n : a){
            System.out.print(n+" ");
        }
    }
}