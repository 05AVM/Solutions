class Solution {
    public int maxProduct(int[] nums) {
        // solving it using dp and with TC-O(n) with O(1) appraoch
        //int []max=new int[nums.length];
        //int []min=new int[nums.length];
        
        //Arrays.fill(max,0);
        //Arrays.fill(min,0);
        
        int max=nums[0];
        int min=nums[0];
        int ans=nums[0];
        
        for(int i=1;i<nums.length;i++){
            int elem=nums[i];
            int ch1=elem;
            
            int ch2=elem*max;
            int ch3=elem*min;
            
            max=Math.max(Math.max(ch1,ch2),ch3);
            min=Math.min(Math.min(ch1,ch2),ch3);
            ans=Math.max(ans,max);
        }
        return ans;
        
           
}
}