class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] arr = new int[26];
        for(char c:chars.toCharArray()){
            arr[c-'a']++;
        }
        int count=0,flag=0;
        for(String s:words){
            int[] a=new int[26];
            for(int i=0;i<arr.length;i++){
                a[i] = arr[i];
            }
            flag=0;
            for(char c:s.toCharArray()){
                if(a[c-'a']==0){
                    flag=1;
                    break;
                }
                a[c-'a']--;
            }
            if(flag==0){
                count+=s.length();
            }
        }
        return count;
    }
}
