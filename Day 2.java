// LEETCODE : 28. Find the Index of the First Occurrence in a String

class Day2 {
    class Solution {
        public int strStr(String haystack, String needle){
            int l1 = haystack.length();
            int l2 = needle.length();
            int index = -1;
            if (l2>l1){
                return -1;
            }
            for (int i = 0;i<l1;i++){
                if (haystack.charAt(i)==needle.charAt(0)){
                    if (l2+i>l1){
                        return -1;
                    }else{
                        if (haystack.substring(i,l2+i).equals(needle)){
                            index =i;
                            break;
                        }
                    }
                }
            }return index;
        }
    }
}