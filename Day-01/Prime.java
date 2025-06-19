import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 2; 
        Boolean prime = true;
        while(i<=(n/2)){        // 2<=5/2 = 2
            if(n % i==0){       // 
                prime = false;
            }
            i++;
           
        }
         if(prime == true){
                System.out.println("the number "+n+" is prime");
            }
            else{
                System.out.println("not a prime");
            }
    
    }
    
}