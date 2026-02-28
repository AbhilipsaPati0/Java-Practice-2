/*
 * Arraylist Exception Handleing in java 
*/
import java.util.*;
public class JavaIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city names (type 'quit' to finish):");

        while (true) {
            System.out.print("City name: ");
            String cityName = sc.next();

            if (cityName.equalsIgnoreCase("quit")) {
                break;
            }

            cityNames.add(cityName);
        }

        try {
            Iterator<String> iterator = cityNames.iterator();
            System.out.println("City name elements:");
            while (iterator.hasNext()) {
                System.out.println(iterator.next() + " ");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}