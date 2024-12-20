/*Write a program that prints the day of the week based on a number (1-7):
Case 1: "Monday"
Case 2: "Tuesday"
Case 3: "Wednesday"
Case 4: "Thursday"
Case 5: "Friday"
Case 6: "Saturday"
Case 7: "Sunday"
Default: "Invalid day"
 */

import java.util.Scanner;

public class program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
