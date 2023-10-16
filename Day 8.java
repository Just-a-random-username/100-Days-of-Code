// LEETCODE : 125. Valid Palindrome

class Day8{
    public boolean isPalindrome(String s) {
        if (s.trim().isEmpty()){
            return true;
        }
        s=s.toLowerCase();
        int a = 0,b = s.length()-1;
        while (a<b){
            char c1 = s.charAt(a);
            char c2 = s.charAt(b);
            if ((c1 >= '0' && c1 <= '9') || (c1 >= 'a' && c1 <= 'z')){
                if((c2 >= '0' && c2 <= '9') || (c2 >= 'a' && c2 <= 'z')){
                    if (c1==c2 || c1==c2+32||c1==c2-32){
                        a++;b--;
                    }else{
                        return false;
                    }
                }else{
                    b--;
                }
            }else{
                a++;
            }
        }return true;
    }
}