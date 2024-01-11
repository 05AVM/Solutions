class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        int index = 0;
        calsub(nums, index, currentSubset, res);
        return res;
    }

    private static void calsub(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> res) {
        // Add the currentSubset to the result
        if (index == nums.length) {
            res.add(new ArrayList<>(currentSubset));
            return;
        }
        // Include the current element in the subset
        currentSubset.add(nums[index]);

        // Recursively generate subsets with the current element included
        calsub(nums, index + 1, currentSubset, res);

        // Exclude the current element to backtrack and explore other possibilities
        currentSubset.remove(currentSubset.size() - 1);

        // Recursively generate subsets without the current element
        calsub(nums, index + 1, currentSubset, res);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.subsets(nums);
        System.out.println(result);
    }
}