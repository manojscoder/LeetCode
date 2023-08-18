class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int last=0;
        for(int i=0;i<typed.length();i++){
            if(last==name.length() && name.charAt(last-1)!=typed.charAt(i))
                return false;
            else if(last<name.length() && name.charAt(last)==typed.charAt(i))
                last++;
            else if(last>0 && last<name.length() && name.charAt(last-1)!=typed.charAt(i))
                return false;
            else if(last==0 && name.charAt(0)!=typed.charAt(0))
                return false;
            
        }
        if(last==name.length())
            return true;
        return false;
        
    }
}
