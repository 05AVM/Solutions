class Solution {
    public int rob(int[] nums) {
        //edge case for handling single house
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        
        // For the first case, we consider robbing from house 0 to house n-2
        int case1 = robRange(nums, 0, nums.length - 2);
        
        // For the second case, we consider robbing from house 1 to house n-1
        int case2 = robRange(nums, 1, nums.length - 1);
        
        // Return the maximum amount among the two cases
        return Math.max(case1, case2);
    }
    
    // Helper function to recursively calculate the maximum amount from a range of houses
    private int robRange(int[] nums, int start, int end) {
        int prevMax = 0;
        int currMax = 0;
        
        for (int i = start; i <= end; i++) {
            int temp = currMax;
            currMax = Math.max(prevMax + nums[i], currMax);
            prevMax = temp;
        }
        
        return currMax;
    
    
    }
}