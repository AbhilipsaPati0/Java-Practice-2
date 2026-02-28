/*
 * Program name- program to input all sides of a triangle and check whether triangle is valid or not
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 03/08/2024
 */
import java.util.Scanner;
public class Trianglesides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();
        String result = isValidTriangle(side1, side2, side3);
        System.out.println(result);
    }

    public static String isValidTriangle(int side1, int side2, int side3) {
        // Check if the sum of any two sides is greater than the third side
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "The triangle is not valid.";
        }
        // Check if all sides are greater than 0
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "The triangle is not valid.";
        }
        return "The triangle is valid.";
    }
}