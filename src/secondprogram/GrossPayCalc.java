package secondprogram;
import java.util.Scanner;

public class GrossPayCalc {
    public static void main(String arg[]){
        System.out.println("Enter the number of hours employee worked");
        Scanner scanner=new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        double grosspay = hours * rate;

        System.out.println("employee's gross pay is:"+ grosspay);


    }
}
