class Solution {
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
        
        int [][]dp=new int[n+1][m+1];
          for (int rows[] : dp)
            Arrays.fill(rows, -1);

        
        return countSubseq(s,t,m-1,n-1,dp);
    }
    public int countSubseq(String s1,String s2,int ind1,int ind2,int [][]dp){
        //baase case
        
        if(ind2<0)
            return 1;//we have match all the charaters of s2 with s1..
        else if(ind1<0)
            return 0;//we have check all characters of S1 but not able to match S1..
        if(dp[ind2][ind1]!=-1)
            return dp[ind2][ind1];
        
        else if(s1.charAt(ind1)==s2.charAt(ind2))
            dp[ind2][ind1]= countSubseq(s1,s2,ind1-1,ind2-1,dp) + countSubseq(s1,s2,ind1-1,ind2,dp);
        else 
            dp[ind2][ind1]= countSubseq(s1,s2,ind1-1,ind2,dp);
        
        return dp[ind2][ind1];
        
    }
}

//TC- O(2^n)
//SC-O(2^n)