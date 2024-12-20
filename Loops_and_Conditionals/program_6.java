/*Write a program to check if a person is old enough to drive.
If the age is 18 or above, print "Eligible to drive".
Otherwise, print "Not eligible to drive". 
*/
import java.util.Scanner;

public class program_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age  = sc.nextInt();
        if (age>=18) {
            System.out.println("Eligible to drive");
        } else {
            System.out.println("Not eligible to drive");
        }
    }
}
