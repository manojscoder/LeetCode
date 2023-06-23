class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0,ruleK=0;
        if(ruleKey.equals("color")) ruleK=1;
        if(ruleKey.equals("name")) ruleK=2;
        for(int i=0;i<items.size();i++)
            count+=items.get(i).get(ruleK).equals(ruleValue)?1:0;
        return count;
    }
}
