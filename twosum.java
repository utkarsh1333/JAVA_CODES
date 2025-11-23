public class twosum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=17;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for (int j=i;j<arr.length;j++){

                int end=j;
               if (arr[start]+arr[end]==target){
                System.out.println(arr[i]+","+arr[j]);
               }
            }

        }
        

        
    }
    
}
