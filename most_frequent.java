import java.util.*;
public class most_frequent {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,2,5,6,2,2,3,4,5};
        int minc=1;
        int curc=1;
        int ele=arr[0];
        Arrays.sort(arr);

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                curc++;
            }
            else{
                curc=1;
            }
            if(curc>minc){
                minc=curc;
                ele=arr[i];
            }


        }
        System.out.println(minc);
        System.out.println(ele);
    }
    
}
