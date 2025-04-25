class Solution {
    public int removeDuplicates(int[] nums) {
      int e=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=nums[e]){
            e++;
            nums[e]=nums[i];
        }
      }
      return e+1;
    }
}