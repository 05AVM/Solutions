class Solution {
    public int searchInsert(int[] nums, int target) {
         int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                // This block should be inside the 'else' part
                if (target > nums[mid]) {
                    start = mid + 1;
                }
            }
        }

        // If the loop exits, it means the target is not in the array
        // The correct position to insert is 'start'
        return start;
    }
}