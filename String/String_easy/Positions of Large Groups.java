class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> arr=new ArrayList<>();
        int i=1,start=0;
        char last=s.charAt(0);
        while(i<s.length()){
            if(last != s.charAt(i)){
                if(i-start>=3){
                    List<Integer> a=new ArrayList<>();
                    a.add(start);
                    a.add(i-1);
                    arr.add(a);
                }
                start=i;
                last=s.charAt(i);
            }
            i++;
        }
        if(i-start>=3){
            List<Integer> a=new ArrayList<>();
            a.add(start);
            a.add(i-1);
            arr.add(a);
        }
        return arr;
    }
}
