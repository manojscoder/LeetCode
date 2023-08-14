class Solution {
    public String[] findWords(String[] words) {
        int[] rows={2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        ArrayList<String> arr=new ArrayList<>();
        for(String s:words){
            String s1=s.toLowerCase();
            boolean isValid=true;
            int row=rows[s1.charAt(0)-'a'];
            for(int i=0;i<s1.length();i++){
                if(rows[s1.charAt(i)-'a']!=row){
                    isValid=false;
                    break;
                }
            }
            if(isValid){
                arr.add(s);
            }
        }
        return arr.toArray(new String[0]);
    }
}
