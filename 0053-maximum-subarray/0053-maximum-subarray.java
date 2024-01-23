class Solution {
    public int maxSubArray(int[] nums) {
       //solving it using dp with O(n) space complexity
        
        int [] table=new int[nums.length+1];
        int max=nums[0];
        table[0]=nums[0];
        int n=nums.length;
        
        //Now filling up the table
        
        for(int i=1;i<n;i++)
        {
            table[i]=Math.max(table[i-1]+nums[i],nums[i]);
            max=Math.max(max,table[i]);
        }
        return max;
    }
}