import java.util.Scanner;

public class StrDyn {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Tell smth");
        String input = scanner.nextLine();
        System.out.println(input);

        int len= input.length();
        System.out.println(len);

        System.out.println(input.charAt(0));

        String num ="123";
        int numint = Integer.parseInt(num);
        numint++;
        System.out.println(numint);
        String value= String.valueOf(123);
        char [] chararr= num.toCharArray();
        System.out.println(chararr[0]);
        String formatted= String.format("Name:%s,Age:%d","Indhu",19);
        System.out.println(formatted);


    }
}