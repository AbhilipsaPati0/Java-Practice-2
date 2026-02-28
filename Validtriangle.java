/*
 * Program name-program to input angles of a triangle and check whether triangle is valid or not
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 03/08/2024
 */
import java.util.Scanner;
public class Validtriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle 1: ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter angle 2: ");
        int angle2 = scanner.nextInt();
        System.out.print("Enter angle 3: ");
        int angle3 = scanner.nextInt();
        String result = isValidTriangle(angle1, angle2, angle3);
        System.out.println(result);
    }
    public static String isValidTriangle(int angle1, int angle2, int angle3) {
        // Check if the sum of angles is 180 degrees
        if (angle1 + angle2 + angle3 != 180) {
            return "The triangle is not valid.";
        }
        // Check if each angle is greater than 0
        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            return "The triangle is not valid.";
        }
        return "The triangle is valid.";
    }
}