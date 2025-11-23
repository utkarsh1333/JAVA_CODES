public class fetch_oddeven {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};

        int even[]=new int[arr.length];
        int e=0;
          
          for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
              
                even[e]=arr[i];
               e++;
            }
               

            }
          
          for(int j=0;j<e;j++){
            System.out.print(even[j]);


          }
    }
    
}
