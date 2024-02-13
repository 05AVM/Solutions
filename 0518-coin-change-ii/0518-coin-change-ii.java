class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
    dp[0] = 1; // Base case: there is one way to make amount 0, i.e., by using no coins
    
    for (int coin : coins) {
        for (int i = coin; i <= amount; i++) {
            dp[i] += dp[i - coin];
        }
    }
    
    return dp[amount];
    }
   
}

