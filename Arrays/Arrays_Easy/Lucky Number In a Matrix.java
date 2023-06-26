class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            int minIndex=minInRow(matrix,i);
            int value=matrix[i][minIndex];
            if(maxInCol(value,minIndex,matrix))
                arr.add(matrix[i][minIndex]);
        }
        return arr;
    }

   public int minInRow(int[][] matrix,int Index)
    {
        int min=matrix[Index][0],minIndex=0;
        for(int i=1;i<matrix[Index].length;i++)
        {
            if(min>matrix[Index][i])
            {
                min=matrix[Index][i];
                minIndex=i;
            }
        }
        return minIndex;
    }

    public boolean maxInCol(int value,int Index,int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            if(value<matrix[i][Index])
                return false;
        }
        return true;
    }
}
