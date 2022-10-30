package Day5;
import java.util.Scanner;
public class LargestofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter the firstnumber");
        int a = sc4.nextInt();
        System.out.println("Enter the secondnumber");
        int b = sc4.nextInt();
        System.out.println("Enter the thirdnumber");
        int c = sc4.nextInt();

        if (a>b && a>c){
            System.out.println("the first number is the largest");
        }
        else if (b>c){
            System.out.println("the second number is the largest");
        }
        else{
            System.out.println("the third number is the largest");
        }

    }
}
