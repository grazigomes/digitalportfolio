
/**
 * 2D arrays showing personal special dates.
 *
 * @author Grazielle Gomes
 * @version 7/25/20
 */
public class MoreArrays
{
     public static void main(String[] args) {
        int[][] arr = {{3, 9}, {3, 4}, {4, 14}, {10, 1}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}