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
// public class patter{
// public static void pyra(int n){
//     for (int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for (int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
//     public static void main(String[] args) {
//         pyra(4);

//     }}
// 
// inverted half pyramid with numbers
// public class patter{
//     public static void inverted_half_num_pyra(int n){
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i+1);j++){
// System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//         inverted_half_num_pyra(5);
//     }
// }
//FLOYD'S TRIANGLA
// public class patt{
//     public static void floyd(int n){
//         int counter=1;
//         for(int i=1;i<=n;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print(counter+" ");
//                 counter++;
//             }
        
           
// System.out.println();
//     }}
//     public static void main(String[] args) {
//     floyd(5);

        
//     }
// }

//0-1 triangle
// public class patt{
//     public static void main(String[] args) {
//         triangle(5);
        
//     }
//     public static void triangle(int n){
//         for (int i = 1; i <= n; i++) {
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//             }
            
//         }

//     }
// public class patter{
//     public static void main(String[] args) {
//       butter(4);  
//     }
//     public static void butter(int n){
//  //upper half       
// for (int i=1;i<=n;i++){
//     //for stars
//     for (int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     //for space
//     for (int j=1;j<=2*(n-i);j++){
//     System.out.print(" ");

//     }
//     //for stars
//     for (int j=1;j<=i;j++){
//                 System.out.print("*");}
//                  System.out.println();
               
// }
// for (int i=n;i>=1;i--){
//     //for stars
//     for (int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     //for space
//     for (int j=1;j<=2*(n-i);j++){
//     System.out.print(" ");

//     }
//     //for stars
//     for (int j=1;j<=i;j++){
//                 System.out.print("*");}

//    System.out.println();
//     }
// }}

//RHOMBUS PATTERN
// public class patter{
//     public static void rhombus(int n){
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//         }
//         System.out.println();}
//     }
//     public static void main(String[] args) {

//         rhombus(5);
//     }
// }
