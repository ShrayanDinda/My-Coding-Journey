/*Write a program to calculate a 10% discount on the total bill 
if the bill exceeds ₹1000. Print the discount amount. */

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double bill = sc.nextDouble();
        if (bill>1000) {
            double discount = bill*(10.0/100);
            bill = bill-discount;
            System.out.println("Discount amount is: " + bill);
        }
    }
}
