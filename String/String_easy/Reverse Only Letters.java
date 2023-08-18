class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder arr=new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<j){
            if(!isAlpha(s.charAt(i))){
                i++;
                continue;
            }else if(!isAlpha(s.charAt(j))){
                j--;
                continue;
            }else{
                arr.setCharAt(i,s.charAt(j));
                arr.setCharAt(j--,s.charAt(i++));
            }
        }
        return arr.toString();
    }
    public boolean isAlpha(char c){
        return ((c>='a' && c<='z')||(c>='A' && c<='Z'));
        }
    
}
