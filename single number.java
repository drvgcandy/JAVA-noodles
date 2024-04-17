//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        for (int i=0;i<nums.length-1;i+=2) {
            if (nums[i]!=nums[i + 1]) {
                return nums[i];
            }
        }
        
        return nums[nums.length - 1];
    }
}
