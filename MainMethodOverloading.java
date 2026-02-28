public class MainMethodOverloading {
    public static void main(int[] args) {
        System.out.println("Main method with int[] args");
    }

    public static void main(boolean[] args) {
        System.out.println("Main method with boolean[] args");
    }
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        main(new int[0]); // Call the main method with int[] args
        main(new boolean[0]); // Call the main method with boolean[] args
    }
}