public class largestinarray {
    public static int large(int marks[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++){
            if(largest<marks[i]){
                largest=marks[i];
            }
        }
        return largest;
   
    }
    public static void main(String []args){
int marks[]={1,2,3,4,5,6};
 System.out.println(large(marks));
    }
    
}
