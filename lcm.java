public class lcm {
    public static void main(String[] args) {
        int a=5;
        int b=15;
        int lcm=0;
       
        
        for(int i=1;i<=a*b;i++){
            if((i%a==0)&&(i%b==0)){
 lcm =i;
System.out.println(i);
               break;
              
               

            }
        }
         
    }
    
}
