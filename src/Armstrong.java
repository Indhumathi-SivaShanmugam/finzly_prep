/* TOPICS COVERED:
primitives,flow,string and array

*/
import java.util.*;
import java.math.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("\n 1) Single Number \n 2)Range of Numbers");
        int choice= scanner.nextInt();
        int sum=0;

        switch(choice){
            case 1:{// single number( uses string to int method
                System.out.println("Enter your Number");
                String number=scanner.next();
                int length=number.length();
                System.out.println(length);
                //System.out.println(number);
                int Thenum=Integer.parseInt(number);
                for (int i=0; i<length;i++) {
                    char numchar = number.charAt(i);
                    int num = numchar - '0';// for numbers
                    //int num= Character.getNumericValue(ch);
                    //System.out.println(num);
                    sum += Math.pow(num, length);
                    System.out.println(Thenum);

                }
                //System.out.println(sum);
                if(sum== Thenum){
                    System.out.println("Its is a Armstrong No.");
                }
                else{
                    System.out.println("It aint a Armstrong no.");
                }

                break;

            }

            case 2:{// range of numbers // uses math and list to get the digits

                System.out.println("Enter the lower range:");
                int lr= scanner.nextInt();
                System.out.println("Enter the upper range:");
                int ur= scanner.nextInt();
                System.out.println("The Armstrong Numbers in the range are:");



                for (int num=lr;num<=ur;num++){
                    int orgnum=num;
                    int len = (int) (Math.log10(orgnum) + 1);
                    int sum1=0;

                    while (orgnum>0){
                        int digit = orgnum % 10;
                        sum1+=Math.pow(digit,len);
                        orgnum /= 10;
                    }


                    if (num==sum1){
                        System.out.printf(num+" is an Armstrong number\n");
                    }



                }
                break;
            }

            default:
                System.out.println("Pls enter valid Choice!(eg. 1 or 2)");



        }





    }
}
