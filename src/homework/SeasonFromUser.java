package homework;
import java.util.Scanner;

public class SeasonFromUser {
    public static void main(String arg[])
    {
        System.out.println("Enter your favourite season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        System.out.println("Enter any whole number:");
        //Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Give any adjective u wish for:");
       // Scanner scanner1 = new Scanner(System.in);
        //String adj = scanner1.nextLine();
        String adj = scanner.next();
        scanner.close();

        System.out.println("On a "+ adj + season + "day,I drink a minimum of " + number + "cups of coffee");
    }
}
