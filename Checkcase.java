/*
 * Program name- Program to check whether the entered alphabet is uppercase or lowercase.
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 03/08/2024
 * 
 */
// program to check whether the entered alphabet is uppercase or lowercase.
import java.util.Scanner;
public class Checkcase{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch= s.next().charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println(ch+" is uppercase.");
        }else if (Character.isLowerCase(ch)){
            System.out.println(ch+ " is lowercase.");
        }else{
            System.out.println(ch+" is not an alphabet.");
        }
    }
    
}