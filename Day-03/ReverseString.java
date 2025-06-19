public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] c = str.toCharArray();
        int i,j=0;
        char temp;
        for(i=0,j=c.length-1;i<j;i++,j--){
            temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
       String s = new String(c);
       System.out.println(s);
    }

    
}