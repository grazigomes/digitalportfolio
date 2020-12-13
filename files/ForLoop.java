
/**
 * A loop that runs 10 times and shows the sum of the numbers entered by the user.
 *
 * @author Grazielle Gomes
 * @version 7/12/2020
 */

import java.util.Scanner;
public class ForLoop
{    
    /**
     * Sum of the numbers entered.
     */
    
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      int sum=0,num; 
      for (int i = 0; i <= 9 ; i++)
      {
        System.out.print("Enter a number or -6 to exit: ");
        num = in.nextInt();
            if (num == -6) break;
        sum += num;        
      }
     System.out.println("Sum of entered numbers is " + sum);
    }
}
