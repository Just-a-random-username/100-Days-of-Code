//LEETCODE : 34. Find First and Last Position of Element in Sorted Array

class Day6 {
    public int[] searchRange(int[] nums, int target)  {
        int l = nums.length;
        int first=-1,last=-1;
        if (l==0){
            return new int[]{-1,-1};
        }
        if (nums[l-1]==target){
            last = l-1;
        }if (nums[0]==target){
            first=0;
        }if (first>=0&&last>=0){
            return new int[]{first,last};
        }if (target<nums[0]||target>nums[l-1]){
            return new int[]{-1,-1};
        }
        
        int index=0;
        float len = (l-1);
        float pivot = (l-1);
        while (first<0||last<0){
            if(nums[(int)pivot]==target){
                if (first==-1&&nums[(int)pivot-1]!=target){
                    first = (int)pivot;
                }if (last==-1&&nums[(int)pivot+1]!=target){
                    last = (int)pivot;
                }if (first==-1){
                    pivot--;
                }else if (last==-1){
                    pivot++;
                }
            }else{
                if (nums[(int)pivot]<target){
                    if ((int)pivot==(int)(pivot+len/2)){
                        break;
                    }
                    pivot = pivot+len/2;
                    len=len/2;
                }else{
                    if ((int)pivot == (int)(pivot-len/2)){
                        break;
                    }
                    pivot = pivot - len/2;
                    len = len/2;
                }
            }
        }return new int[]{first,last};
    }
}
