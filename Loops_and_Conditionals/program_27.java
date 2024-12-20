/* Write a program to enter a number n. Print numbers in a sequence with 5 numbers in each row  */
import java.util.Scanner;

public class program_27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
