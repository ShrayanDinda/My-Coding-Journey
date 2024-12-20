/*Write a program to check if the temperature is below freezing (less than 0°C). 
If it is, print "Warning: Temperature below freezing!". */

import java.util.Scanner;

public class program_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        int temperature = sc.nextInt();
        if (temperature < 0) {
            System.out.println("Warning: Temperataure below freezing!");
        }
    }
}
