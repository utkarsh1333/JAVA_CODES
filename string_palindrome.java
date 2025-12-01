import java.util.*;
public class string_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPalindom = true;
        String str = sc.next();
      int   n=str.length();
        for(int i=0;i<(n/2);i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                isPalindom = false;
            }
        }
        System.out.println(isPalindom);
    }
    
}
