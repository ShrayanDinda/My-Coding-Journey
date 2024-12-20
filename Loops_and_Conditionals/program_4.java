/*Write a program to input the age of a person and 
check if the age of the person is greater than or equal to 18 
then print the message: “You are eligible to cast your vote”. */
import java.util.Scanner;

public class program_4 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Yo are eligible to cast your vote");
        }
        else{
            System.out.println("You are not eligible to cast your vote");
        }
    }
}
