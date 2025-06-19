class Equilibrium{

    public static int findEquilibrium(int arr[]){
        int totalSum = 0;
        for(int ele : arr){
            totalSum = totalSum + ele;
        }

        int leftSum = arr[0];
        for(int i=0; i<arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i]; //6-0-1=5--> 
            if(rightSum == leftSum){
                return i;
            }
            leftSum = leftSum + arr[i];
        }
        return -1;



    }
        
    public static void main(String[] args){
        int arr[] ={1,2,0,3};
        int arr2[] ={1, 1, 1, 1};
        int arr3[] ={-7, 1, 5, 2, -4, 3, 0};

        System.out.println("Equilibrium index is: " +findEquilibrium(arr));
        System.out.println("Equilibrium index is: " +findEquilibrium(arr2));
        System.out.println("Equilibrium index is: " +findEquilibrium(arr3));
       

    }
}
