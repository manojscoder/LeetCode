class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(j!=i && words[j].contains(words[i])){
                    arr.add(words[i]);
                    break;
                }
            }
        }
        return arr;
    }
}
