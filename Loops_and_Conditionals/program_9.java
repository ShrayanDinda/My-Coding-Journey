/*Write a program to calculate the fine for speeding:
If the speed is above 100 km/h, print "Fine: ₹2000".
Else if the speed is between 80 and 100 km/h, print "Fine: ₹1000".
Else if the speed is between 60 and 80 km/h, print "Warning: Drive slower".
Otherwise, print "No fine". */

import java.util.Scanner;

public class program_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the speed in km/h: ");
        int speed = sc.nextInt();
        if (speed>100) {
            System.out.println("Fine: ₹2000");
        }
        else if (speed>=80 && speed<=100) {
            System.out.println("Fine: ₹1000");
        }
        else if (speed>=60 && speed<=80) {
            System.out.println("Warning: Drive slower");
        }
        else{
            System.out.println("No fine");
        }
    }
}
