//right shift

// public class rotate_by_k {
//     public static void main(String[] args) {

//         int arr[]={1,2,3,4,5,6,7};
//         int k=3;
//         rotate(arr,k);
//         for (int x : arr) System.out.print(x + " ");
       
//     }
// public static void rotate(int arr[],int k){
//     rev(arr,0,arr.length-1);
//     rev(arr,k+1,arr.length-1);
//     rev(arr,0,k);


// }
//      public static void rev(int[]arr,int start,int end){
//         while(start<end){
//         int temp=arr[start];

//          arr[start]=arr[end];
//          arr[end]=temp;
//          start++;
//          end--;
//         }
//         }
    
// }


//left shift
public class rotate_by_k {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr,k);
        for (int x : arr) System.out.print(x + " ");
       
    }
public static void rotate(int arr[],int k){
    rev(arr,0,arr.length-1);
    rev(arr,0,k-1);
    rev(arr,k,arr.length-1);


}
     public static void rev(int[]arr,int start,int end){
        while(start<end){
        int temp=arr[start];

         arr[start]=arr[end];
         arr[end]=temp;
         start++;
         end--;
        }
        }
    
}
