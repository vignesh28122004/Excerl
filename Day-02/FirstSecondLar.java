public class FirstSecondLar {
    public static void main(String[] args){
        int arr[] = {23,46,56,51,35,74,16,95};
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for(int ele : arr){
            if(ele > first) {
                second = first; 
                first = ele; 
            } else if (ele > second && ele < first) {
                second = ele; 
            }

        }
        System.out.println("First Largest: " + first);
        System.out.println("Second Largest: " + second);

        
    }
}
