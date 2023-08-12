class Solution {
    public String convertToTitle(int n) {
       StringBuilder result=new StringBuilder();
       while(n-->0){
           result.insert(0,(char)(65 + n % 26));
           n/=26;
       }
       return result.toString();
    }
}
