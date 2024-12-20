/*Write a program to check if a given figure is a square or a rectangle.
Input: Length l and breadth b.
Conditions: If 
l==b, print "Square."
Otherwise, print "Rectangle."
 */

import java.util.Scanner;

public class program_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the figure: ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of the figure: ");
        double b = sc.nextDouble();
        if (l==b) {
            System.out.println("Square.");
        }
        else{
            System.out.println("Rectangle.");
        }
    }
}
