package Day5;
import java.util.Scanner;
public class Quotient_Remainder {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a divisor");
        int divisor = scanner.nextInt();
        System.out.println("Enter a dividend");
        int dividend = scanner.nextInt();

        int quotient = divisor/dividend;
        int remainder = divisor%dividend;

        System.out.println("The quotient and remainder are " +quotient+" " +remainder);

    }

}
