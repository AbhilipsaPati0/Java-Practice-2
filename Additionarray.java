/*Program name-Wap to findout the addition of the two matrices
 * Name-Abhilipsa Pati
 * Regn No- 230301120502
 * Date- 17.08.2024
 */
public class Additionarray{
    public static void main(String[] args){
        //Declare matrices
        int [][] matrix1= {{1,2,3},{4,5,6}};
        int [][] matrix2= {{9,8,7},{6,5,4}};

        //printing the matrices
        System.out.println("Matrix1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        //Add matrices
        int[][] result = addMatrices(matrix1, matrix2);
        System.out.println("Result:");
        printMatrix(result);
    }
    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Get the dimensions of the matrices
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        // Create a new matrix to store the result
        int[][] result = new int[rows][cols];
        // Iterate over the elements of the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Add corresponding elements
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        // Iterate over the rows of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Iterate over the columns of the matrix
            for (int j = 0; j < matrix[0].length; j++) {
                // Print each element
                System.out.print(matrix[i][j] + " ");
            }
            // Print a newline
            System.out.println();
        }
    }
}
