class Solution {
    public int rob(int[] nums) {
        int[] memo=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            memo[i]=-1;
        }
        return helper(nums,0,memo); 
    }
    public int helper(int[] house,int index,int[] memo){
        if(index>=house.length) return 0; 
        if(memo[index]!=-1) return memo[index];                    
        int indexloot=house[index]+helper(house,index+2,memo);
        int notloot=helper(house,index+1,memo);    
        memo[index]=Math.max(indexloot,notloot);
        return Math.max(indexloot,notloot);
    }  
} 