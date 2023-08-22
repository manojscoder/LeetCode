class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder arr=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int n1=0;
            int n2=0;
            if(i>=0){
                n1=num1.charAt(i--)-'0';
            }
            if(j>=0){
                n2=num2.charAt(j--)-'0';
            }
            int num=(n1+n2+carry)%10;
            carry=(n1+n2+carry)>9?1:0;
            arr.append(num);
        }
        return arr.reverse().toString();
        
    }
}

