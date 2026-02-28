public class Array {
    public static void main(String[] args) {
        // Initialize an array to store the table of 5
        int[] tableOfFive = new int[10];

        // Loop through numbers 1 to 10
        for (int i = 0; i < 10; i++) {
            tableOfFive[i] = 5 * (i + 1);
        }

        // Print the table of 5
        System.out.println("Table of 5:");
        for (int i = 0; i < 10; i++) {
            System.out.print(tableOfFive[i] + " ");
        }

        
        
    }
}