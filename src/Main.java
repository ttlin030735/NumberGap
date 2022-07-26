import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = getNumber();
        int[] range = new int[size];

        for(int index = 0; index < range.length; index++){
            range[index] = getNumber();
        }

        System.out.println(getHighestGap(range));
    }

    public static int getHighestGap(int[] input){
        int result = 0;
        Arrays.sort(input);
        for(int index = 0; index < input.length - 2; index++){
            int number = input[index + 1] - input[index];
            if(number > result) result = number;
        }
        return result;
    }

    public static int getNumber(){
        while(true){
            try{
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch(InputMismatchException ignore){
                System.out.println("Add in a valid number!!!");
            }
        }
    }
}
