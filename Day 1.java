// LEETCODE : 14. Longest Common Prefix


class Day1 {
    public String longestCommonPrefix(String[] strs)  {
        int l = 0;
        boolean condition = false;
        while(true){
            if (strs.length==1){
                return strs[0];
            }
            for (int i = 0 ; i < strs.length;i++){
                if (l<strs[i].length()){
                    char c = strs[0].charAt(l);
                    if (c!=strs[i].charAt(l)){
                        condition = true;
                        break;
                    }
                }else{
                    condition = true;
                    break;
                }
            }
            if (condition){
                break;
            }else{
                l++;
            }
        }return strs[0].substring(0,l);
    }
}