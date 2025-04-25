class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int left=0;
        int right=nums.length-1;
        if(nums[left] != nums[left+1]) return nums[left];    
        if(nums[right] != nums[right-1]) return nums[right];
        while(left<=right){
           int mid=(left+right)/2;
            if(nums[mid]==nums[mid+1]){
                if(mid%2==0){
                left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            else if(nums[mid]==nums[mid-1]){
                if((mid-1)%2==0){
                    left=mid+1;
                }     
                else{
                    right=mid-1;
                }
            }
            else{
                return nums[mid];
            }
        }  
      return -1; 
    }
}