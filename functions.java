// import java.util.*;
// public class functions {
//     public static int calsum(int num1,int num2){//(parameters or formal arameters)
//         int sum=num1+num2;
//         return sum;
//     }
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in) ;  
//      int a=sc.nextInt();
//      int b=sc.nextInt();
//      int sum=calsum(a,b);//(when we call function these are arguments or actual parameters)
//      System.out.println(sum);

//     }
// }
// import java.util.*;
// public class functions{
//     public static  int mul(int a,int b){
//         int nul=a*b;
//         return nul;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//        int n= mul(a, b);
//        System.out.println(n);
        
//     }
// }
//decimal to binary
// public class functions{
//     public static void dectoint(int n){
//         int pow=0;
//        int bin=0;
//        while(n>0){
//         int rem=n%2;
//         bin=bin+(rem* (int)Math.pow(10,pow));
//         pow++;
//         n=n/2;


//        }
//        System.out.println(bin);

//     }
//     public static void main(String[] args) {
//         dectoint(10);
//     }
// }
//average of three numbers
// import java.util.*;
// public class functions{
//     public static int averag (int a,int b,int c){
        
//         int n=(a+b+c)/3;
       
// return n;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//        int  b=sc.nextInt();
//         int c=sc.nextInt();
//         System.out.println(averag(a,b,c));
//     }
// }

public class functions{
    public static void main(String[] args) {
       int n=5677;
       int rev=0;
     while(n>0){ 
        int rem=n%10;
        rev=(rev*10)+rem;
        n=n/10;
        
    }
    System.out.println(rev);
    }
}