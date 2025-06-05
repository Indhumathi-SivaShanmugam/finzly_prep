import java.util.Scanner;

public class INR2USD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Value in rupees:");
        double INR= scanner.nextDouble();
        double USD= INR * 0.012;
        System.out.println("The UDS value for INR is "+ USD + " Dollars");
    }
}