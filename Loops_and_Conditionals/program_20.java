
import java.util.Random;
import java.util.Scanner;

public class program_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        Random rn = new Random();
        int month = rn.nextInt(12) + 1;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Septermber");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
        }
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days in the month is: " + (days = 31));
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days in the month is: " + (days = 30));
                break;
            case 2:
                days = ((year%4==0 && year%100 !=0 ) || (year%400==0))?29:28;
                System.out.println("Number of days in the month is: " + days);
        }
    }
}
