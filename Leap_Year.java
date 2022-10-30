package Day5;
import java.util.Scanner;
public class Find_Leap {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year ");
        short year = scanner.nextShort();

        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0)
                    System.out.println("It is a Leap Year");

                else
                    System.out.println("It is not a Leap Year");
            }
            else
                System.out.println("It is a Leap Year");

        }

        else
            System.out.println("It is not a Leap Year");

    }
}
