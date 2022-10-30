package Day5;
import java.util.Scanner;
public class Vowel_or_Constant {
    public static void main(String [] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("Enter a character");
        char c = sc12.next().charAt(0);

        c = c.toUpperCase();

        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
