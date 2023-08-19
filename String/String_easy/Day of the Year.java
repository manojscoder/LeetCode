class Solution {
    public int dayOfYear(String date) {
        int ans = 0;
        int[] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int month = Integer.parseInt(date.substring(5,7));
        int year = Integer.parseInt(date.substring(0,4));
        int day = Integer.parseInt(date.substring(8,10));
        for(int i=0;i<month;i++){
            ans+=arr[i];
        }

        if(LY(year) && month>2){
            return ans + 1 + day;
        }
        return ans + day;
    }

    public boolean LY(int yr){
        if((yr%4 == 0 && yr%100 != 0) || (yr%100 == 0 && yr%400 == 0)){
            return true;
        }
        return false;
    }
}
