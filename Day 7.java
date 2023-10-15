// LEETCODE : 66. Plus One

class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        while (true){
            digits[i]++;
            if (digits[i]!=10){
                break;
            }
            if (i == 0){
                int[] ans = new int[digits.length+1];
                ans[0]=1;
                return ans;
            }
            digits[i]=0;
            i--;
        }return digits;
    }
}