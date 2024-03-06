class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
         int sum=0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1); //to handle the case when subarray starts from 0..
        
        //iterate through the array..
        
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem=sum%k;
            
            // if the remainder is already in the map and the subarray lwngth is >=2
            
            if(hm.containsKey(rem) && i-hm.get(rem)>=2)
            {
            return true;
            }
            hm.putIfAbsent(rem,i);
        }
        return false;//if no valid subarray found.
        
    }
}