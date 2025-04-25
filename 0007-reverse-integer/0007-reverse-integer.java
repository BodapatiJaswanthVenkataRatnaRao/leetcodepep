class Solution {
    public int reverse(int x) {
        int count=0;
        while(x!=0){
            int rem=x%10;
            x=x/10;
            if(count>Integer.MAX_VALUE/10 || count==Integer.MAX_VALUE/10 && rem>7 ){
                return 0;
            }
                if(count<Integer.MIN_VALUE/10|| count==Integer.MIN_VALUE/10 && rem<-8){
                    return 0;
                }
            count=count*10+rem;
        }
        return count;
    }
}