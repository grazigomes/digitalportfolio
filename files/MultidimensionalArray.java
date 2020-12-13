
/**
 * This is an example of multidimensional array.
 *
* @author Grazielle Gomes
 * @version 8/3/2020
 */
public class MultidimensionalArray
{
     public static void main(String[] args) {
        int[][] matrix = {
                {3, 9},
                {11, 16, 33, 42},
                {7, 23, 1}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}