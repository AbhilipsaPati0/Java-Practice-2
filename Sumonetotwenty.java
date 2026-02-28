public class Sumonetotwenty {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum of even numbers: " + sum);
    }
}