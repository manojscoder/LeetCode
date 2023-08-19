class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        int end=-1;
        for(char c:s.toCharArray()){
            if(end>=0 && arr[end] == c){
                end--;
            }else{
                arr[++end] = c;
            }
        }
        return String.valueOf(arr,0,end+1);
    }
}
