class Solution {
    public void sortColors(int[] nums) {
        int zcount=0;
        int ocount=0;
        int tcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zcount++;
            }
            if(nums[i]==1){
                ocount++;
            }
            if(nums[i]==2){
                tcount++;
            }
        }
        for(int i=0;i<zcount;i++){
            nums[i]=0;
        }
        for(int i=zcount;i<zcount+ocount;i++){
            nums[i]=1;
        }
        for(int i=zcount+ocount;i<nums.length;i++){
            nums[i]=2;
        }
    }
}