// LEETCODE : 121. Best Time to Buy and Sell Stock

class Day12 {
    public static int maxProfit(int[] prices){
        int l = prices.length;
        int a = 0;
        int m = 0;
        for (int i = 0;i<l;i++){
            int x = prices[m];
            int y = prices[i];
            if (y<x){
                m=i;
                continue;
            }else{
                a = (a<y-x)?y-x:a;
            }
        }
        return a;
    }
}