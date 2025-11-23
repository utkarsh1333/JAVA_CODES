// public class pattern {
//     public static void main(String[] args) {
        
//         for(int l=4;l>=1;l--){
//         for(int i=4;i>=l;i--){
//             System.out.print("*");
//         }
   
    
//     System.out.println();
// }
// }}

//inverted star
// import java.util.*;
// public class pattern{
    
//     public static void main(String[] args) {
//         int n=4;
//         for (int i=1;i<=4;i++){
//             for (int j=1;j<=n-i+1;j++){
//                 System.out.print("*");
//             }
//            System.out.println();
//         }
        
//     }
// }

//hallf no pyramid

// public class pattern{
//     public static void main(String[] args) {
    
//     C{
//         for(int j=1;j<=i;j++){
//             System.out.print(j);
            
//         }
//         System.out.println();    }
//     }
// }
//CHARACTER PYRAMID
// public class pattern{
//     public static void main(String[] args) {
//       char  ch='A';
//       for(int i=1;i<=4;i++){
// for(int j=1;j<=i;j++){
//     System.out.print(ch);
//     ch++;
// }
// System.out.println();
//       }

//     }
// }\\
//HOLLOW RECTANGLE PATTERN
// public class pattern{
//     public static void rectangle(int rows,int cols){
//         for (int i=1;i<=rows;i++){
//             for (int j=1;j<=cols;j++){
//                 if(i==1||j==1||i==rows||j==cols){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[]args){
// rectangle(4,5);
//     }
// }
public class pattern{
    public static void main(String[] args) {
        int n=4;
      int  num=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
System.out.print(j);


            }

            System.out.println();
        }
    }
}

