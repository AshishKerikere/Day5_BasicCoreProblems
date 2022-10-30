package Day5;
import java.util.Scanner;
public class prime_Factors {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number whose prime factors you want");
        int N = scanner.nextInt();

        for(int i = 1; i <= N/2 ; i++){

            if(N%i == 0){
                int count = 0;

                for(int j = 2; j < i; j++){
                    if(i%j == 0)
                        count++;
                    }
                   if (count == 0)
                       System.out.println(+i +",");
                }
            }
        }
    }

