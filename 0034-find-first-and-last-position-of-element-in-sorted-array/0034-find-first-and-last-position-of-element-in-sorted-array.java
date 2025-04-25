class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int[] result={-1,-1};
        boolean found=false;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                 result[0]=mid;
                 found=true;
                 high=mid-1;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(!found) return result;
           low=0;
           high=nums.length-1;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                 result[1]=mid;
                 low=mid+1;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
         }
         return result;
    }
}