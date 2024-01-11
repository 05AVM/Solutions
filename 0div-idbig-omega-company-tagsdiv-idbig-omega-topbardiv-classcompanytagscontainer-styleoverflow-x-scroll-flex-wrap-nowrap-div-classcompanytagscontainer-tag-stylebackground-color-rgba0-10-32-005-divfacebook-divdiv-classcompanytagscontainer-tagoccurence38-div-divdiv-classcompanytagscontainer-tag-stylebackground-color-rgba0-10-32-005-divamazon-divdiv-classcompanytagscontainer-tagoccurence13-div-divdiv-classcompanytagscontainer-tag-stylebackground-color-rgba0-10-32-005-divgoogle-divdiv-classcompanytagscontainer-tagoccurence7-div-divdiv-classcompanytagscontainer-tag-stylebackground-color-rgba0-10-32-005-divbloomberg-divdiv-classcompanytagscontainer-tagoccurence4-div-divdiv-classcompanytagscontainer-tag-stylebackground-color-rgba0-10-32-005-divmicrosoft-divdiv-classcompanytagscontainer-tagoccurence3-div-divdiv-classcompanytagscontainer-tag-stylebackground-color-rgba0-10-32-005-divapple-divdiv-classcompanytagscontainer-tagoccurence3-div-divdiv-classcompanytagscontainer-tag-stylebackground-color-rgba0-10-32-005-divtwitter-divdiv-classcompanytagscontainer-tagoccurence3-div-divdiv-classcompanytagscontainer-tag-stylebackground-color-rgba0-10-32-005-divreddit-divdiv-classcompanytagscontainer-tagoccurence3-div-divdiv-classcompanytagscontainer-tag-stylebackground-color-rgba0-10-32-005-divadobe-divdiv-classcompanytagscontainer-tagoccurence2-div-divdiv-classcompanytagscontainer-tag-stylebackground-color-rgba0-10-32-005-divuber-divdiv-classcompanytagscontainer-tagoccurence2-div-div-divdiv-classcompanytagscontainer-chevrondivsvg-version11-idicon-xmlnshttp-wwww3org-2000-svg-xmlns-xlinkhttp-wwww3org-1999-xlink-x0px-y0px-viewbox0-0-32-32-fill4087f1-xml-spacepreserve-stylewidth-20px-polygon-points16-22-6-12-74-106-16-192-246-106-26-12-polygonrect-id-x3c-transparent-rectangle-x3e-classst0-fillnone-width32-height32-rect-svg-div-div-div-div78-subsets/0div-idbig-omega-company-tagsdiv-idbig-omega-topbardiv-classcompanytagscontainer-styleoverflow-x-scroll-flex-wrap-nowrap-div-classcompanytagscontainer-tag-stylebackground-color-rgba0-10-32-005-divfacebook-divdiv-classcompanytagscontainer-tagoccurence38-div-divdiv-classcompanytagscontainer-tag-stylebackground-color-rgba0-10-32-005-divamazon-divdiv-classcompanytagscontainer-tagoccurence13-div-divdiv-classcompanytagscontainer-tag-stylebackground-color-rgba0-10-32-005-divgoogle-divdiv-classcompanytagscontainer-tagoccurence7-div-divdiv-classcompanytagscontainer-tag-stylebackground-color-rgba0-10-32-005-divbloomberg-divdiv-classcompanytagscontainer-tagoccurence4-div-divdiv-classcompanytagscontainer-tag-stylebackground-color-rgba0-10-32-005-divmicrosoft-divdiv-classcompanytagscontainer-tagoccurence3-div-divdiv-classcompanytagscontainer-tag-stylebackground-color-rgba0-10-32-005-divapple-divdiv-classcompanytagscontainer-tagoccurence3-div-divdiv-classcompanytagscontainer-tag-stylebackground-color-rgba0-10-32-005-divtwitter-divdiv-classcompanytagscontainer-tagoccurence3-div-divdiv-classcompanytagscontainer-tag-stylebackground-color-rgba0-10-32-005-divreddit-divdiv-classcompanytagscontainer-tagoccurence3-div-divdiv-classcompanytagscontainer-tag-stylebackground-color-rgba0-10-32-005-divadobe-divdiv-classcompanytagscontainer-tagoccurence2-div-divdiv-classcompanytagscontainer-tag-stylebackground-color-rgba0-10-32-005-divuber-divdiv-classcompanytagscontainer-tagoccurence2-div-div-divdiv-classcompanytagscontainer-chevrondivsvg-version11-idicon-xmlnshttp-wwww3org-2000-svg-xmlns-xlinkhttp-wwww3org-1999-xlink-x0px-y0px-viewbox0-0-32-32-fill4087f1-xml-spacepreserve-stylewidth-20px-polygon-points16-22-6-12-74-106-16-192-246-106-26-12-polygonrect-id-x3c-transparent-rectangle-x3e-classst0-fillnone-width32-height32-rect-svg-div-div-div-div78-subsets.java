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
        res.add(new ArrayList<>(currentSubset));

        // Explore all possible subsets starting from the current index
        for (int i = index; i < nums.length; i++) {
            // Include the current element in the subset
            currentSubset.add(nums[i]);

            // Recursively generate subsets with the current element included
            calsub(nums, i + 1, currentSubset, res);

            // Exclude the current element to backtrack and explore other possibilities
            currentSubset.remove(currentSubset.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.subsets(nums);
        System.out.println(result);
    }
}