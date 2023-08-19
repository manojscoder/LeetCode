class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> arr=new ArrayList<>();
        String[] a=text.split(" ");
        for(int i=0;i+2<a.length;i++){
            if(a[i].equals(first) && a[i+1].equals(second)){
                arr.add(a[i+2]);
            }
        }
        return arr.toArray(new String[0]);
    }
}
