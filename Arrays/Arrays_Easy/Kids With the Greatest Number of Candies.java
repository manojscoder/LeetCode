class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i,max = candies[0];
        List<Boolean> arr=new ArrayList<>();
        for (i=1;i<candies.length;i++)
            if (candies[i]>max)
                max=candies[i];
        for(i=0;i<candies.length;i++)
            arr.add(candies[i]+extraCandies>=max);
        return arr;
    }
}
