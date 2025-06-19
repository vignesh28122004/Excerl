import java.util.Scanner;

public class PalodBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number:");

        int no = sc.nextInt();

        StringBuffer sb1 = new StringBuffer(""+no);     //1221 ---1221
        StringBuffer sb2 = new StringBuffer(""+no);

        sb2.reverse();

        if(sb1.compareTo(sb2) == 0) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is not a Palindrome");
        }





        
    }
}

