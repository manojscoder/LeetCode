class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int[] ans=new int[101];
        for(int i:nums)
            ans[i]+=1;
        for(int i:ans)
            count+=(i*(i-1)/2);
        return count;
    }
}
