package Day5;
import java.util.Scanner;
public class Table_2Powers {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the max powers of 2 that are required ");
        byte pow = scanner.nextByte();

        long result = 1L;

        for(byte i = 1; i <= pow; i++){
            for(byte j = 1; j <= i; j++)
                result = result*2;
            System.out.println(+i +"\t" +result);
            result = 1L;
        }
    }
}
