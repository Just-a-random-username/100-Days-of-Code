// LEETCODE : 21. Merge Two Sorted Lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Day4 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        if (list1==null && list2==null){
            return null;
        }
        if (list1==null){
            return list2;
        }if (list2==null){
            return list1;
        }
        if (list1.val<list2.val){
            ans.val = list1.val;
            list1=list1.next;
        }else{
            ans.val = list2.val;
            list2=list2.next;
        }ListNode x=ans;
        while (true){
            if (list1==null && list2==null){
                return ans;
            }
            if (list1==null){
                x.next = list2;
                return ans;
            }else if (list2 == null){
                x.next = list1;
                return ans;
            }if (list1==null && list2==null){
                return ans;
            }if (list1.val<list2.val){
                x.next = new ListNode(list1.val);
                list1=list1.next;
                x=x.next;
            }else{
                x.next = new ListNode(list2.val);
                list2=list2.next;
                x=x.next;
            }
        }
    }
}