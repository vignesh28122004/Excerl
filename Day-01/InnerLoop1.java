public class InnerLoop1 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println(" ".repeat(5-i));
             for(int j=i; j<=5; j++){
        System.out.print(j+ " ");
       }
        }
    
    }
}

