class Solution {
    public int balancedStringSplit(String s) {
        int count = 0,R = 0,L = 0;
        for(char c:s.toCharArray()){
            if(R == L && R != 0){
                count++;
                R = L = 0;
            }
            if(c == 'R'){
                R++;
            }else{
                L++;
            }
        }
        if(R == L){
            count++;
        }
        return count;
    }
}
