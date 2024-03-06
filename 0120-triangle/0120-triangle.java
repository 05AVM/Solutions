class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        
        if(arr.size()==1)
            return arr.get(0).get(0);
        
        int sz=arr.size();
        int []dp=new int[sz+1];
        
        for(int i=sz-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                int currVal=arr.get(i).get(j);
                dp[j]=Math.min(dp[j],dp[j+1])+currVal;
                
            }
        }
        return dp[0];
        
    }
}