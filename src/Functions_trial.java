import java.util.Scanner;

public class Functions_trial {
    public static boolean isEven(int number){
        if(number%2==0){
            System.out.println(number +" is Even");
            return true;
        }
        else{
            System.out.println(number+" is odd");
            return false;
        }
    }

    public static int MaxOf2(int a , int b){
        if(a>b){
            System.out.printf("Max is "+ a);
            return a;
        }
        else{
            System.out.printf("Max is "+ b);
            return b;
        }
    }

    private static double convertlogic(double celsius){
        return ((celsius * 9/5) +32);
    }

    public static void DisplayF(double celsius){
        double display=convertlogic(celsius);
        System.out.println("The Temp in celcius is "+ display);
    }
    public static void CountDown(int n) throws InterruptedException{
        if(n==0){

            System.out.println("Time Up!");
            return;}
        else if (n>0){
            System.out.println(n);
            Thread.sleep(1000);
            CountDown(n-1);
        }

    }
    public static void main(String[] args) throws InterruptedException {
       isEven(5);
       isEven(8);
       MaxOf2(5,8);
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter Temp in Celcius");
       double celcius= scanner.nextDouble();
       DisplayF(celcius);
       CountDown(10);


    }
}