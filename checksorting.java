public class checksorting{
    public static void main(String[] args) {
        boolean sorted=true;
        int arr[]={1,2,3,4,5};
        for (int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                 sorted=false;
                 break;
            }
        }

    }
}