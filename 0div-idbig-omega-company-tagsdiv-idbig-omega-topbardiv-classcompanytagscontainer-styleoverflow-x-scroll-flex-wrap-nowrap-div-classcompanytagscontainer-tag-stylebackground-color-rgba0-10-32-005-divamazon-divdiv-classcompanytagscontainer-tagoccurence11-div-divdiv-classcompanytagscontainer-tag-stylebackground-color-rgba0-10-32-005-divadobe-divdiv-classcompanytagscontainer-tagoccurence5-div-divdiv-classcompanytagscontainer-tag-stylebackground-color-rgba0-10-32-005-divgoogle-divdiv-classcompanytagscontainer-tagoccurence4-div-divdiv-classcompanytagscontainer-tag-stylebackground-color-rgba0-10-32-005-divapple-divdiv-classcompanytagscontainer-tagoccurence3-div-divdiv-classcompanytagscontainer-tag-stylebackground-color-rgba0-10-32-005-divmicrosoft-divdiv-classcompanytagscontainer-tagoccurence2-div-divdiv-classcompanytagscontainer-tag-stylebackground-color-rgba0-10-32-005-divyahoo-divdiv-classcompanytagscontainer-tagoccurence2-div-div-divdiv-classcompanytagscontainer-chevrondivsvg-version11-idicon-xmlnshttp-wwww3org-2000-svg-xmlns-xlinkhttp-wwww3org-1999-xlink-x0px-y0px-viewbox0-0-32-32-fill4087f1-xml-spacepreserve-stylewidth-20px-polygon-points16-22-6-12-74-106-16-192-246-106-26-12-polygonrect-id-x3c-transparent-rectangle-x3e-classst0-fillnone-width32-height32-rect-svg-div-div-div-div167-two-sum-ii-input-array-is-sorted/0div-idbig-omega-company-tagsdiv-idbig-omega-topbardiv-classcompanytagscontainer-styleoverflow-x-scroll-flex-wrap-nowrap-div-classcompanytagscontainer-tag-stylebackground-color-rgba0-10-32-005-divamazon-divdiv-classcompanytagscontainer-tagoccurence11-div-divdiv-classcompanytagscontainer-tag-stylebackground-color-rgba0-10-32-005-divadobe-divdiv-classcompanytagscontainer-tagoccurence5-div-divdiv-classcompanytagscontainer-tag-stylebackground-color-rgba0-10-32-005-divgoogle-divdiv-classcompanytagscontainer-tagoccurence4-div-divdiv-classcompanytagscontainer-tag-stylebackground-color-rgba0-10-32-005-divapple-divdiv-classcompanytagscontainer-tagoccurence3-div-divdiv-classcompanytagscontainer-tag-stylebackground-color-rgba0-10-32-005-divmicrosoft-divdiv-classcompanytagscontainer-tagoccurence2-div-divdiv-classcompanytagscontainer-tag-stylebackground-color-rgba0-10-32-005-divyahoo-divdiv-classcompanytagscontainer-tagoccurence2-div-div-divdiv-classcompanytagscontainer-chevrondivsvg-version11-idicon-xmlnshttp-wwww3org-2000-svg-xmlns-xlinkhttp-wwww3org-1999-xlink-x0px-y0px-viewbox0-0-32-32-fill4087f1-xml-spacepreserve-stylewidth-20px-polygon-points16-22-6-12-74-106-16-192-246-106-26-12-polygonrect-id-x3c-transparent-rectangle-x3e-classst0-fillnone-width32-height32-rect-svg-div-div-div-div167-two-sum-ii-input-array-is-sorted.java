class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]==target){
                res[0]=l+1;
                res[1]=r+1;
                l+=1;
                r-=1;
            }
            else if(nums[l]+nums[r]<target){
                l+=1;
                
            }
            else
                r-=1;
        }
        return res;
        
    }
}