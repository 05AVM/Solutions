class Solution {
    public int minDistance(String word1, String word2) {
         int i = word1.length() - 1;
         int j = word2.length() - 1;
        
        int [][] dp=new int[i+1][j+1];
        for(int [] row:dp)
            Arrays.fill(row,-1);
        
        return helper(i, j, word1, word2,dp);
    }
    
    public int helper(int i, int j, String word1, String word2,int [][]dp) {
        if (i < 0)
            return j + 1;
        else if (j < 0)
            return i + 1;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        if (word1.charAt(i) == word2.charAt(j))
            return  dp[i][j] = helper(i - 1, j - 1, word1, word2,dp);
        else {
            int insert = helper(i, j - 1, word1, word2,dp);
            int delete = helper(i - 1, j, word1, word2,dp);
            int replace = helper(i - 1, j - 1, word1, word2,dp);
             return dp[i][j]=1 + Math.min(insert, Math.min(delete, replace));
    }
        
}
}