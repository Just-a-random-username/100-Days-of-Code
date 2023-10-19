// LEETCODE : 525. Contiguous Array 

class Day10 {
    public static int findMaxLength(int[] nums) {
        int a = 0;
        int s = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0,-1);
        for (int i = 0;i<nums.length;i++){
            if (nums[i]==0){
                s--;
            }else{
                s++;
            }
            if (m.containsKey(s)){
                a = Math.max(a,i-m.get(s));
            }else{
                m.put(s,i);
            }
        }
        return a;
    }
}
