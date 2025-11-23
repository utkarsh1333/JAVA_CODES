// import java.util.Scanner;

// public class factorial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
        
//         long factorial = 1;
//         for(int i = 1; i <= number; i++) {
//             factorial=factorial*i;
//         }

//         System.out.println("Factorial of " + number + " is: " + factorial);
//         sc.close();
//     }
// }
// import java.util.Scanner;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum=sum+i;
                
            }
           
        }
         System.out.println(sum);

        }
    }
        