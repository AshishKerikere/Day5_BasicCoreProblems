package Day5;
import java.util.Scanner;
public class Harmonic_Sum {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Nth Harmonic Number");
        int N = scanner.nextInt();
        double result = 0.0d;

        for(int i = 1; i <= N; i++){
            double j = i*1.0;
            double k = 1.0;
            result += k/j;
        }

        System.out.println("The " +N +"th Harmonic value is = " +result);

    }
}
