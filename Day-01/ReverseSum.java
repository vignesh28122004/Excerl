
import java.util.Scanner;

public class ReverseSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to reverse and sum its digits:" +" ");
        int num = sc.nextInt();

        int rev =0;
        int sum =0;
        while(num >0){
            int digit = num %10;
            rev = rev * 10 + digit;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + rev);
        System.out.println("Sum of digits: " + sum);
    }
   
    }

