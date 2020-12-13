
/**
 * This program passes an array to a method and finds the average value. It allows the user to choose the size of the array.
 *
 * @author Grazielle Gomes
 * @version 7/16/20
 */
import java.util.Scanner;
public class ArrayAndMethod
{
    public static double avgArray(int numbers[])   
    { 
        int sum=0;

        for (int i=0;i<numbers.length;i++) 

            sum=sum+numbers[i];

        return sum/(float)numbers.length; 
    }

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in); 
        System.out.printf("Enter the size of array: ");

        int n=input.nextInt(); 
        int numbers[]=new int[n];

        System.out.println("\nEnter the array values: ");

            for (int i=0;i<n;i++)

                numbers[i]=input.nextInt(); 

        System.out.printf("\nThe average of given array values is %.2f\n",avgArray(numbers));      
    }
}