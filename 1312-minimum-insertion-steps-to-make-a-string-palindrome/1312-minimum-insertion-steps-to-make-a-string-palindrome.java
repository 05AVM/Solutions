class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        int m = sb.reverse().length();
        String t=sb.toString();
        int [][]dp=new int[n+1][m+1];
        //first row initilaisation....
        for (int i = 0; i <=n; i++) {
    for (int j = 0; j <=m; j++) {
       if(i==0 || j==0)
           dp[i][j]=0;
        
        else if (s.charAt(i - 1) == t.charAt(j - 1))
             dp[i][j]=1 + dp[i - 1 ][j - 1];
        else
            dp[i][j]= Math.max(dp[i - 1][j], dp[i] [j - 1]);
    }
        }
        return n-dp[n][m];
    }
}