class Solution {
    public String generateTheString(int n) {
        StringBuilder arr = new StringBuilder();
        for(int i=0;i<n-1;i++){
            arr.append('a');
        }
        if(n%2==0){
            arr.append('z');
        }else{
            arr.append('a');
        }
        return arr.toString();
    }
}
