/*Write a program to verify if the user-inputted password matches the stored password "secure123". 
If it matches, print "Access Granted". */

import java.util.Scanner;

public class program_5 {

    public static void main(String[] args) {
        String stored_password = "secure123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String user_Password = sc.next();
        if (stored_password.equals(user_Password)) //The equals() method compares two strings, & returns true if the strings are equal, an & false if not.
        { 
            System.out.println("Access granted");
        }
        else{
            System.out.println("Invalid Password");
        }
    }
}
