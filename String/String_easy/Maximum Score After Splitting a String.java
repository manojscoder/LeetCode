class Solution {
    public int maxScore(String s) {
        int max = 0, count_zero = 0, count_one = 0;
        for(char c:s.toCharArray()){
            if(c == '1'){
                count_one++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            char c = s.charAt(i);
            if(c == '0'){
                count_zero++;
            }else{
                count_one--;
            }
            max = Math.max(max, count_zero + count_one);
        }
        return max;
    }
}
