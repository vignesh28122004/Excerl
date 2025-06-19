public class FlSL {
    public static void main(String[] args) {
        int arr[] = {23,46,56,51,35,74,16,95};
        int fl,sl;

        if(arr[0] > arr[1]){    //23>46 flase
            fl = arr[0];        // 
            sl = arr[1]; 

        }
        else {          // 23<46 true
            fl = arr[1];    // fl = 46
            sl = arr[0];    // sl = 23

        }
        for(int i=2; i<arr.length; i++){        //
            if(arr[i] > fl){                    // 56 > 46 true,,51>56
                sl = fl;  //  sl=46  
                fl = arr[i]; //fl=56

            } else if (arr[i] > sl && arr[i] < fl) { // 51>46 true, 51<56
                sl = arr[i]; // sl = 51
            }

        }
        System.out.println("First Largest: " + fl);
        System.out.println("Second Largest: " + sl);
    }
}

