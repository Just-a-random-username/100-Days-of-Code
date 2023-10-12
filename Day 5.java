// LEETCODE : 58. Length of Last Word

class Day5 {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int len = 0;
        int i=s.length()-1;
        while (i>=0){
            if (s.charAt(i)==' '){
                return len;
            }else{
                len++;
                i--;
            }
        }return len;
    }
}
