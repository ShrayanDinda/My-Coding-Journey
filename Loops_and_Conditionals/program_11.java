/*Write a program to determine if a given year is a leap year.
Input: A single integer, year.
Output: Print "Leap Year" if the year is a leap year; otherwise, print "Not a Leap Year".
Hint: A year is a leap year if it is divisible by 4 but not divisible by 100, except if it is also divisible by 400.
 */

import java.util.Scanner;

public class program_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        } else if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
