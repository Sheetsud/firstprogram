package Chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[])
    {
        int Quota = 10;
        System.out.println("Enter the number of sales this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= Quota){
            System.out.println("Congratulations");
        }
        else{
            int salesshort = Quota-sales;
            System.out.println("You did not meet your quota" + salesshort + "sales short");
        }
    }
}
