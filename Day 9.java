// LEETCODE : 70. Climbing Stairs

class Solution {
    public int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int i =3;int x=3;
        int a = 1,b=2;
        while (i<=n){
            x = a+b;
            a=b;
            b=x;
            i++;
        }return x;
    }
}