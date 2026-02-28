/*
 * Program name- Program to count total number of notes in given amount.
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 03/08/2024
 */
import java.util.Scanner;
public class NoteCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        int[] notes = {500, 200, 100, 50, 20, 10, 5};
        int[] noteCount = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            noteCount[i] = amount / notes[i];
            amount = amount % notes[i];
        }
        System.out.println("Note count:");
        
        for (int i = 0; i < notes.length; i++) {
            if (noteCount[i] > 0) {
                System.out.println(notes[i] + " rupee note: " + noteCount[i]);
            }
        }
    }
}