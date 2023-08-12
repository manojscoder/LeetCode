class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ' && ans>0)
                break;
            ans+=s.charAt(i)!=' '?1:0;
        }
        return ans;
    }
}
