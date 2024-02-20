class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n; // No need to remove duplicates if array has 0 or 1 elements
        
        int index = 2; // Start from the third element
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[index - 2]) { // Check if current element is different from the element at index-2
                nums[index++] = nums[i]; // Update the array with the current element
            }
        }
        
        return index;
        
    }
}