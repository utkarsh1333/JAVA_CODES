public class count_even {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
       int even_count =0;
       int odd_count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even_count++;
            }
            else{
                odd_count ++;
            }
        }
        System.out.println(odd_count);
        System.out.println(even_count);
    }
    
}
