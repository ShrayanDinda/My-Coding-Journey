/*Write a program to classify a number as positive, negative, or zero.
Input: A single integer, n.
Output: Print "Positive", "Negative", or "Zero" based on the value of n. 
 */

import java.util.Scanner;

public class program_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
