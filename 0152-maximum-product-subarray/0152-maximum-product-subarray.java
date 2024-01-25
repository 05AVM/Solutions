class Solution {
    public int maxProduct(int[] nums) {
        // solving it using dp and with TC-O(n) and SC-O(n)
        int []max=new int[nums.length];
        int []min=new int[nums.length];
        
        Arrays.fill(max,0);
        Arrays.fill(min,0);
        
        max[0]=nums[0];
        min[0]=nums[0];
        
        for(int i=1;i<nums.length;i++){
            int elem=nums[i];
            int ch1=elem;
            
            int ch2=elem*max[i-1];
            int ch3=elem*min[i-1];
            
            max[i]=Math.max(Math.max(ch1,ch2),ch3);
            min[i]=Math.min(Math.min(ch1,ch2),ch3);
        }
        int result = max[0];
        for (int i = 1; i < max.length; i++) {
            result = Math.max(result, max[i]);
        }

        return result;
           
}
}