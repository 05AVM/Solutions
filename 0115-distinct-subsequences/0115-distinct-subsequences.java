class Solution {
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
        
       
        
        return countSubseq(s,t,n,m);
        
    }
    public int countSubseq(String s1,String s2,int n,int m){
       int dp[][] = new int[m + 1][n + 1];
        
        // Initialize the first column to 1 because an empty string s2 is a subsequence of any string s1
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        // Initialize the first row (except dp[0][0]) to 0 because there's no way to form s1 from an empty string s2.
        for (int i = 1; i <= n; i++) {
            dp[0][i] = 0;
        }

        // Fill the dp array using a bottom-up approach
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // If the characters match, we can either include this character in the subsequence
                    // or exclude it. So, we add the counts from both possibilities.
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    // If the characters don't match, we can only exclude this character.
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }
}

//Memoized version..
//TC- O(m*n)
//SC-O(n*m)+O(n+m) //recursion stack space of n+m and array size n*m;