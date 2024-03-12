class Solution {
    public int findTargetSumWays(int[] nums, int target) {
         return targ(nums, 0, 0, target);
    }
    
    public int targ(int[] nums, int ind, int sum, int target) {
        if (ind == nums.length)
            return sum == target ? 1 : 0;
        else
            return targ(nums, ind + 1, sum + nums[ind], target) + targ(nums, ind + 1, sum - nums[ind], target);
    }
}