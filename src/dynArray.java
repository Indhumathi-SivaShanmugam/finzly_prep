import java.util.Scanner;
import java.util.Arrays;

public class dynArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size= scanner.nextInt();

        int[] number = new int[size];

        System.out.println("Enter the integers");
        for (int i=0;i<size;i++){
            number[i]= scanner.nextInt();
        }

        for (int i=0;i<size;i++){
            System.out.println(number[i]);
        }
        for (int num:number){
            System.out.println(num);
        }

        number=Arrays.copyOf(number,number.length*2);

    }
}