/**
 *  The purpose of this program is to help a Professor to calculate a total score of an exam and letter grade for each student.
 *  
 *  @author Grazielle Gomes
 *  @version 4/5/2020
 */
import java.util.Scanner;
import java.io.IOException;

public class CNFusingExam
{
    /**
     * main method for the CNFusingExam. Program to calculate scores and letter grade.
     */
    public static void main() throws IOException
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the student's name (Q to quit): ");
        String name = user.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);

        while (!(name.toUpperCase().equals("Q"))){ 

            String q1 = "Z";

            while (!(q1.equals("") || (q1.charAt(0) >= 'A' && q1.charAt(0) <= 'F'))) {
                System.out.print("Enter the answer to question one: ");
                q1 = user.nextLine().toUpperCase();
                if (!(q1.equals("") || (q1.charAt(0) >= 'A' && q1.charAt(0) <= 'F'))) {
                    System.out.println("Answers must be A, B, C, D, E, or F!");
                }

            }

            String q2 = "Z";

            while (!(q2.equals("") || (q2.charAt(0) >= 'A' && q2.charAt(0) <= 'F'))) {
                System.out.print("Enter the answer to question two: ");
                q2 = user.nextLine().toUpperCase();
                if (!(q2.equals("") || (q2.charAt(0) >= 'A' && q2.charAt(0) <= 'F'))) {
                    System.out.println("Answers must be A, B, C, D, E, or F!");
                }

            }

            int g1 = 0, g2 = 0, sum = 0;

            if (q1.equals("A")) {
                g1 = 7;
            }
            else if (q1.equals("B")) {
                g1 = 9;
            }
            else if (q1.equals("C")) {
                g1 = 5;
            }
            else if (q1.equals("D")) {
                g1 = 8;
            }
            else if (q1.equals("E")) {
                g1 = 10;
            }
            else if (q1.equals("F")) {
                g1 = 0;
            }
            else if (q1.equals("")) {
                g1 = 0;
                q1 = "F";
            }

            switch (q2) {
                case "A": g2 = 9; break;
                case "B": g2 = 10; break;
                case "C": g2 = 6; break;
                case "D": g2 = 5; break;
                case "E": g2 = 7; break;
                case "F": g2 = 0; break;
                case "": g2 = 0; q2 = "F";
            }

            sum = g1 + g2;
            String lgrade = "";

            switch (sum) {
                case 20:
                case 19:
                case 18: lgrade = "A"; break;
                case 17:
                case 16: lgrade = "B"; break;
                case 15:
                case 14: lgrade = "C"; break;
                case 13:
                case 12:
                case 11:
                case 10: lgrade = "D"; break;
                case 9:
                case 8:
                case 7:
                case 6:
                case 5:
                case 0: lgrade = "F"; 
            }

            System.out.printf("%s %s%s %d%s", name, q1, q2, sum, lgrade);
            System.out.print("\n\nPress Enter key to continue: ");
            char c = (char) System.in.read();
            System.out.print("\f");
            System.out.print("Enter the student's name (Q to quit): ");
            name = user.nextLine();
        }
        user.close();     

    }   
}
