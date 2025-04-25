class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row;
        int column; 
        int n=triangle.size(); 
        int[][] memo=new int[n][n];
        for(int i=0;i<memo.length;i++){
            for(int j=0;j<=i;j++){
                memo[i][j]=-1;
            }
        }
        return helper(triangle,0,0,memo);
    }
    public int helper(List<List<Integer>> triangle,int row,int column,int[][] memo){
        if(row==triangle.size()) return 0;   
        if(memo[row][column]!=-1) return memo[row][column]; 
        int c1=helper(triangle,row+1,column,memo);
        int c2=helper(triangle,row+1,column+1,memo);
        memo[row][column]=triangle.get(row).get(column)+Math.min(c1,c2); 
        return memo[row][column];
    }
}  