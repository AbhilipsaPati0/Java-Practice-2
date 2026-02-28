/*
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 */
import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        // Creating file and writing content to it using an input stream in bufferridder
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt")))
         {
            System.out.println("Enter content to write to the file:");
            String content = new java.util.Scanner(System.in).nextLine();
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    
        // Reopenng the file and append content using an output stream
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt", true)))
        {
            System.out.println("Enter content to append to the file:");
            String content = new java.util.Scanner(System.in).nextLine();
            writer.write("\n" + content);
            System.out.println("Content appended to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error appending to the file: " + e.getMessage());
        }
    }
}