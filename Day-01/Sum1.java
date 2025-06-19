import java.util.Scanner;

public class Sum1{
    public static void main(String[] args){
    
        int a,b,c, L;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        a = sc.nextInt();

        System.out.print("Enetr second number:");
        b = sc.nextInt();

        System.out.print("Enter third number:");    
        c = sc.nextInt();
        L =a;

        if(a>b && a>c){     // 1>2 && 1>3 ----// 10000 > 3000 && 
            System.out.println("Largest number is:" +L);
        }
        else if(b>c){       //2>3
            System.out.println("Largest number is:" + b);
           
        }
         else {
            System.out.println("Largest number is:" + c);
            }
    }
}