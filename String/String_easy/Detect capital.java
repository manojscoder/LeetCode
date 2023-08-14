class Solution {
    public boolean detectCapitalUse(String w) {
        if(w.length()==1)
            return true;
        if((int)w.charAt(0)<96 && (int)w.charAt(1)<96){
            for(int i=2;i<w.length();i++){
                if((int)w.charAt(i)>96){
                    return false;
                }
            }
        }
        else{
            for(int i=1;i<w.length();i++){
                if((int)w.charAt(i)<96){
                    return false;
                }
            }
        }
        return true; 
    }
}
