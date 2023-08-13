class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0,len=columnTitle.length();
        if(columnTitle.length()==1)
            ans=columnTitle.charAt(0)-'A'+1;
        else{
            for(int i=0;i<columnTitle.length();i++){
                ans+=((columnTitle.charAt(i)-'A'+1)*(Math.pow(26,len-i-1)));
            }
        }
        return ans;
    }
}
