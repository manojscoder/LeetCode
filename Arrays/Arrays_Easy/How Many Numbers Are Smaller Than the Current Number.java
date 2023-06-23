class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[102];
        for(int i:nums)
            ans[i+1]++;
        for(int i=1;i<102;i++)
            ans[i]+=ans[i-1];
        for(int i=0;i<nums.length;i++)
                nums[i]=ans[nums[i]+1]-(ans[nums[i]+1]-ans[nums[i]]);
        return nums;
    }
}
