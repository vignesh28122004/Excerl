import java.util.Scanner;

public class ArrayDemo2 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Eneter the Array Elements:");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            
        }
        
        int sum =0;
       for(int ele : arr){
        sum = sum + ele;
       }

       System.out.println("The Sum of the Array is" +" : "+ sum);

        
            
        
        
     
    }
}
