import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Eneter the Array Elements:");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            
        }
        int L = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > L){
                L = arr[i];
            }
        }
        System.out.println("Largest : " +L);
        
     
    }
}
