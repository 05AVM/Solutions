class Solution {
    public int rob(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        return solve(mp,nums,nums.length-1);
        
    }
    private int solve (HashMap<Integer,Integer> ma,int []nums,int i){
        //base cases:
        if (i==0)
            return nums[0];
        if(i==1)
            return Math.max(nums[0],nums[1]);
        if(i==2)
             return Math.max(nums[0] + nums[2], nums[1]);
        if(ma.containsKey(i))
            return ma.get(i);
        
        int take=solve(ma,nums,i-2)+nums[i];
        int dtake=solve(ma,nums,i-1);
        
        ma.put(i,Math.max(take,dtake));
        
        return ma.get(i);
        
    }
    
}