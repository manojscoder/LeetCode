class Solution {
    public int diagonalSum(int[][] mat) {
        int len=mat.length,sum=0;
        for(int i=0;i<len;i++){
            sum+=mat[i][i];
            sum+=mat[i][len-i-1];
        }
        if(len%2!=0)
            return sum-mat[len-(len+1)/2][len-(len+1)/2];
        return sum;
    }
}
