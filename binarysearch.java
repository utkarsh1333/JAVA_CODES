public class binarysearch {
    public static int binary(int marks[],int key){
       int start=0,end=marks.length-1;
       while(start<=end){
        int mid=((start+end)/2);
        if(key==marks[mid]){
            return mid;
        }
        if(key>marks[mid]){
            start=mid+1;
            
        }
        else{
            end=mid-1;
        }
        
       }
       return -1;
    }
    public static void main(String[] args) {
        int marks[]={2,4,6,8,10,12,14};
        int key=88;
System.out.println(binary(marks,key));
    }
    
}
