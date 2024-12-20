/*Write a program to recommend a mobile data plan based on daily usage.
Input: User's daily data usage (in GB).
Conditions:
If usage < 2GB, recommend "Basic Plan."
If 2GB ≤ usage ≤ 5GB, recommend "Standard Plan."
If usage > 5GB, recommend "Premium Plan."
 */

import java.util.Scanner;

public class program_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter daily data usage in GB: ");
        double data_usage = sc.nextDouble();
        if (data_usage < 2) {
            System.out.println("Basic Plan");
        } 
        if(data_usage>=2 && data_usage<=5){
            System.out.println("Standard Plan");
        }
        if (data_usage>5) {
            System.out.println("Premium Plan");
        }
    }
}
