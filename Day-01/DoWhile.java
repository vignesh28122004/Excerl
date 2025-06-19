import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int ch;

        do{
            System.out.println("1>Check even/odd 2->Exit");
            ch = sc.nextInt();
            if(ch == 1){
                System.out.println("Enter Data: ");
                int data = sc.nextInt();
                if(data % 2 ==0){
                    System.out.println(data + " is even");
                }
                else{
                    System.out.println(data + " is odd");
                }

            }
        } while(ch != 2);
        System.out.println("Exiting...");
       

    }

}

