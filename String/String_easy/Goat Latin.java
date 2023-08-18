class Solution {
    public String toGoatLatin(String s) {
        StringBuilder arr=new StringBuilder();
        String[] words=s.split(" ");
        int count=1;
        for(String word:words){
                if(isVowel(word.charAt(0))){
                    arr.append(word).append("ma").append("a".repeat(count++)).append(' ');
                }else{
                    arr.append(word.substring(1,word.length())).append(word.charAt(0)).append("ma").append("a".repeat(count++)).append(' ');
                }
            }
        return arr.toString().trim();
    }
    public boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
}
