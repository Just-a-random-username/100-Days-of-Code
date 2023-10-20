// LEETCODE : 6. Zigzag Conversion

class Day11{
    public static String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }
        String[] s1 = new String[numRows];
        for (int i =0;i<numRows;i++){
            s1[i]="";
        }boolean dir=true;
        int i = 0;
        int k = 0;
        int l = s.length();
        if (numRows==l){
            return s;
        }
        while (k<l){
            s1[i]+=s.charAt(k);
            k++;
            if (i==numRows-1){
                dir=false;
            }if (i==0){
                dir=true;
            }
            if (dir){
                i++;
            }else{
                i--;
            }
        }
        String ans = "";
        for (String x:s1){
            ans=ans+x;
        }
        return ans;
    }
}