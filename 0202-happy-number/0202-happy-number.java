class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h=new HashSet<>();
        while(n!=1 && !h.contains(n)){
            h.add(n);
            int count=0;    
        while(n>0){
            int rem=n%10;
            count+=rem*rem;
            n/=10;
        }
        n=count;
        }
        
 
        return n==1;
    }
}