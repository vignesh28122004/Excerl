import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n =sc.nextInt();
   
        int fact =1;
        while(n>=1){
            fact = fact*n;
            n--;
        }
        System.out.println("The factorial of the number is: " + fact);
        sc.close();
    }
    
}