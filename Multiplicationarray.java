/*Program name-Wap to findout the multiplication of the two matrices
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 17.08.2024
 */
public class Multiplicationarray{
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB = {{7, 8}, {9, 0}, {2, 1}};
        int[][] result = new int[matrixA.length] [matrixB[0].length];

        System.out.println("The Multiplication of A and B matrix is:");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Print the resultant matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}