import java.util.*;
class Main {
    public static void main(String[] args) {        
      int n=-12345;
      int res=reverse(n);
      System.out.println(res);
      
    }
    public static int reverse(int n){
      int count=0;
      while(n!=0){
          int rem=n%10;  
          n=n/10;
          if(count>Integer.MAX_VALUE/10 && count==Integer.MAX_VALUE/10 && rem>7){
              return 0;
          }
          if(count<Integer.MIN_VALUE/10 && count==Integer.MIN_VALUE/10 && rem<-8){
              return 0;
          }
          
          count=count*10+rem;
     
      }
        
        return count;
    }
}