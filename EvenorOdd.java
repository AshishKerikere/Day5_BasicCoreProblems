package Day5;
import java.util.Scanner;
public class Even_or_Odd {
    public static void main(String [] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int A = sc1.nextInt();

        if (A%2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("odd Number");
    }
}
