class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest=-1,temp=0;
        for(int[] i:accounts){
            for(int j:i)
                temp+=j;
            if(richest<temp)
                richest=temp;
            temp=0;
        }
        return richest;
    }
}
