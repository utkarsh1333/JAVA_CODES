// import java.util.*;
// public class javabasics {
//     public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//   int num=sc.nextInt();
//   System.out.println(num+3);

// }    
// }

// import java.util.*;
// public class javasbasics{
// public static void main (String args[]){
//   Scanner sc= new Scanner(System.in);
// boolean num=sc.nextBoolean();
// System.out.println(num);
// }}

// import java.util.*;
// public class javabasics{
//   public static void main (String args[]){
//     Scanner sc= new Scanner(System.in);
//     int n=sc.nextInt();
//     System.out.println(n+34);
//   }

// }
// import java.util.*;
// public class javabasics{
//   public static void main (String args[]){
//     Scanner sc= new Scanner(System.in);
//     int n=sc.nextInt();

// public class StarPattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) { // 5 rows
//             for (int j = 1; j <= 11; j++) { // 11 columns
//                 if (i == 3) {
//                     // Row 3: all stars
//                     System.out.print("*  ");
//                 } else if (i == 1 || i == 5) {
//                     // Rows 1 and 5: star at column 1 and 11
//                     if (j == 1 || j == 11)
//                         System.out.print("*");
//                     else
//                         System.out.print("   ");
//                 } else if (i == 2 || i == 4) {
//                     // Rows 2 and 4: star at column 1, 10, 11
//                     if (j == 1 || j == 10 || j == 11)
//                         System.out.print("*  ");
//                     else
//                         System.out.print("   ");
//                 }
//             }
//             System.out.println(); // move to next line
//         }
//     }
// }

//        for(intj=n/2;j>0;--j)
// class Solution {
//     public boolean isPalindrome(String s) {
//         int left = 0, right = s.length() - 1;
        
//         while (left < right) {
           
//             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                 left++;
//             }
            
//             while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                 right--; 
//             }
            
            
//             if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                 return false;
//             }
            
//             left++;
//             right--;
//         }
        
//         return true;
//     }
// } 
//ternary operator      
// public class javabascics{
//     public static void main(String[]args){
//         int num=3;
//         String type = ((num%2)==0)?"sum":"dum";
//         System.out.println(type);
        
//     }

// }
// import java.util.*;
// public class javabasics{
//   public static void main (String args[]){
//     Scanner sc= new Scanner(System.in);
//     int a =sc.nextInt();
//     int b =sc.nextInt();
//     char operator=sc.next().charAt(0);
//   switch(operator){
//     case'+' :System.out.println(a+b);
//     break;
//   case'-' :System.out.println(a-b);
//     break;
//   case'/' :System.out.println(a/b);
//     break;
//   case'*' :System.out.println(a*b);
//     break;
  
//     }sc.close();
//   }
// }

// public class javabascics{
//     public static void main(String[] args) {
//         int num=0;
//         while(num<10){
//             System.out.println("dgd");
//             num++;
//         }
//     }
// }
// public class javabasics{
//     public static void main(String[] args) {
//         int n=10899;
//         while(n>0){
//             int lastdigit=n%10;

//             System.out.println(n);
//             n=n/10;

//         }

//     }
// }
// public class javabasics{
//     public static void main(String[] args) {
//         int n=10899;
//         int rev=0;
//         while(n>0){
//             int lastdigit=n%10;
//            rev=(rev*10)+lastdigit;
            
//             n=n/10;
//             System.out.println(rev);

//         }
//     }
// }

public class javabascics{
    public static void main(String[] args) {
        String n = "utkarsh";
        String reverse = new StringBuilder(n).reverse().toString();
        System.out.println( reverse);
    }
}
