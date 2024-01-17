class Solution {
    public int longestConsecutive(int[] nums) {
        //int n=nums.length;
        //Arrays.sort(nums);
          //if (nums == null || nums.length == 0) {
            //return 0;
        //}

        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
            if (!hs.contains(num - 1)) { // Start counting from the smallest element in a sequence,also to check that a number lesser than that exists or not if it doesn't then we iterate it further..
                int currentNum = num;
                int currentStreak = 1;//beacuse num is also a part of the subsequence..

                while (hs.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
        
    }
}