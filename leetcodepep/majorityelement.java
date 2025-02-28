https://leetcode.com/problems/majority-element/
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
      Arrays.sort(nums);
      return nums[n/2];
    }
}