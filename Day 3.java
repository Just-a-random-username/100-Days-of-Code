// LEETCODE : 19. Remove Nth Node From End of List


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
class Day3 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int count = 0;
        if (curr.next==null){
            count++;
        }
        while (curr.next!=null){
            curr=curr.next;
            count++;
            if (curr.next==null){
                count++;
                break;
            }
        }int l = count-n;
        int x = 0;
        curr = head;
        if (count==n){
            return head.next;
        }
        while (x!=l-1){
            curr = curr.next;
            x++;
        }ListNode L=curr;
        curr.next = L.next.next;
        return head;
    }
}
