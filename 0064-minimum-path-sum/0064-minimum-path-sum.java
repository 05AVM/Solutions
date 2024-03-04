class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;//no of the row
        int n=grid[0].length;//nof  of a column
        
        // minimum path sum for each cell of the first row..
        
        for(int i=1;i<m;i++)
        {
            grid[i][0]+=grid[i-1][0];
        }
        
        // minimum path sum for the each cell of the first column..
        
        for(int j=1;j<n;j++){
            grid[0][j]+=grid[0][j-1];
        }
        
        //minimum path sum for the rest of the grid
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        
        return grid[m-1][n-1];
    }
}