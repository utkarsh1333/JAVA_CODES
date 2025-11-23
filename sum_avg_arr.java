public class sum_avg_arr {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int sum=0;
        int avg=0;

        for(int i=0;i<a.length;i++){
sum=sum+a[i];
 avg= sum/(a.length);

        }
System.out.println(sum);
System.out.println(avg);

    }
    
}
