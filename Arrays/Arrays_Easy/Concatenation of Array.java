class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        int i=-1;
        while(++i<nums.length){
            ans[i+nums.length]=ans[i]=nums[i];
        }
        return ans;
        
    }
}
