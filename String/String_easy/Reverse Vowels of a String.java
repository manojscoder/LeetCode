public class Solution {
public String reverseVowels(String s) {
    int start=0,end=s.length()-1;
    String s1="aeiouAEIOU";
    char[] vowels=s.toCharArray();
    while(start<end){
        while(start<end && !s1.contains(vowels[start]+"")){
            start++;
        }
        while(start<end && !s1.contains(vowels[end]+"")){
            end--;
        }
        char temp=vowels[start];
        vowels[start++]=vowels[end];
        vowels[end--]=temp;
    }
    return new String(vowels);
}
}
