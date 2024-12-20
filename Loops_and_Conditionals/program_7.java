/*Write a program to check if a given number is odd or even.
If the number is divisible by 2, print "The number is even".
Otherwise, print "The number is odd".
 */

import java.util.Scanner;

public class program_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
