import java.util.Scanner;

public class program_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i%3==0 || i%5==0) {
                sum = sum + i;
            }
        }
        System.out.println("The summation of all the numbers in between 1 to " + n + " which are divisible by 3 or 5 is: " + sum);
    }
}
