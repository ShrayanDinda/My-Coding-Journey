/*Write a program to check if a person is a senior citizen. 
A person is considered a senior citizen if their age is 60 or above. 
If the condition is met, print "Senior Citizen". */
import java.util.Scanner;

public class program_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();
        if (age >= 60) {
            System.out.println("Senior Citezen");
        }
    }
}
