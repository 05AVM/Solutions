class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        @cache
        
        def unpath(i,j):
            if(i==m-1):
                return 1
            elif j==n-1:
                return 1
            
            return unpath(i+1,j)+unpath(i,j+1)
        return unpath(0,0)
        